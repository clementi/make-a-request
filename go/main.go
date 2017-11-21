package main

import (
	"fmt"
	"io/ioutil"
	"net/http"
)

func main() {
	resp, err := http.Get("https://httpbin.org/anything")
	if err != nil {
		fmt.Println("Could not make request.")
		return
	}
	defer resp.Body.Close()

	body, err := ioutil.ReadAll(resp.Body)
	if err != nil {
		fmt.Println("Could not read body.")
	}

	fmt.Println(string(body))
}
