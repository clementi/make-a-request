package example

import cats.effect.{ExitCode, IO, IOApp}
import org.http4s.MediaType
import org.http4s.Method.GET
import org.http4s.client.blaze.BlazeClientBuilder
import org.http4s.client.dsl.io._
import org.http4s.headers.Accept
import org.http4s.implicits._

import scala.concurrent.ExecutionContext.global

object ProgramAsIOApp extends IOApp {
  override def run(args: List[String]): IO[ExitCode] = {
    BlazeClientBuilder[IO](global).resource
      .use { client =>
        val request = GET(
          uri"http://httpbin.org/anything",
          Accept(MediaType.application.json)
        )
        client.expect[String](request).map(println)
      }
      .as(ExitCode.Success)
  }
}
