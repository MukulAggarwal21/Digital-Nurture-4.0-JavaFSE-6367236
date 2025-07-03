# 📘 Library Management – Spring Boot (Exercise 9)

This is a simple **Spring Boot** application demonstrating:

- RESTful API using **Spring Web**
- **Spring Data JPA** with **H2** in-memory database
- Entity and Repository configuration
- Minimal setup using Spring Boot starters

---

## 🗂️ Project Structure

LibraryManagement/
├── src/
│ ├── main/
│ │ ├── java/com/library/
│ │ │ ├── LibraryManagementApplication.java
│ │ │ ├── controller/BookController.java
│ │ │ ├── entity/Book.java
│ │ │ └── repository/BookRepository.java
│ │ └── resources/
│ │ ├── application.properties
├── pom.xml
└── README.md


---

## ⚙️ Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

---

## 🏃‍♂️ How to Run

### 📌 Step 1: Build & Run

```bash
mvn clean install
mvn spring-boot:run


📌 Step 2: Access Endpoints
H2 Console: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:librarydb

GET Books:
GET http://localhost:8080/books

POST Book:
POST http://localhost:8080/books

{
  "title": "Spring in Action",
  "author": "Craig Walls"
}
 
📤 Sample Output
➕ Add a Book:
curl -X POST http://localhost:8080/books -H "Content-Type: application/json" \
-d '{"title": "Spring in Action", "author": "Craig Walls"}'

📚 Get All Books:
curl http://localhost:8080/books

[
  {
    "id": 1,
    "title": "Spring in Action",
    "author": "Craig Walls"
  }
]


✅ Features Implemented
 -->Spring Boot project structure

-->  REST Controller

 -->Spring Data JPA Repository

 -->H2 in-memory configuration

 -->CRUD for Book entity