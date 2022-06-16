# Dockerizing Spring Boot + Mongo DB

Containerization of Spring Boot App and Mongo DB

## Building application jar file

With installed maven, execute in the root directory of the project

```bash
mvn clean package
```

## Build docker images

With installed docker and docker-compose, execute in the root directory of the project to build images

```bash
docker compose build
```
After generating the images, up the docker-compose.
```bash
docker compose up -d
```

## Create Employee Rest API - Post HTTP Request 
POST http://localhost:8089/api/v1/employees
```json
{ "firstName": "Alan", "lastName": "Walker", "emailId": "on@my.way" }
```

## Update Employee Rest API - PUT HTTP Request 
PUT http://localhost:8089/api/v1/employees/{id} 
```json
{ "firstName": "Alan", "lastName": "Walker", "emailId": "on@your.way" }
```

## Delete Employee Rest API - Delete HTTP Request 
DELETE http://localhost:8089/api/v1/employees/{id}

## Get All Employee Rest API - Get HTTP Request 
GET http://localhost:8089/api/v1/employees


## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## References
https://www.javaguides.net/2019/12/spring-boot-mongodb-crud-example-tutorial.html

https://javatodev.com/docker-compose-for-spring-boot-with-mongodb/

## License
[GNU General Public License v3.0](https://github.com/raphaelzana/mongodb/blob/main/LICENSE)