import httpclient

proc main() =
  var client = newHttpClient()
  echo client.getContent("https://httpbin.org/anything")

main()
