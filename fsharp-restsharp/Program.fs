open RestSharp

[<EntryPoint>]
let main _ =
    let client = RestClient ("https://httpbin.org")
    let request = RestRequest ("anything")
    request.AddHeader ("Accept", "application/json") |> ignore
    let response = client.Execute (request)
    printfn "%s" response.Content
    0