package example

import monix.eval.TaskApp
import cats.effect.ExitCode
import monix.eval.Task
import scala.io.Source
import scala.io.Codec

object ProgramWithMonix extends TaskApp {
  override def run(args: List[String]): Task[ExitCode] = for {
    result <- get("http://httpbin.org/anything")
    _ <- Task { println(result) }
  } yield ExitCode.Success

  private def get(url: String): Task[String] = Task {
    Source.fromURL(url)(Codec.UTF8).mkString
  }
}
