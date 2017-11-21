using System;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Threading.Tasks;

namespace csharp
{
    public class Program
    {
        public static void Main(string[] args) => MainAsync().Wait();

        private static async Task MainAsync()
        {
            using (var client = new HttpClient())
            {
                client.DefaultRequestHeaders.Accept.Add(new MediaTypeWithQualityHeaderValue("application/json"));

                using (HttpResponseMessage response = await client.GetAsync("https://httpbin.org/anything"))
                {
                    string body = await response.Content.ReadAsStringAsync();
                    Console.WriteLine(body);
                }
            }
        }
    }
}
