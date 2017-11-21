import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.CharBuffer;

public class Program {
    private static final int BUFFER_SIZE_BYTES = 1024;
    private static final int EOF = -1;

    public static void main(String[] args) {
        try {
            URL url = new URL("https://httpbin.org/anything");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                char[] buffer = new char[BUFFER_SIZE_BYTES];
                StringBuffer content = new StringBuffer();

                while (reader.read(buffer) != EOF) {
                    content.append(buffer);
                }

                System.out.println(content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
