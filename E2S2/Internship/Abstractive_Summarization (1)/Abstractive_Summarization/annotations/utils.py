from os import path, listdir
import json
import numpy as np
from TeluguTokenizer.summ_quality_check import *

debug = False

SUMM_CRITERIA = {
    "abs0" : [30, 80],
    "compression" : [60, 80],
    "has_prefix" : "False"
}


SUMMARIZATION_LABELS = ["text", "checked_article", "sent_article", "summary", "sent_summary", "title"]


# Read a jsonl file into list-of-dictionaries
def read_jsonl(filename, return_ids=False, filter_ids=[]):
    entries = []
    
    for line in open(filename, 'r', encoding='utf-8'):
        line = json.loads(line)
        if len(filter_ids)==0 or str(line['id']) in filter_ids:
            if return_ids:
                entries.append({'wb_display': line['wb_display'], 'id': line['id'], 'status': line.get('status', '')})
            else:
                entries.append(line)
        
    return entries


# Save list-of-dictionaries as a jsonl file
def write_as_jsonl(out_filename, listOfDicts):
    try:
        with open(out_filename, 'w', encoding='utf-8') as outfile:
            for each in listOfDicts:
                json.dump(each, outfile, ensure_ascii=False)
                outfile.write('\n')
        return True
    except:
        return False


# Load the annotation statistics
def load_annotation_stats(base_url, task_name):
    stats = []
    for file_name in listdir(base_url):

        entry = {}

        file_base = path.basename(file_name)
        file_name_str = file_base.replace('.jsonl', '').replace('.json', '')
        file_path = path.join(base_url, file_base)

        data = read_jsonl(file_path)
        completed, marked = get_completed(task_name, data)
        entry['no_of_samples'] = len(data)

        entry['file_name'] = file_name_str
        entry['completed'] = len(completed)
        entry['marked_for_review'] = len(marked)
        if len(data)==len(completed):
            entry['status'] = 'completed'
        else:
            entry['status'] = 'pending'

        stats.append(entry)

    return stats


def annotation_status(sample, task_name):
    if task_name=='summ':
        if isinstance(sample, dict):
            for key in SUMMARIZATION_LABELS:
                if key not in sample:
                    if debug:
                        print("Key: ", key)
                    return False
            
            if debug:
                print("All labels available")
            
            checked_content = sample.get('checked_article', '')
            sentencified_content = sample.get('sent_article', '')
            if not content_validation(checked_content, sentencified_content):
                return False
            if debug:
                print("Checked article and Sentencified article contents are same")

            summary_content = sample.get('summary', '')
            summ_sentencified_content = sample.get('sent_summary', '')
            if not content_validation(summary_content, summ_sentencified_content):
                return False
            if debug:
                print("Summary contents and sentencified summary contents are same")
            
            checked_content = sample.get('checked_article', '')
            summary_content = sample.get('summary', '')

            abs_0 = get_abstractivity_score(checked_content, summary_content)
            try:
                abs_0 = float(abs_0)
                if abs_0 < SUMM_CRITERIA['abs0'][0] or abs_0 > SUMM_CRITERIA['abs0'][1]:
                    return False
            except:
                return False
            
            if debug:
                print("Abstractivity-0 check passed")
            
            compression = get_compression_score(checked_content, summary_content)
            try:
                compression = float(compression)
                if compression < SUMM_CRITERIA['compression'][0] or compression > SUMM_CRITERIA['compression'][1]:
                    return False
            except:
                return False
            
            if debug:
                print("Compression check passed")
            
            prefix_check = has_prefix(checked_content, summary_content)
            try:
                prefix_check = bool(prefix_check)
                if isinstance(prefix_check, bool):
                    print("yes", str(prefix_check))
                if prefix_check == SUMM_CRITERIA['has_prefix']:
                    return False
            except:
                return False

            if debug:
                print("Prefix check passed")

            return True
    
    if debug:
        print("Sample is not an instance of dict")
    return False


# Get the completed articles count
def get_completed(task_name, data):
    completed = []
    marked_review = []
    for entry in data:
        keys = list(entry.keys())
        check_labels = []

        if task_name=='summ':
            # check_labels = ['wb_display', 'id', 'text', 'checked_article', 'sent_article', 'summary', 'sent_summary', 'title', 'section', 'abs0', 'compression', 'has_prefix']
            check_labels = ['wb_display', 'id', 'text', 'checked_article', 'sent_article', 'summary', 'sent_summary', 'title', 'abs0', 'compression', 'has_prefix']
            if validate_entries(check_labels, entry, task_name, SUMM_CRITERIA):
                completed.append(entry['id'])
        
    return completed, marked_review


# Check whether the labels present in the keys or not
def validate_entries(labels, entry_dict, task_name, criteria = {}):
    keys = list(entry_dict.keys())
    count = 0

    ### Checking the non empty fields
    for label in labels:
        if label in keys:
            if isinstance(entry_dict[label], str):
                if entry_dict[label]!="":
                    count += 1
            elif isinstance(entry_dict[label], list):
                if len(entry_dict[label])>0:
                    count += 1
            elif isinstance(entry_dict[label], (int, float)):
                if entry_dict[label]>=0:
                    count += 1
            else:
                print("\n\nLabel: ", label)

    # print("ID: ", entry_dict['id'], "\tCount: ", count, "\tLen: ", len(labels))
    # print("Keys: ", keys, "\tLabels: ", labels)
    if len(labels)==count:

        if task_name=='summ':
            abs0 = entry_dict['abs0']>=criteria['abs0'][0] and entry_dict['abs0']<=criteria['abs0'][1]
            compression = entry_dict['compression']>=criteria['compression'][0] and entry_dict['compression']<=criteria['compression'][1]
            has_prefix = str(entry_dict['has_prefix']).title()==str(criteria['has_prefix'])

            if debug:
                print("Wb display: ", entry_dict['wb_display'],"\tAbs: ", abs0, "\tCompression: ", compression, "\thas_prefix: ", entry_dict['has_prefix'], "\thas_prefix: ", has_prefix, "\thas_prefix: ", criteria['has_prefix'])

            if abs0 and compression and has_prefix:
                return True
            else:   ### Summary criteria do not pass any one of the above mentioned filters
                return False

        else:
            if debug:
                print('task name error')
            return False

    else:       ### Non empty labels counts do not match
        if debug:
            print('Non empty labels counts do not match')
        return False
    
