import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Headers;

import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        Retrofit retrofit = new     Retrofit.Builder()
                .baseUrl("https://httpbin.org")
                .build();

        HttpBin httpBin = retrofit.create(HttpBin.class);

        Call<ResponseBody> call = httpBin.anything();

        try {
            ResponseBody body = call.execute().body();

            if (body != null) {
                System.out.println(body.string());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private interface HttpBin {
        @GET("/anything")
        @Headers("Accept: application/json")
        Call<ResponseBody> anything();
    }
}
