const https = require('https')

const options = {
  hostname: 'httpbin.org',
  path: '/anything',
  headers: {
    "Accept": "application/json"
  }
}

https.get(options, res => {
  res.on('data', data => {
    process.stdout.write(data)
  }).on('error', err => {
    console.error(err)
  })
})
