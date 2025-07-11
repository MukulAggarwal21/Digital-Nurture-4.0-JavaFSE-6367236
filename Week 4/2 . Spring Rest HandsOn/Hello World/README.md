# Hello World Spring Learn Application

## Overview
This is a simple Spring Boot application that exposes a REST endpoint to return "Hello World!!".

## REST Endpoint
- **Method**: GET
- **URL**: `http://localhost:8083/hello`
- **Controller**: `HelloController`
- **Response**: "Hello World!!"

## How to Run
1. Make sure you have Java and Maven installed.
2. Navigate to the project directory.
3. Run `mvn spring-boot:run`.
4. Visit `http://localhost:8083/hello` in your browser or Postman.

## Logging
Start and end logs are printed in the console for each request to `/hello`.