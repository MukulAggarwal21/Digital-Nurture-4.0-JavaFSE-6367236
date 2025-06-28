📦 Project: Mockito Interaction Verification (Flat Structure)

📝 Objective:
-------------
This project demonstrates how to use Mockito to verify that a method is called with specific arguments.
It tests the interaction between a service class and an external dependency using a mock object.

📁 File Structure:
------------------
mockito-verification/
├── ExternalApi.java          --> An interface simulating an external dependency
├── MyService.java            --> The class under test that uses ExternalApi
├── MyServiceTest.java        --> JUnit test using Mockito to verify method interaction
├── junit-4.13.2.jar          --> JUnit testing framework
├── hamcrest-core-1.3.jar     --> Required by JUnit
├── mockito-core-5.2.0.jar    --> Mockito mocking framework

🔧 Requirements:
-----------------
- Java JDK installed (version 8 or above)
- All `.jar` files and `.java` files must be in the same folder
- Use CMD (not PowerShell) for compiling and running to avoid classpath issues

🛠️ How to Compile:
-------------------
1. Open Command Prompt (CMD)
2. Navigate to the project folder:
   cd "C:\Users\<YourUsername>\Downloads\mockito-verification"

3. Compile all Java files using the classpath for JUnit and Mockito:
   javac -cp ".;junit-4.13.2.jar;hamcrest-core-1.3.jar;mockito-core-5.2.0.jar" *.java

🚀 How to Run the Test:
------------------------
Run the test using JUnit's test runner:

   java -cp ".;junit-4.13.2.jar;hamcrest-core-1.3.jar;mockito-core-5.2.0.jar" org.junit.runner.JUnitCore MyServiceTest

✅ Expected Output:
--------------------
JUnit version 4.13.2
.
Time: 0.005

OK (1 test)

This output means:
- The test ran successfully
- The interaction with the mock (`getData()` call) was verified correctly

📚 Key Concepts Demonstrated:
------------------------------
- Mockito `mock()` to create mock objects
- Mockito `verify()` to assert that a method was called
- JUnit test structure using `@Test` annotation
- Flat structure with no nested folders for simplicity

📎 References:
---------------
- Mockito Official Docs: https://site.mockito.org/
- JUnit 4 Docs: https://junit.org/junit4/

---

🧑‍💻 Author: Mukul Aggarwal
📅 Created: June 2025
