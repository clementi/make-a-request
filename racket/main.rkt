#lang racket

(require net/http-client)

(define-values (status headers port)
  (http-sendrecv "httpbin.org"
                 "/anything"
                 #:ssl? #t
                 #:method "GET"
                 #:headers (list "Accept: application/json")))

(display (port->string port))
