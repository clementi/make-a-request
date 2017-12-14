axios = require 'axios'

axios.get 'https://httpbin.org/anything'
  .then (resp) ->
    console.log resp.data
  , headers:
      "Accept": "application/json"