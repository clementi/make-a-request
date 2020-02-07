package example

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.{HttpMethods, HttpRequest}
import akka.http.scaladsl.unmarshalling.Unmarshal

import scala.concurrent.Await
import scala.concurrent.duration._

object Program extends App {
  implicit val system: ActorSystem = ActorSystem()

  val req = HttpRequest(
    method = HttpMethods.GET,
    uri = "https://httpbin.org/anything"
  )

  val res = Await.result(Http().singleRequest(req), 1.second)
  val body = Await.result(Unmarshal(res.entity).to[String], 1.second)

  println(body)

  Await.result(Http().shutdownAllConnectionPools, 1.second)
  Await.result(system.terminate, 1.second)
}
