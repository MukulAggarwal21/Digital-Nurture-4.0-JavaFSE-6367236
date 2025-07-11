# RESTful Employee Service

This Spring Boot application demonstrates a simple RESTful web service that loads employee data from an XML config and exposes it via REST API.

## Features

- Load employee list from `employee.xml`
- REST API to return all employees

## Endpoints

### GET /api/employees

Returns a list of employees.

Test with:
```
curl http://localhost:8080/api/employees
```

## How to Run

1. Ensure Java 17+ and Maven are installed.
2. Run:
```
mvn spring-boot:run
```