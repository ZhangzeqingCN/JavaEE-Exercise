const axios = require('axios');

const config = {
    method: 'get',
    url: 'http://localhost:8080/testMessage',
    headers: {
        'token': '11111'
    }
};

function processResponse(response) {
    console.log(1, 'response');
}

function processError(error) {
    console.log(error);
}

axios(config).then(processResponse).catch(processError);