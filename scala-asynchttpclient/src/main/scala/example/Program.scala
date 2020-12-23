package example

import scala.jdk.FutureConverters._

import org.asynchttpclient.Dsl._

object Program extends App {
  val response = asyncHttpClient()
    .prepareGet("http://httpbin.org/anything")
    .addHeader("Content-Type", "application/json")
    .execute() // NOTE: This is a Java Future, not a Scala one

  println(response.get().getResponseBody())
}
