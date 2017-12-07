import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Program {
    private static final int BUFFER_SIZE_BYTES = 1024;
    private static final int EOF = -1;

    public static void main(String[] args) {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpUriRequest get = new HttpGet("https://httpbin.org/anything");
            get.addHeader("Accept", "application/json");

            try (CloseableHttpResponse response = client.execute(get)) {
                try (InputStream responseStream = response.getEntity().getContent()) {
                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(responseStream))) {
                        char[] buffer = new char[BUFFER_SIZE_BYTES];
                        StringBuilder content = new StringBuilder();

                        while (reader.read(buffer) != EOF) {
                            content.append(buffer);
                        }

                        System.out.println(content);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
