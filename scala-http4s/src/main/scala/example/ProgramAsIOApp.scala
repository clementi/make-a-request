package example

import cats.effect.{ExitCode, IO, IOApp}
import org.http4s.client.blaze.BlazeClientBuilder
import org.http4s.implicits._

import scala.concurrent.ExecutionContext.global

object ProgramAsIOApp extends IOApp {
  override def run(args: List[String]): IO[ExitCode] = {
    BlazeClientBuilder[IO](global).resource
      .use(_.expect[String](uri"http://httpbin.org/anything").map(println))
      .as(ExitCode.Success)
  }
}
