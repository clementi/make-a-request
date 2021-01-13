package example

import static org.asynchttpclient.Dsl.asyncHttpClient
import org.asynchttpclient.Response

import java.util.concurrent.Future

class App {
    static void main(String[] args) {
        Future<Response> response = asyncHttpClient()
            .prepareGet("http://httpbin.org/anything")
            .addHeader("Accept", "application/json")
            .execute()

        println(response.get().getResponseBody())
    }
}
