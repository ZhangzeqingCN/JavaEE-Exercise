const axios = require('axios');

const config = {
    method: 'get',
    url: 'http://localhost:8080/message',
    headers: {
        'token': '11111'
    }
};

axios(config)
    .then(function (response) {
        console.log(JSON.stringify(response.data));
    })
    .catch(function (error) {
        console.log(error);
    });

