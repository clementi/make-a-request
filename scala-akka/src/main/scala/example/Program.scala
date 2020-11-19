package example

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.headers.Accept
import akka.http.scaladsl.model.{HttpRequest, MediaTypes}
import akka.http.scaladsl.unmarshalling.Unmarshal

import scala.concurrent.ExecutionContextExecutor

object Program extends App {
  implicit val system: ActorSystem[Nothing] = ActorSystem(Behaviors.empty, "single-request")
  implicit val ec: ExecutionContextExecutor = system.executionContext

  for {
    resp <- Http().singleRequest(HttpRequest(uri = "https://httpbin.org/anything")
      .addHeader(Accept(MediaTypes.`application/json`)))
    body <- Unmarshal(resp.entity).to[String]
  } yield {
    println(body)
    system.terminate()
  }
}
