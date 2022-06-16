# Dockerizing Spring Boot + Mongo DB

Containerization of Spring Boot App, Mongo DB and Rabbit MQ

Only Docker is necessary.

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

with body
```json
{ "firstName": "Alan", "lastName": "Walker", "emailId": "on@my.way" }
```

## Update Employee Rest API - PUT HTTP Request 
PUT http://localhost:8089/api/v1/employees/{id} 

with body
```json
{ "firstName": "Alan", "lastName": "Walker", "emailId": "on@your.way" }
```

## Delete Employee Rest API - Delete HTTP Request 
DELETE http://localhost:8089/api/v1/employees/{id}

## Get All Employee Rest API - Get HTTP Request 
GET http://localhost:8089/api/v1/employees

## Rabbit MQ Admin - http://localhost:15672 with credentials. 

**User**: guest 

**Pass**: guest

## Rabbit MQ Test
POST http://localhost:8089/order/taj

with body
```json
{
"name" : "Sandwitch",
"qty" : 2,
"price" : 212
}
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## References
https://www.javaguides.net/2019/12/spring-boot-mongodb-crud-example-tutorial.html

https://javatodev.com/docker-compose-for-spring-boot-with-mongodb/

https://dev.to/atharvasiddhabhatti/spring-boot-publisher-subscriber-rabbit-mq-using-docker-117a

## License
[GNU General Public License v3.0](https://github.com/raphaelzana/mongodb/blob/main/LICENSE)