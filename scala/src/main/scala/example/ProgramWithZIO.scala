package example

import zio.console._
import scala.io.Source
import scala.io.Codec
import zio._

object ProgramWithZIO extends App {
  override def run(args: List[String]): URIO[ZEnv, ExitCode] =
    app.exitCode

  val app = for {
    result <- ZIO.effect(Source.fromURL("http://httpbin.org/anything")(Codec.UTF8).mkString)
    _ <- putStrLn(result)
  } yield ()
}
