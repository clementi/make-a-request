package example

import sttp.client3._

object Hello extends App {
  val request = basicRequest
    .header("Accept", "application/json")
    .get(uri"http://httpbin.org/anything")

  val backend = HttpURLConnectionBackend()
  val response = request.send(backend)

  response.body.map(println)
}
