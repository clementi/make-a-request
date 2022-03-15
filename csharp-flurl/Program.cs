using Flurl;
using Flurl.Http;

var result = await "https://httpbin.org"
    .AppendPathSegment("anything")
    .SetQueryParams(new { name = "USS Enterprise", registry = "NCC-1701" })
    .GetStringAsync();

Console.WriteLine(result);