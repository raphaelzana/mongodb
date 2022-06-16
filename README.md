# mongodb

mvn clean package

docker compose build

docker compose up -d


Create Employee Rest API - Post HTTP Request
POST http://localhost:8089/api/v1/employees

{
    "firstName": "Alan",
    "lastName": "Walker",
    "emailId": "on@my.way"
}


Update Employee Rest API - PUT HTTP Request
PUT http://localhost:8089/api/v1/employees/{id}
{
    "firstName": "Alan",
    "lastName": "Walker",
    "emailId": "on@my.way"
}


Delete Employee Rest API - Delete HTTP Request
DELETE http://localhost:8089/api/v1/employees/{id}

Get All Employee Rest API - Get HTTP Request
GET http://localhost:8089/api/v1/employees


References: https://www.javaguides.net/2019/12/spring-boot-mongodb-crud-example-tutorial.html