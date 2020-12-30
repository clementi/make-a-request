package main

import (
	"fmt"

	client "github.com/bozd4g/go-http-client"
)

func main() {
	httpClient := client.New("https://httpbin.org/")
	request, err := httpClient.Get("anything")
	if err != nil {
		panic(err)
	}

	response, err := httpClient.Do(request)
	if err != nil {
		panic(err)
	}

	fmt.Println(string(response.Get().Body))
}
