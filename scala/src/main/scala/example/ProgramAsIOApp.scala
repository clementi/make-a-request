package example

import cats.effect.IOApp
import cats.effect.IO
import scala.io.Source
import scala.io.Codec
import cats.effect.ExitCode
import cats.effect.Console.io._

object ProgramAsIOApp extends IOApp {
  override def run(args: List[String]): IO[ExitCode] = for {
    result <- get("http://httpbin.org/anything")
    _ <- putStrLn(result)
  } yield ExitCode.Success

  private def get(url: String): IO[String] = IO {
    Source.fromURL(url)(Codec.UTF8).mkString
  }
}
