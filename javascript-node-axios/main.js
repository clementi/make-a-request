const axios = require('axios')

axios.get('https://httpbin.org/anything').then(response => {
  console.log(response.data)
}, {
    headers: {
      "Accept": "application/json"
    }
  })