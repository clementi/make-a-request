package example

import cats.effect.{ContextShift, IO, Timer}
import org.http4s.client.blaze._
import org.http4s.implicits._

import scala.concurrent.ExecutionContext.global

object Program extends App {
  implicit val contextShift: ContextShift[IO] = IO.contextShift(global)
  implicit val timer: Timer[IO] = IO.timer(global)

  BlazeClientBuilder[IO](global).resource
    .use(_.expect[String](uri"http://httpbin.org/anything").map(println))
    .unsafeRunSync()
}
