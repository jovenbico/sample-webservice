# sample-webservice

	$ ./mvnw spring-boot:run

	GET /particpant HTTP/1.1
	Host: localhost:8080
	Content-Type: application/json

	GET /particpant/{id} HTTP/1.1
	Host: localhost:8080
	Content-Type: application/json

	POST /particpant HTTP/1.1
	Host: localhost:8080
	Content-Type: application/json
	{
	    "name": "...",
	    "email": "..."
	}

	PUT /particpant/{id} HTTP/1.1
	Host: localhost:8080
	Content-Type: application/json
	{
	    "name": "...",
	    "email": "..."
	}

	DELETE /particpant/{id} HTTP/1.1
	Host: localhost:8080
	Content-Type: application/json


