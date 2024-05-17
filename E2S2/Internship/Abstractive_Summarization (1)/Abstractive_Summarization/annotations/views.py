from django.shortcuts import render
from django.http import JsonResponse
from os import listdir, path
from django.views.decorators.csrf import csrf_exempt
from .utils import *
from TeluguTokenizer.summ_quality_check import *
import json, os
from django.conf import settings
from django.http import HttpResponse, Http404
from django.shortcuts import redirect
import datetime
from .forms import *

debug = False

# Create your views here.
def index_page(request):
	return redirect(load_annotation_files)

def home_page(request):
	return render(request, 'users/home.html')

def about_page(request):
	return render(request, 'users/about.html')

def contact_page(request):
	return render(request, 'users/contact_us.html')

def import_data(request):
	
	base_folder_path = 'static/datasets/'

	form = upload()
	if request.method == "POST":
		form = upload(request.POST,request.FILES)
		if form.is_valid():
			file_ = request.FILES['file']

			output_file_path = base_folder_path + file_.name

			if debug:
				print("File Name: ", file_.name)
				print("Output FilePath: ", output_file_path)
			
			if path.exists(output_file_path):
				return HttpResponse('File Already Exists!')
			else:
				with open(output_file_path, 'wb+') as fp:
					for chunk in file_.chunks():
						fp.write(chunk)

			return HttpResponse("File Uploaded Successfully!")
		else:
			form = upload()
	return render(request, 'tasks/import_data.html', {'form':form})


# Load the annotation files from the task folder
def load_annotation_files(request):
	context = {}

	base_url = 'static/datasets/'
	task_name = 'summ'
	context['task_name'] = task_name

	context['task_folders'] = load_annotation_stats(base_url, task_name)

	if task_name=='summ':
		return render(request, 'tasks/annotation/index.html', context)
	else:
		return render(request, 'tasks/404.html')


# Load the task statistics from the json file
def load_tasks(request, file_name):
	task_name = 'summ'
	
	if debug:
		print("Task Name: ", task_name, "File Name: ", file_name)
	context = {}

	base_url = 'static/datasets/'

	if not file_name.endswith(".jsonl"):
		file_name += ".jsonl"
	json_path = path.join(base_url, file_name)

	context['articles'] = read_jsonl(json_path, return_ids=True)
	context['json_path'] = json_path
	request.session['json_path'] = json_path

	if task_name == 'summ':
		return render(request, 'tasks/annotation/annotate_data.html', context)
	else:
		return render(request, 'tasks/404.html')


def download_data(request, file_name):
	task_name = 'summ'
	
	if debug:
		print("Task Name: ", task_name, "File Name: ", file_name)
	context = {}

	base_url = 'static/datasets/'

	if not file_name.endswith(".jsonl"):
		file_name += ".jsonl"
	json_path = path.join(base_url, file_name)

	context['articles'] = read_jsonl(json_path, return_ids=True)
	context['json_path'] = json_path

	if debug:
		print("Date Time: ", datetime.datetime.now().strftime("%Y-%m-%d_%H-%M-%S"))
	output_file_name = datetime.datetime.now().strftime("%Y-%m-%d_%H-%M-%S") + "_" + os.path.basename(json_path)
	if os.path.exists(json_path):
		with open(json_path, 'rb') as fh:
			response = HttpResponse(fh.read(), content_type="application/vnd.ms-excel")
			response['Content-Disposition'] = 'inline; filename=' + output_file_name 
			return response
	raise Http404


@csrf_exempt
def find_next_id(request):
	
	task_name = request.POST.get('task_name', '')
	if task_name=='':
		task_name = 'summ'

	current_id = request.POST.get('current_id', '')
	next_id = request.POST.get('next_id', '')

	json_path = request.session.get('json_path', '')
	if json_path!="" and path.exists(json_path):
		if next_id=='':
			ids_dict = read_jsonl(json_path, return_ids=True)

			## Find the next article id based on the completion status/ mark for review in headline / current id
			for entry in ids_dict:
				if (current_id!='' and current_id==str(entry['id'])) or (entry.get('status', '')=='completed'):
					continue

				next_id = str(entry['id'])
				break
			
			
			## To load mark for review options in headline when all the articles completed
			if task_name=='headline' and next_id=='':
				for entry in ids_dict:
					if entry.get('status', '')=='success':
						continue

					next_id = str(entry['id'])
					break

		if debug:
			print("Current ID: ", current_id, "\tNext ID: ", next_id)
		context = {}

		context['data'] = read_jsonl(json_path, filter_ids=[next_id])
		context['articles'] = read_jsonl(json_path, return_ids=True)
		if len(context['data'])>0:
			context['data'] = context['data'][0]

		if task_name == 'summ':
			for key in SUMMARIZATION_LABELS:
				if key not in context['data'] and len(context['data'])>0:
					try:
						context['data'][key] = ''
					except:
						print("Error key: ", key)
					
		return JsonResponse(context)


@csrf_exempt
def save_contents(request):

	json_path = request.session.get('json_path', '')
	task_name = request.POST.get('task_name', '')
	if task_name=='':
		task_name = 'summ'
		
	if debug:
		print("Json Path: ", json_path, "\tTaskName: ", task_name)

	if task_name=='summ':
		current_id = str(request.POST.get('current_id', ''))
		label = request.POST.get('label', '')
		content = request.POST.get('content', '')
		next_label = request.POST.get('next_label', '')

		return save_summ_contents(current_id, label, content, next_label, json_path)

	else:
		return JsonResponse({'status': 'error', 'message': 'Task name not specified...Refresh the page and try again!', 'next_article': {}})



### =========================== xxx =====================================
###					Summarization functions
### =========================== xxx =====================================
@csrf_exempt
def sentenciy_text(request):
	text = request.POST.get('text', '')

	sentencified_text = ""
	if text!="":
		sentencified_text = sentencify(text)
	
	return JsonResponse({'sent_text': sentencified_text})


def save_summ_contents(current_id, label, content, next_label, json_path):
	if label in SUMMARIZATION_LABELS and current_id!="" and path.exists(json_path) and content!="":
		update_status = False
		next_label_content = ''

		### Read the json data
		data = read_jsonl(json_path)

		### Update the label contents into the json data
		completion_status = False
		article_contents = {}
		current_index = -1
		for i in range(len(data)):
			if current_id == data[i]['id']:
				article_contents = data[i]
				if label!="text":
					data[i][label] = content
				if next_label in SUMMARIZATION_LABELS:

					next_label_content = data[i].get(next_label, '')

					if next_label_content=='':
						if next_label not in ["summary", "title"]:
							next_label_content = data[i].get(label, '')

							if next_label=="sent_article" or next_label=="sent_summary":
								next_label_content = sentencify(next_label_content)

				
				if label=='title':
					completion_status = annotation_status(data[i], 'summ')
					if debug:
						print("Completion Status: ", str(completion_status))
					if completion_status:
						data[i]['status'] = 'completed'
				update_status = True
				data[i]['last_updated'] = datetime.datetime.now().strftime("%Y-%m-%d_%H-%M-%S")
				current_index = i
				break
		
		comments = ''
		### Checking checked vs sentencified article
		if label=="sent_article":
			checked_content = article_contents.get('checked_article', '')
			sentencified_content = article_contents.get('sent_article', '')
			if not content_validation(checked_content, sentencified_content):
				comments = 'Checked article and Sentencified article contents are not same. The only characters allowed in sentencification is/are `Whitespace` and `Newline`.'
		
		elif label=="sent_summary":
			summary_content = article_contents.get('summary', '')
			summ_sentencified_content = article_contents.get('sent_summary', '')
			if not content_validation(summary_content, summ_sentencified_content):
				comments = 'Summary and Sentencified summary contents are not same. The only characters allowed in sentencification is/are `Whitespace` and `Newline`.'
		
		elif label=="summary":
			checked_content = article_contents.get('checked_article', '')
			summary_content = article_contents.get('summary', '')

			abs_0 = get_abstractivity_score(checked_content, summary_content)
			if debug:
				print("Abstractivity: ", abs_0)

			compression = get_compression_score(checked_content, summary_content)
			if debug:
				print("Compression: ", compression)

			prefix_check = has_prefix(checked_content, summary_content)
			if debug:
				print("Prefix: ", prefix_check)
			
			data[current_index]['abs0'] = abs_0
			data[current_index]['compression'] = compression
			data[current_index]['has_prefix'] = str(prefix_check)

			try:
				abs_0 = float(abs_0)
				if abs_0 < SUMM_CRITERIA['abs0'][0]:
					comments += 'Abstractivity is too low.\n'
				elif abs_0 > SUMM_CRITERIA['abs0'][1]:
					comments += 'Abstractivity is too high.\n'
			except:
				comments += 'Error while computing abstractivity score\n'

			
			try:
				compression = float(compression)
				if compression < SUMM_CRITERIA['compression'][0]:
					comments += 'Compression is too high.\n'
				elif compression > SUMM_CRITERIA['compression'][1]:
					comments += 'Compression is too low.\n'
			except:
				comments += 'Error while computing compression score\n'
			
			try:
				prefix_check = str(prefix_check).title()
				if prefix_check != SUMM_CRITERIA['has_prefix']:
					comments += 'Summary starts with the article starting content(s)\n'
			except:
				comments += 'Error while checking article prefix in summary\n'

		if len(comments)==0:
			### Save the json data
			status = write_as_jsonl(json_path, data)
			
			if status:
				if update_status:
					message = label + ' contents saved successfully'
					if next_label=='checked_article':
						message = label + ' contents copied successfully'
					return JsonResponse({'status': 'success', 'message': message, 'next_label_content': next_label_content, 'completed': str(completion_status)})
				else:
					return JsonResponse({'status': 'warning', 'message': 'Error while saving ' + label + ' contents', 'next_label_content': next_label_content, 'completed': str(completion_status)})
			else:
				return JsonResponse({'status': 'warning', 'message': 'Error while writing contents to file', 'next_label_content': next_label_content, 'completed': str(completion_status)})
		else:
			return JsonResponse({'status': 'error', 'message': comments, 'next_lagel_content': next_label_content, 'completed': str(completion_status)})
	else:
		return JsonResponse({'status': 'warning', 'message': 'Invalid parameters...!', 'next_label_content': '', 'completed': str(completion_status)})