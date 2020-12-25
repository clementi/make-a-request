package example

import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

import dispatch._

object Example extends App {
  val service = url("https://httpbin.org/anything")
  val response = Http.default(service OK as.String)

  response.map(println)
}
