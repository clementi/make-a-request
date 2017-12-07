import com.github.kittinunf.fuel.httpGet

fun main(args: Array<String>) {
  val (_, _, result) = "https://httpbin.org/anything".httpGet().responseString()
  val (body, _) = result
  println(body)
}
