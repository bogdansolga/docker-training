let express = require('express');
let app = express();

app.get('/', function(request, response) {
    response.send('Hello from NodeJS!');
});

let server = app.listen(3000, function () {
    let host = server.address().address;
    let port = server.address().port;

    console.log('The app is running at http://%s:%s', host, port);
});