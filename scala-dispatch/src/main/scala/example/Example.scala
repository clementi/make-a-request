package example

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

import dispatch._

object Example extends App {
  val service = host("httpbin.org") / "anything"
  val response = Http.default(service OK as.String)

  response.map(println)
}
