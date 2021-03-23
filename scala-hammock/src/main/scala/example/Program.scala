package example

import cats.effect._
import hammock._
import hammock.marshalling._
import hammock.Hammock
import hammock.Method
import hammock.apache.ApacheInterpreter
import hammock.circe.implicits._

object Program extends IOApp {
  override def run(args: List[String]): IO[ExitCode] = {
    implicit val interpreter = ApacheInterpreter.instance[IO]

    for {
      response <- Hammock.request(Method.GET, uri"https://httpbin.org/anything", Map.empty)
        .exec[IO]
      _ <- IO { println(response.entity.content) }
    } yield ExitCode.Success
  }
}
