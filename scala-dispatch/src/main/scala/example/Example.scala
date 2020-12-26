package example

import dispatch.Defaults._
import dispatch._

object Example extends App {
  val service = host("httpbin.org") / "anything"
  val response = Http.default(service OK as.String)

  response.map(println)
}
