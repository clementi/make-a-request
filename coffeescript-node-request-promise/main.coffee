request = require 'request-promise'

options =
  uri: 'https://httpbin.org/anything'
  headers:
    "Accept": "application/json"
  method: 'GET',
  resolveWithFullResponse: true

request options
  .then (res) ->
    console.log res.body
  .catch (err) ->
    console.error err
