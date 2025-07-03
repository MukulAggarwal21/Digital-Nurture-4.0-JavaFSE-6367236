# orm-learn

Demo project for Spring Data JPA and Hibernate

## 🛠️ Software Prerequisites

- MySQL Server 8.0
- MySQL Workbench 8
- Eclipse IDE for Enterprise Java Developers 2019-03 R
- Maven 3.6.2

## 🚀 Getting Started

### 1. Create Spring Boot Project

Use Spring Initializr: https://start.spring.io/

- Group: `com.cognizant`
- Artifact: `orm-learn`
- Description: `Demo project for Spring Data JPA and Hibernate`
- Dependencies:
  - Spring Boot DevTools
  - Spring Data JPA
  - MySQL Driver

### 2. Import in Eclipse

- Extract the downloaded ZIP.
- In Eclipse: `File > Import > Maven > Existing Maven Projects > Browse the folder > Finish`

### 3. MySQL Setup

Open MySQL terminal and run:

```
mysql -u root -p
create schema ormlearn;
use ormlearn;
create table country(co_code varchar(2) primary key, co_name varchar(50));
insert into country values ('IN', 'India');
insert into country values ('US', 'United States of America');
```

### 4. Update `application.properties`

Configure DB, logging, and Hibernate properties in `src/main/resources/application.properties`.

### 5. Build Project

```
mvn clean package
```

### 6. Run the Application

Run `OrmLearnApplication.java` as a Java application. Expected output in console:

```
Inside main
Start
countries=[Country [code=IN, name=India], Country [code=US, name=United States of America]]
End
```

## 📁 Project Structure

```
src/
├── main/
│   ├── java/com/cognizant/ormlearn/
│   │   ├── OrmLearnApplication.java
│   │   ├── model/Country.java
│   │   ├── repository/CountryRepository.java
│   │   └── service/CountryService.java
│   └── resources/application.properties
└── test/
```

## 📌 Key Annotations

- `@Entity`, `@Table`, `@Column` — For mapping model to DB table.
- `@Repository` — For DAO layer.
- `@Service` — For service logic.
- `@Transactional` — To enable transaction management.

---
Author : Mukul Aggarwal 
Happy coding! 🎉