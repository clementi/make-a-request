import httpclient

proc main() =
  let client = newHttpClient()
  client.headers = newHttpHeaders({ "Accept": "application/json" })
  echo client.getContent("https://httpbin.org/anything")

main()
