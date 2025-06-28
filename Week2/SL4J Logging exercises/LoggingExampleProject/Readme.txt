LoggingExampleProject
=====================

This is a simple Java application that demonstrates how to log error and warning messages 
using SLF4J with Logback.

----------------------------------
Project Structure
----------------------------------
LoggingExampleProject/
├── pom.xml
├── README.txt
└── src/
    └── LoggingExample.java

----------------------------------
Technologies Used
----------------------------------
- Java 8 or higher
- Maven
- SLF4J (Simple Logging Facade for Java)
- Logback (SLF4J-compatible logging backend)

----------------------------------
How to Run the Project
----------------------------------

1. Make sure you have Java and Maven installed.

   Check with:
     java -version
     mvn -v

2. Open a terminal and navigate to the project folder:

     cd path/to/LoggingExampleProject

3. Compile the project:

     mvn compile

4. Run the application:

     mvn exec:java -Dexec.mainClass=LoggingExample

   NOTE: If exec plugin is not added in pom.xml, you need to add it under the <build> section.

----------------------------------
Expected Output
----------------------------------

When you run the program, the console should show:

   ERROR LoggingExample - This is an error message
   WARN  LoggingExample - This is a warning message

This confirms that SLF4J is working with Logback and handling different log levels.

----------------------------------
License : Mukul Aggarwal
----------------------------------

This project is open-source and free to use under the MIT License.
