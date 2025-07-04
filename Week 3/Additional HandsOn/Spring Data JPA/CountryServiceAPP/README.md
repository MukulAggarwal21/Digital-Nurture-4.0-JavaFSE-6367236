# CountryServiceApp

This Spring Boot application provides RESTful APIs to manage country information using Spring Data JPA.

## Features

- Find a country by its code
- Add a new country
- Update an existing country
- Delete a country by code
- Search countries by partial name match

## How to Run

1. Clone or unzip the project
2. Navigate to the project folder
3. Use the following command:

```
mvn spring-boot:run
```

4. Visit [http://localhost:8080/h2-console](http://localhost:8080/h2-console) to access the H2 database

## Sample API Endpoints

- GET `/api/countries/IN`
- POST `/api/countries` with JSON `{"coCode":"XY", "coName":"Xyland"}`
- PUT `/api/countries` with JSON `{"coCode":"XY", "coName":"New Xyland"}`
- DELETE `/api/countries/XY`
- GET `/api/countries/search?name=land`

Author:Mukul Aggarwal