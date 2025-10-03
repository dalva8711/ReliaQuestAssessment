# Testing Help

## Unit and/or Integration tests are NOT REQUIRED

### Standards
If you decide to include tests, then please use **JUnit** as the test framework and adhere to standard conventions.

### Resources
This [Spring Web Test tutorial](https://spring.io/guides/gs/testing-web) and [JUnit 5 guide](https://www.baeldung.com/junit-5) could be useful resources!

# My Testing

### Get All Employees
curl http://localhost:8080/api/v1/employee

### Get Employee by UUID
curl http://localhost:8080/api/v1/employee/{paste-existing-uuid-here}

### Create Employees (Success)
curl -X POST http://localhost:8080/api/v1/employee \
-H "Content-Type: application/json" \
-d '{
"firstName": "Alice",
"lastName": "Williams",
"email": "alice.williams@company.com",
"jobTitle": "Data Scientist",
"salary": 90000,
"age": 28
}'

### Create Employees (Error)
curl -X POST http://localhost:8080/api/v1/employee \
-H "Content-Type: application/json" \
-d '{
"firstName": "Bob",
"lastName": "Smith"
}'