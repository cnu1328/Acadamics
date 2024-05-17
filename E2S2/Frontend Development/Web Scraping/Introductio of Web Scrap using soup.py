"""
import requests
from bs4 import BeautifulSoup
 
result = requests.get("https://www.google.com/")

print(result.status_code)

#print(result.headers)
src = result.content

#print(src)

soup = BeautifulSoup(src, 'lxml')

links = soup.find_all("a")
#print(links)

for link in links:
    if "About" in link.text:
        print(link)
        print(link.attrs['href'])
"""

"""
import requests
from bs4 import BeautifulSoup

result = requests.get("https://www.whitehouse.gov/briefings-statements/")
#print(result)

src = result.content

soup = BeautifulSoup(src, 'lxml')

urls  = []

for h2_tag in soup.find_all("h2"):
    a_tag = h2_tag.find('a')

    if a_tag is not None:
        urls.append(a_tag.attrs['href'])

print(urls)

"""

#Objects in BeautifulSoup
from bs4 import BeautifulSoup

html_doc = """
<html><head><title>The Dormouse's story</title></head>
<body>
<p class="title"><b>The Dormouse's story</b></p>

<p class="story">Once upon a time there were three little sisters; their names:
<a href="http://example.com/elsie" class="sister" id="link1">Elsie</a>,
<a href="http://example.com/lacie" class="sister" id="link2">Lacie</a> and
<a href="http://example.com/tillie" class="sister" id="link3">Tillie</a>;
and they lived at the bottom of a well.</p>

<p class="story">...</p>

<b class="boldest">Extremely bold</b>
<blockquote class="boldest">Extremely bold</blockquote>
<b id="1">Test 1</b>
<b another-attribute="1" id="verybold">Test 2</b>
"""

with open('index.html', 'w') as f:
    f.write(html_doc)

soup = BeautifulSoup(html_doc, 'lxml')
#print(soup.prettify())

#print(soup.b)
#print(soup.p)
#print(soup.find_all('b'))

#print(soup.b.name)

#tag = soup.b
#print(tag)

#tag.name = "blockquote"
#print(tag)

#Arrtibutes:

#tag = soup.find_all('b')[2]
#print(tag)

#print(tag['id'])

tag = soup.find_all('b')[3]
#print(tag)

#print(tag['id'])
#print(tag['another-attribute'])
print(tag.attrs)

#print(tag)
#tag['another-attribute'] = 2
#print(tag)

#del tag['id']
#del tag['another-attribute']
#print(tag)

print(tag)
print(tag.string)

tag.string.replace_with("This is another String")

print(tag)

