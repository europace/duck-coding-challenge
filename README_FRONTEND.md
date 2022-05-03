# EP ULA Coding Challenge

### Index

* [Challenge Frontend](#frontend-challenge)
* [Using document test API](#using-the-document-test-api)

### Frontend Challenge

#### Task:

* Create a project which displays and filters the information received by the [Documents API](#using-test-api) via rest
  calls

#### Acceptance Criteria:

* Create a project using `Angular`
* Use the [Documents API](#using-test-api) and display the information
* Create a filter to search a document by `name`
* Describe in a `README.md` file how to run and test your service

#### Bonus points:

* Filter by `category`
* `Sort` by fields e.g. `Name`, `Type`, `Size`, `Deleted`
* `Error Handling` e.g. Display message when the [Documents API](#using-test-api) is not available
* \[...\]

### Using the Document test API

* Requires [Docker](https://www.docker.com/products/docker-desktop/)

1. clone this repository

3. Create the docker image:
   `docker build -t europace/document-api .`

4. Run the docker image:
   `docker run --rm -p 8080:8080 europace/document-api`

5. Example request:
   `curl --location --request GET 'http://localhost:8080/v1/documents'`
