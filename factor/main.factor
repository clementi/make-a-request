USING: kernel http.client strings io ;
IN: example

: example-main ( -- ) "https://httpbin.org/anything"
<get-request> http-request >string print drop ;

MAIN: example-main
