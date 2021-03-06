# EP ULA Coding Challenge

### Index

* [Challenge Backend](#backend-challenge)
* [Using document test API](#using-the-document-test-api)

### Backend Challenge

#### Task:

* Create a project which outputs and filters the information received by the [Documents API](#using-test-api) via rest
  calls

#### Acceptance Criteria:

* Create a project using `Java` or `Java with Spring Boot`
* Use the [Documents API](#using-test-api) to the received and display (E.g. Console, Rest, ...) following information
    * `Total number` of documents
    * Number of `deleted` documents
    * `Total size` of documents
    * `Average size` of documents
* Create a `filter` to search documents by `category`
* Describe in a `README.md` file how to run and test your service

#### Bonus points:

* Filter by `category`
* `Sort` by fields e.g. `Name`, `Type`, `Size`, `Deleted`
* `Error Handling` e.g. Display message when the [Documents API](#using-test-api) is not available
* \[...\]

### Using the Document test API

* Requires [Docker](https://www.docker.com/products/docker-desktop/)

1. clone this repository

2. Create the docker image:
   `docker build -t europace/document-api .`

3. Run the docker image:
   `docker run --rm -p 8080:8080 europace/document-api`

4. Example request:
   `curl --location --request GET 'http://localhost:8080/v1/documents'`
