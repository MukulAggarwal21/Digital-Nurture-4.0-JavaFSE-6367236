
# Country Code Service Application

## Description
A Spring Boot application to find a country based on its country code.

## Technologies
- Java 17
- Spring Boot 3
- Spring Data JPA
- H2 In-memory Database

## How to Run
1. Open terminal and navigate to project root.
2. Run the following command:
```bash
mvn spring-boot:run
```
3. The app will start at: `http://localhost:8080`
4. H2 Console: `http://localhost:8080/h2-console`
   - JDBC URL: `jdbc:h2:mem:testdb`
   - User: `sa`, Password: (leave blank)

## Functionality Tested in Console
On startup, it tries to fetch country with code `IN`.
If found: Logs country details.
If not found: Throws `CountryNotFoundException`.

## Folder Structure
- `entity`: JPA Entity for Country
- `repository`: Spring Data JPA Repository
- `service`: Business logic and interface
- `exception`: Custom exception class

## Note
You can populate data using REST endpoints or modify to include a `data.sql` script for auto-loading countries.
