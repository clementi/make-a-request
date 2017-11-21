import "dart:convert";
import "dart:io";

main() async {
    var client = new HttpClient();

    var request = await client.getUrl(Uri.parse("https://httpbin.org/anything"));
    request.headers.set(HttpHeaders.ACCEPT, "application/json");

    var response = await request.close();

    var buffer = new StringBuffer();
    response.transform(UTF8.decoder).listen((data) {
        buffer.write(data);
    }, onDone: () => print(buffer));
}
