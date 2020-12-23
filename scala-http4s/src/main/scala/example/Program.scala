package example

import cats.effect.{ContextShift, IO, Timer}
import org.http4s.MediaType
import org.http4s.Method.GET
import org.http4s.client.blaze.BlazeClientBuilder
import org.http4s.client.dsl.io._
import org.http4s.headers.Accept
import org.http4s.implicits._

import scala.concurrent.ExecutionContext.global

object Program extends App {
  implicit val contextShift: ContextShift[IO] = IO.contextShift(global)
  implicit val timer: Timer[IO] = IO.timer(global)

  BlazeClientBuilder[IO](global).resource
    .use { client =>
      val request = GET(
        uri"http://httpbin.org/anything",
        Accept(MediaType.application.json)
      )
      client.expect[String](request).map(println)
    }
    .unsafeRunSync()
}
