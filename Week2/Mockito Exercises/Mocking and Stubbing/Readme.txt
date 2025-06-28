===============================
Mocking and Stubbing with Mockito
===============================

This project demonstrates how to mock and stub a dependency using Mockito, 
and test it using JUnit 5 in a simple Java application.

It contains:
- An interface (ExternalApi) simulating an external service.
- A class (MyService) that depends on the interface.
- A test class (MyServiceTest) that mocks the dependency.

-------------------------------
Project Structure
-------------------------------
mocking-mockito-simple/
├── ExternalApi.java --->  Interface simulating an external service
├── MyService.java --> Class that uses the external API
├── MyServiceTest.java --> Unit test with mocking using Mockito
├── pom.xml --> Maven build file (JUnit 5 + Mockito)

-------------------------------
Technologies Used
-------------------------------
- Java 8 or later
- Maven
- JUnit 5
- Mockito

-------------------------------
How to Run the Tests
-------------------------------
1. Open terminal or command prompt in the project folder.

2. Make sure Maven is installed. Then run:

   mvn test

3. You should see output like:

   -------------------------------------------------------
   T E S T S
   -------------------------------------------------------
   Running MyServiceTest
   Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

-------------------------------
What Does the Test Do?
-------------------------------
- Creates a mock of ExternalApi using Mockito
- Stubs the getData() method to return "Mock Data"
- Passes the mock to MyService
- Verifies that MyService.fetchData() returns the stubbed value

-------------------------------
Learning Objectives
-------------------------------
- Use Mockito to create and stub mocks
- Write isolated unit tests without calling real APIs
- Structure simple Java test projects using Maven

-------------------------------
Author
-------------------------------
Created by: [Your Name]

-------------------------------
License
-------------------------------
This project is licensed under the MIT License.
