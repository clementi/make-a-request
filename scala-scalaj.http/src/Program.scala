import scalaj.http.Http

object Program extends App {
  override def main(args: Array[String]) {
    println(Http("https://httpbin.org/anything").header("Accept", "application/json").asString.body)
  }
}
