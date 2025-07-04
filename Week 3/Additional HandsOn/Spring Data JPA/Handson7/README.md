# Hands-On 7: Add a New Country - Spring Data JPA

This exercise demonstrates how to add a new `Country` entry to the database using Spring Data JPA in a Spring Boot application.

## Steps Performed

1. Added `addCountry` method to `CountryService` with `@Transactional` annotation.
2. Implemented the method to use `countryRepository.save()`.
3. Added test method `testAddCountry()` in `OrmLearnApplication`.
4. Verified the country addition using `findCountryByCode()`.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL

## How to Run

1. Import the project into Eclipse/IntelliJ as a Maven project.
2. Configure your MySQL `application.properties` with valid credentials.
3. Run the `OrmLearnApplication.java`.
4. Check console or database for newly added country.