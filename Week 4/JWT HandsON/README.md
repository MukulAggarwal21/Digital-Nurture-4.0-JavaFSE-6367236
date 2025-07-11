# JWT Authentication Service

This Spring Boot project implements a simple authentication service that returns a JWT token when valid credentials are provided.

## Run the application

Make sure you have Java 17+ and Maven installed.

```
mvn spring-boot:run
```

## Test the Authentication

Use the following curl command to get a JWT token:

```
curl -s -u user:pwd http://localhost:8090/authenticate
```

If the credentials are valid, the service will return a JSON with a token.

## Technologies Used

- Spring Boot
- Spring Security
- JJWT (io.jsonwebtoken)