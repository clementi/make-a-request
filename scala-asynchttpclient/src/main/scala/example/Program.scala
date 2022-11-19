package example

import scala.concurrent.ExecutionContext.Implicits._
import scala.jdk.FutureConverters._

import org.asynchttpclient.Dsl._

object Program extends App {
  val response = asyncHttpClient()
    .prepareGet("http://httpbin.org/anything")
    .addHeader("Content-Type", "application/json")
    .execute()
    .toCompletableFuture()
    .asScala

  response.map(_.getResponseBody()).map(println)
}
