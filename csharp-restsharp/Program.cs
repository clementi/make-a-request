using System;
using RestSharp;

namespace csharp_restsharp
{
    public class Program
    {
        public static void Main(string[] args)
        {
            IRestClient client = new RestClient("https://httpbin.org");
            IRestRequest request = CreateRequest("anything");

            IRestResponse response = client.Execute(request);
            Console.WriteLine(response.Content);
        }

        private static IRestRequest CreateRequest(string path)
        {
            IRestRequest request = new RestRequest(path);
            return request.AddHeader("Accept", "application/json");
        }
    }
}
