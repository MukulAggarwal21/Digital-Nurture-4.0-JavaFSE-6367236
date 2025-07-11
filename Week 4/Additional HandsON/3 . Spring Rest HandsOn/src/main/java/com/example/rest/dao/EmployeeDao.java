package com.example.rest.dao;

import com.example.rest.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;

@Repository
public class EmployeeDao {

    private static List<Employee> EMPLOYEE_LIST;

    @Autowired
    private List<Employee> employees;

    @PostConstruct
    public void init() {
        EMPLOYEE_LIST = employees;
    }

    public List<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }
}