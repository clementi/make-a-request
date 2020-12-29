package example;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class AppAsync {
    private final static OkHttpClient client = new OkHttpClient();

    public static void main(String[] args) {
        var request = new Request.Builder().url("https://httpbin.org/anything").addHeader("Accept", "application/json")
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                try (var body = response.body()) {
                    System.out.println(body.string());
                }
            }
        });
    }
}
