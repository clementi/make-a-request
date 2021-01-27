package example

object Program extends App {
  println(os.proc("curl", "-s", "https://httpbin.org/anything")
    .spawn(stderr = os.Inherit)
    .stdout
    .text)
}
