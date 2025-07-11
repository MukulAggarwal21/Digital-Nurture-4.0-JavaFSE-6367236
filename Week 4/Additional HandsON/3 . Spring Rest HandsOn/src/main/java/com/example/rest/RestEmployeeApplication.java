package com.example.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:employee.xml")
public class RestEmployeeApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestEmployeeApplication.class, args);
    }
}