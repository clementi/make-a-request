using System;
using RestSharp;

namespace csharp_restsharp
{
    public class Program
    {
        public static void Main(string[] args)
        {
            IRestClient client = new RestClient("https://httpbin.org");

            IRestRequest request = new RestRequest("anything");
            request.AddHeader("Accept", "application/json");

            IRestResponse response = client.Execute(request);
            Console.WriteLine(response.Content);
        }
    }
}
