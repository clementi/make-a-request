package example

import java.util.concurrent.Future

import org.asynchttpclient.Response

import static org.asynchttpclient.Dsl.asyncHttpClient

class App {
    static void main(String[] args) {
        Future<Response> response = asyncHttpClient()
            .prepareGet("http://httpbin.org/anything")
            .addHeader("Accept", "application/json")
            .execute()

        println(response.get().getResponseBody())
    }
}
