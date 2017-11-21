import requests

headers = {"Accept": "application/json"}
res = requests.get("https://httpbin.org/anything", headers=headers)

print(res.text)
