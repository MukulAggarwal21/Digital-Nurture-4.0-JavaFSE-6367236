# Country Code REST Service - Spring Learn

## Overview
This Spring Boot RESTful service returns country details based on a case-insensitive country code.

## Endpoint
- **URL**: `http://localhost:8083/countries/{code}`
- **Method**: GET
- **Response Example** (for `/countries/in`):
```
{
  "code": "IN",
  "name": "India"
}
```

## Functionality
- Loads a list of countries from an XML file (`country.xml`).
- Uses Java Stream API to find the country with a matching (case-insensitive) code.
- Uses `@PathVariable` to extract the code from the URL.

## Run Instructions
1. Open terminal in project root.
2. Run: `mvn spring-boot:run`
3. Visit: `http://localhost:8083/countries/in` in browser or Postman.

## Notes
- Jackson auto-converts the Java `Country` object to JSON.
- Logging included to trace method flow.