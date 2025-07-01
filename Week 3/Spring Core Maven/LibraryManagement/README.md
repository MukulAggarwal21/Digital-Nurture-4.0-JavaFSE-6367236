# LibraryManagement - Spring Basic Configuration

## 📌 Overview

A simple Spring-based Java application to demonstrate the use of:
- Spring Core (Dependency Injection)
- XML-based configuration
- Service & Repository pattern

## 🛠 Project Structure

```
LibraryManagement/
├── pom.xml
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── library/
│       │           ├── MainApp.java
│       │           ├── repository/
│       │           │   └── BookRepository.java
│       │           └── service/
│       │               └── BookService.java
│       └── resources/
│           └── applicationContext.xml
```

## 🚀 How to Run

1. Make sure you have Maven installed.
2. Open terminal and navigate to the project root.
3. Run:
    ```bash
    mvn compile
    mvn exec:java -Dexec.mainClass="com.library.MainApp"
    ```

    Alternatively, run the `MainApp` class from your IDE.

## ✅ Expected Output

```
Adding book: Effective Java
Book saved: Effective Java
```