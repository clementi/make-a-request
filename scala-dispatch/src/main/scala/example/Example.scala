package example

import scala.util.Failure
import scala.util.Success

import dispatch.Defaults._
import dispatch._

object Example extends App {
  val service = host("httpbin.org") / "anything"
  val response = Http.default(service OK as.String)

  response.onComplete {
    case Success(body)  => println(body)
    case Failure(cause) => cause.printStackTrace()
  }
}
