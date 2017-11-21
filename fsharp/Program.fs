open System.Net.Http
open System.Net.Http.Headers

[<EntryPoint>]
let main _ =
    use client = new HttpClient ()
    client.DefaultRequestHeaders.Accept.Add (MediaTypeWithQualityHeaderValue ("application/json")) |> ignore
    let responseTask = client.GetAsync ("https://httpbin.org/anything")
    use response = responseTask.Result
    let bodyTask = response.Content.ReadAsStringAsync ()
    let body = bodyTask.Result
    printfn "%s" body
    0