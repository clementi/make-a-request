require 'net/http'

uri = URI('http://httpbin.org/anything')

req = Net::HTTP::Get.new(uri)
req['Accept'] = 'application/json'

res = Net::HTTP.start(uri.hostname, uri.port) do |http|
  http.request(req)
end

puts res.body
