# Factory Method Pattern - Document Management System

This project demonstrates the implementation of the Factory Method Pattern in Java through a document management system that can create different types of documents (Word, PDF, Excel).

## Project Structure

```
FactoryMethodPatternExample/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── documentmanagement/
│                   ├── documents/
│                   │   ├── Document.java
│                   │   ├── WordDocument.java
│                   │   ├── PdfDocument.java
│                   │   └── ExcelDocument.java
│                   ├── factories/
│                   │   ├── DocumentFactory.java
│                   │   ├── WordDocumentFactory.java
│                   │   ├── PdfDocumentFactory.java
│                   │   └── ExcelDocumentFactory.java
│                   ├── DocumentManagementSystem.java
│                   └── Main.java
├── pom.xml
├── .gitignore
└── README.md
```

## Design Pattern Implementation

### Factory Method Pattern Components

1. **Product Interface/Abstract Class**: `Document.java`
   - Defines the interface for objects the factory method creates

2. **Concrete Products**: `WordDocument.java`, `PdfDocument.java`, `ExcelDocument.java`
   - Implement the Document interface with specific functionality

3. **Creator (Abstract Factory)**: `DocumentFactory.java`
   - Declares the factory method that returns a Document object
   - Includes a template method that uses the factory method

4. **Concrete Creators**: `WordDocumentFactory.java`, `PdfDocumentFactory.java`, `ExcelDocumentFactory.java`
   - Override the factory method to create specific document types

## Key Features

- **Extensibility**: Easy to add new document types without modifying existing code
- **Polymorphism**: All documents share a common interface
- **Encapsulation**: Document creation logic is encapsulated in factory classes
- **Template Method**: Demonstrates how factory method fits into larger workflows

## How to Run

### Prerequisites
- Java 8 or higher
- Maven (if using the provided pom.xml)

### Using Maven
```bash
# Compile the project
mvn compile

# Run the main class
mvn exec:java -Dexec.mainClass="com.documentmanagement.Main"
```

### Using Command Line (without Maven)
```bash
# Navigate to the src directory
cd src

# Compile all Java files
javac -d ../bin com/documentmanagement/**/*.java

# Run the main class
java -cp ../bin com.documentmanagement.Main
```

## Sample Output

The program will demonstrate:
1. Direct factory usage with different document types
2. Document Management System integration
3. Polymorphism with factory arrays
4. Error handling for unsupported document types

## Learning Objectives

- Understand the Factory Method Pattern structure
- Learn when to use the Factory Method Pattern
- See how it promotes loose coupling and extensibility
- Practice object-oriented design principles

## Benefits of This Implementation

1. **Open/Closed Principle**: Open for extension (new document types), closed for modification
2. **Single Responsibility**: Each factory is responsible for creating one type of document
3. **Dependency Inversion**: High-level modules don't depend on low-level concrete classes
4. **Code Reusability**: Common document operations are defined once in the abstract class

---
