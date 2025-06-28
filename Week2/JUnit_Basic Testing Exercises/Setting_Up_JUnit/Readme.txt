==============================
JUnit Demo Project - VS Code
==============================

This project demonstrates how to set up and use JUnit 4 for unit testing in a Java Maven project using Visual Studio Code (VS Code).

--------------------------
REQUIREMENTS / PREREQUISITES
--------------------------
1. Java Development Kit (JDK) 8 or above
2. Apache Maven
3. Visual Studio Code
4. Java Extension Pack installed in VS Code

---------------------
STEP 1: CREATE PROJECT
---------------------
Open your terminal or command prompt and run the following command to create a new Maven project:

mvn archetype:generate -DgroupId=com.example -DartifactId=JUnitDemo -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

After the project is generated, navigate into the project folder and open it in VS Code:

cd JUnitDemo
code .

------------------------
STEP 2: ADD JUNIT DEPENDENCY
------------------------
Open the "pom.xml" file and add the following dependency inside the <dependencies> tag:

<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>

Save the file. VS Code will automatically download and resolve the dependency.

-------------------------
STEP 3: CREATE JAVA CLASS
-------------------------
Go to: src/main/java/com/example/
Create a file named: Calculator.java

Paste the following code:

package com.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

-------------------------
STEP 4: CREATE TEST CLASS
-------------------------
Go to: src/test/java/com/example/
Create a file named: CalculatorTest.java

Paste the following code:

package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(5, 3);
        assertEquals(8, result);
    }
}

------------------------
STEP 5: RUN THE TESTS
------------------------
Open the terminal in VS Code (shortcut: Ctrl + `) and run:

mvn test

If everything is set up correctly, you should see output like:

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.example.CalculatorTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

------------------------
PROJECT STRUCTURE
------------------------

JUnitDemo/
├── pom.xml
├── src/
│   ├── main/java/com/example/Calculator.java
│   └── test/java/com/example/CalculatorTest.java

------------------------
OPTIONAL
------------------------
- Install "Java Test Runner" extension from VS Code marketplace for GUI-based test run/debug buttons.
- You can run tests by clicking "Run Test" above the method in the editor.

------------------------
LICENSE
------------------------
This project is free to use and modify under the MIT License.
