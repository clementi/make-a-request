package example;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class App {
    public static void main(String[] args) throws IOException {
        var client = new OkHttpClient();

        var request = new Request.Builder().url("https://httpbin.org/anything").addHeader("Accept", "application/json")
                .build();

        try (var response = client.newCall(request).execute()) {
            System.out.println(response.body().string());
        }
    }
}
