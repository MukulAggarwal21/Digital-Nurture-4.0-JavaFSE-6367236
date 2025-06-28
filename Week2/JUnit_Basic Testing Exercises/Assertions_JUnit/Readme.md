# ✅ JUnit Assertions Test (Simple Setup)

This project demonstrates the use of various **JUnit 5 assertions** using a minimal Java setup — no Gradle or Maven required.

---

## 📂 Project Structure

JUnitSimple/
├── lib/
│ └── junit-platform-console-standalone-1.10.0.jar
├── AssertionsTest.java
└── README.md


---

## 🧪 What’s Tested?

The `AssertionsTest.java` file includes tests for:

- ✅ `assertEquals`
- ✅ `assertTrue`
- ✅ `assertFalse`
- ✅ `assertNull`
- ✅ `assertNotNull`

---

## 📥 Prerequisites

- Java JDK 8 or higher installed
- Download the JUnit Platform Console Standalone JAR:

  👉 [Download JAR](https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.10.0/junit-platform-console-standalone-1.10.0.jar)

- Place the downloaded JAR inside the `lib/` folder

---

## 🚀 How to Run

### 1. Compile the Test File

```bash
javac -cp "lib/*" AssertionsTest.java

## 2.. Run the Tests
```bash
java -jar lib/junit-platform-console-standalone-1.10.0.jar -cp . --select-class AssertionsTest

💡 If you're on Windows, replace "lib/*" with "lib\\*" in the command above.

✅ Example Output
┌────────────────────────────────────────────────────────┐
│ JUnit Jupiter ✔                                        │
│ └─ AssertionsTest ✔                                    │
│    └─ testAssertions() ✔                               │
└────────────────────────────────────────────────────────┘

Test run finished after 80 ms
[ 1 test found, 1 test successful, 0 failed ]


Author : Mukul Aggarwal