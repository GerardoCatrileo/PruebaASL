import fetch from 'node-fetch';

/*
fetch("http://localhost:8080/numOC")
    .then((respuesta) => {
        return respuesta.json()
    }).then((resp) => {
        console.log(resp);
    })
*/

const body = {a: 1};
const response = await fetch('http://localhost:8080/numOC', {
	method: 'post',
	body: JSON.stringify(body),
	headers: {'Content-Type': 'application/json'}
});
const data = await response.json();

console.log(data);