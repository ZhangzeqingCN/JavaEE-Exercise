const config = require('./config')

const authBaseUrl = config.baseUrl + "/auth"

fetch(authBaseUrl, {
    headers: {}
}).then(r => r.json()).then(console.log)