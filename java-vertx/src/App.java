import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.ext.web.client.HttpResponse;
import io.vertx.ext.web.client.WebClient;

public class App {
    public static void main(String[] args) {
        WebClient client = WebClient.create(Vertx.vertx());

        client.getAbs("https://httpbin.org/anything")
            .putHeader("Accept", "application/json")
            .send(asyncResult -> {
                if (asyncResult.succeeded()) {
                    HttpResponse<Buffer> response = asyncResult.result();

                    System.out.println(response.bodyAsString());
                } else {
                    System.out.println("Error: " + asyncResult.cause().getMessage());
                }
            });
    }
}
