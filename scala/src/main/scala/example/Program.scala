package example

import scala.io.{Codec, Source}

object Program extends App {
  println(Source.fromURL("http://httpbin.org/anything")(Codec.UTF8).mkString)
}
