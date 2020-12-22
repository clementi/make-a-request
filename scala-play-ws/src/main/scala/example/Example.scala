package example

import akka.actor.ActorSystem
import akka.stream.{Materializer, SystemMaterializer}
import play.api.libs.ws._
import play.api.libs.ws.DefaultBodyReadables._
import play.api.libs.ws.ahc.StandaloneAhcWSClient

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object Example extends App {
  implicit val system: ActorSystem = ActorSystem()
  system.registerOnTermination(System.exit(0))

  implicit val metarializer: Materializer = SystemMaterializer(
    system
  ).materializer

  val wsClient = StandaloneAhcWSClient()

  call(wsClient, "http://httpbin.org/anything")
    .map(println)
    .andThen { case _ => wsClient.close() }
    .andThen { case _ => system.terminate() }

  def call(wsClient: StandaloneWSClient, url: String): Future[String] = {
    wsClient
      .url(url)
      .withHttpHeaders(("Content-Type", "application/json"))
      .get()
      .map(_.body[String])
  }
}
