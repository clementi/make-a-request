<img src="https://upload.wikimedia.org/wikipedia/commons/5/5b/HTTP_logo.svg" width="250" data-canonical-src="https://upload.wikimedia.org/wikipedia/commons/5/5b/HTTP_logo.svg" alt="Make a request" />

# Make a Request

## Introduction

This repo demonstrates how to make an HTTP request in several languages. There are more than one example for some languages
such as JavaScript on Node.js, because there are popular third-party libraries that make making HTTP requests simpler.

One of the languages with the simplest way to make an HTTP request is Groovy, in which you can make a request like this:
```groovy
"https://httpbin.org/anything".toURL().getText()
```

## Languages

The following languages have examples:

* [Clojure](http://clojure.org)
    * [clj-http](https://github.com/dakrone/clj-http)
* [CoffeeScript](http://coffeescript.org) on [Node.js](http://nodejs.org)
    * [axios](https://github.com/axios/axios)
    * [request-promise](https://github.com/request/request-promise)
* [C#](https://docs.microsoft.com/en-us/dotnet/csharp/)
    * [RestSharp](http://restsharp.org)
    * System.Net
* [Dart](http://dartlang.org)
* [Elixir](http://elixir-lang.org)
    * [HTTPotion](https://github.com/myfreeweb/httpotion)
* [Erlang](http://erlang.org)
* [F#](https://docs.microsoft.com/en-us/dotnet/fsharp/)
    * RestSharp
    * System.Net
* [Go](http://golang.org)
* [Groovy](http://groovy-lang.org)
* [Haskell](http://haskell.org)
    * [wreq](http://www.serpentine.com/wreq)
* [Java](http://www.oracle.com/technetwork/java)
    * [Apache HTTP Components](https://hc.apache.org/)
    * java.net
    * [Retrofit](https://square.github.io/retrofit/)
    * [Vert.x](http://vertx.io) [Web Client](http://vertx.io/docs/vertx-web-client/java)
* [JavaScript](https://www.javascript.com/) on Node.js
    * axios
    * [request-promise](https://github.com/request/request-promise)
* [Kotlin](http://kotlinlang.org)
    * [Fuel](https://github.com/kittinunf/fuel)
* [Nim](https://nim-lang.org)
* [Python](https://python.org)
    * [aiohttp](http://aiohttp.readthedocs.io)
    * [requests](http://docs.python-requests.org)
* [Racket](https://racket-lang.org)
* [Ruby](https://ruby-lang.org)
* [Scala](https://scala-lang.org)
    * [akka-http](https://akka.io)
    * asynchttpclient
    * [http4s](http://http4s.org)
    * [play-ws](https://github.com/playframework/play-ws)
    * [scalaj-http](https://github.com/scalaj/scalaj-http)
* [TypeScript](https://www.typescriptlang.org) on Node.js
    * request-promise
