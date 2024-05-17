"""Abstractive_Summarization URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/4.1/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.contrib import admin
from django.urls import path
from django.conf import settings
from django.contrib.staticfiles.urls import static
from django.views.generic import RedirectView
import annotations.views as annotation_view

urlpatterns = [

    path('', annotation_view.index_page, name='index_page'),
    path('home/', annotation_view.home_page, name='home'),
    path('about/', annotation_view.about_page, name='about'),
    path('contactus/', annotation_view.contact_page, name='contact_us'),
    path('favicon.ico', RedirectView.as_view(url='/static/images/favicon.ico')),

    #### Import the jsonl file
    path('import/', annotation_view.import_data, name='import_data'),
    # path('upload_file/', annotation_view.upload_file, name='upload_file'),
    

    #### Task annotation files
    path('annotation/', annotation_view.load_annotation_files, name='annotation'),
    path('annotation/<str:file_name>', annotation_view.load_tasks, name='load_tasks'),
    path('fetch_next_article/', annotation_view.find_next_id, name='fetch_next_article'),
    path('save_contents/', annotation_view.save_contents, name='save_contents'),

    path('sentenciy_text/', annotation_view.sentenciy_text, name='sentenciy_text'),


    path('download_data/<str:file_name>', annotation_view.download_data, name='download_data'),

    path('admin/', admin.site.urls),

]

urlpatterns += static(settings.MEDIA_URL, document_root=settings.MEDIA_ROOT)