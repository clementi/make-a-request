const request = require('request-promise')

const options = {
  uri: "https://httpbin.org/anything",
  method: 'GET',
  headers: {
    "Accept": "application/json"
  },
  resolveWithFullResponse: true
}

request(options)
  .then(resp => console.log(resp.body))
  .catch(err => console.error(err))
