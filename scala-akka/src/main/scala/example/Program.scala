package example

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.headers.RawHeader
import akka.http.scaladsl.model.{HttpMethods, HttpRequest}
import akka.http.scaladsl.unmarshalling.Unmarshal

import scala.concurrent.Await
import scala.concurrent.duration._

object Program extends App {
  implicit val system: ActorSystem = ActorSystem()

  val req = HttpRequest(HttpMethods.GET, "https://httpbin.org/anything")
    .addHeader(RawHeader("Accept", "application/json"))

  for {
    res <- Http().singleRequest(req)
    body <- Unmarshal(res.entity).to[String]
  } { println(body) }
  
  Await.result(Http().shutdownAllConnectionPools, 1.second)
  Await.result(system.terminate, 1.second)
}
