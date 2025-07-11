# Country Web Service - Spring Learn

## Overview
This Spring Boot RESTful application returns details of the country India by loading the `Country` bean from an XML configuration.

## REST Endpoint
- **URL**: `http://localhost:8083/country`
- **Method**: GET
- **Sample Response**:
```
{
  "code": "IN",
  "name": "India"
}
```

## Controller Details
The controller method uses Spring's `ApplicationContext` to load a bean defined in `country.xml`, which is then returned. Spring Boot automatically converts the Java object to a JSON response using Jackson.

## How to Run
1. Ensure Java and Maven are installed.
2. Run `mvn spring-boot:run` from the project directory.
3. Open `http://localhost:8083/country` in a browser or Postman.

## Additional Notes
- Jackson (automatically included in Spring Boot) handles Java-to-JSON conversion.
- Logging is included for method start and end.

## Directory Structure
- controller: REST controller
- model: POJO class `Country`
- resources: `country.xml`, `application.properties`