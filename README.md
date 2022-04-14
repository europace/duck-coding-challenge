# Test Document API

Simulated document api project

### Requirements
* Java 11 or higher
* Docker

### How to run

1. Build the project:  
`./gradlew clean build`

2. Create the docker image:  
`docker build --build-arg JAR_FILE=build/libs/document-api-1.0.jar -t europace/document-api .`

3. Run the docker image:  
`docker run -d -p 8080:8080 europace/document-api`

### How to request
example request:
```
curl --location --request GET 'http://localhost:8080/v1/documents'
```

example response:
```
[
    {
        "id": "1",
        "name": "document name",
        "size": 10540,
        "type": "PDF",
        "categories": [
            "cat_1",
            "cat_2"
        ],
        "deleted": false,
        "createdAt": "2021-10-16T10:14:41.595",
        "modifiedAt": "2021-10-16T10:14:41.595"
    },
    ...
]
```