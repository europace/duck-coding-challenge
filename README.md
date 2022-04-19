# Document test API

* Requires [Docker](https://www.docker.com/products/docker-desktop/)

1. Create the docker image:
   `docker build -t europace/document-api .`

2. Run the docker image:
   `docker run --rm -p 8080:8080 europace/document-api`

3. Example request:
   `curl --location --request GET 'http://localhost:8080/v1/documents'`
