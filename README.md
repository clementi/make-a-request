# Make a Request

## Introduction

This repo demonstrates how to make an HTTP request in several languages. There are more than one example for some languages
such as JavaScript on Node.js, because there are popular third-party libraries that make making HTTP requests simpler.

One of the languages with the simplest way to make an HTTP request is Groovy, in which you can make a request like this:
```groovy
println("https://httpbin.org/anything".toURL().getText(requestProperties: [Accept: 'application/json']))
```

## Languages

The following languages have examples:

* Clojure with clj-http
* CoffeeScript on Node.js
* CoffeeScript on Node.js with request-promise
* C# with RestSharp
* C#
* Dart
* F# with RestSharp
* F#
* Go
* Groovy
* Haskell with wreq
* Java with Retrofit
* Java
* JavaScript on Node.js with request-promise
* JavaScript on Node.js
* Nim
* Python with requests
* Racket
* Ruby
* Scala with scalaj.http
* TypeScript on Node with request-promise
