import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class App {
    public static void main(String[] args) throws UnirestException {
        HttpResponse<String> response = Unirest.get("http://httpbin.org/anything").asString();
        System.out.println(response.getBody());
    }
}
