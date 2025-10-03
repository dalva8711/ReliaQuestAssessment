/*
Service Layer:
- populate with mock data to test
- build functions that are called in EmployeeController Layer
- include comments of functions
*/

package com.challenge.api.servicelayer;

import com.challenge.api.model.Employee;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.time.Instant;

import com.challenge.api.model.EmployeeImplement;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceLayer {
    // 1. Data structure to store employees
    private final ConcurrentHashMap<UUID, Employee> employees = new ConcurrentHashMap<>();

    public EmployeeServiceLayer() {
        // mock data
        CreateFakeEmployee("Diego", "Alvarez", 90000, 21, "SWE", "diego.alvarez.dejesus@gmail.com");
        CreateFakeEmployee("John", "Smith", 160000, 39, "Managing Director", "John.Smith@gmail.com");
        CreateFakeEmployee("Kelly", "Ann", 200000, 52, "CEO", "Kelly.Ann@gmail.com");

    }

    public void CreateFakeEmployee(String firstName, String lastName, Integer salary, Integer age, String jobTitle, String email) {
        EmployeeImplement employee = new EmployeeImplement();
        employee.setUuid(UUID.randomUUID());
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setFullName(firstName + " " + lastName);
        employee.setSalary(salary);
        employee.setAge(age);
        employee.setJobTitle(jobTitle);
        employee.setEmail(email);
        employee.setContractHireDate(Instant.now());
        employees.put(employee.getUuid(), employee);
    }

    public List<Employee> getAllEmployees() {
        return  new ArrayList<>(employees.values());
    }

    // use Optional<Employee> in case Employee does not exist
    public Employee getEmployeeByUuid(UUID uuid) {
        return employees.get(uuid);
    }

    public Employee createEmployee(Employee employee) {
        // Check variables are filled: firstName, lastName, salary, age, jobTitle, email
        if (employee.getFirstName() == null || employee.getFirstName() == null) {
            throw new IllegalArgumentException("First name cannot be null");
        } else {
            employee.getFirstName();
        }
        if (employee.getLastName() == null || employee.getLastName().isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be null");
        } else {
            employee.getLastName();
        }
        if (employee.getSalary() == null) {
            throw new IllegalArgumentException("Salary cannot be null");
        } else {
            employee.getSalary();
        }
        if (employee.getAge() == null) {
            throw new IllegalArgumentException("Age cannot be null");
        } else {
             employee.getAge();
        }
        if (employee.getJobTitle() == null || employee.getJobTitle().isEmpty()) {
            throw new IllegalArgumentException("Job title cannot be null");
        } else {
            employee.getJobTitle();
        }
        if (employee.getEmail() == null || employee.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null");
        } else {
            employee.getEmail();
        }

        // Populate other variables
        employee.setUuid(UUID.randomUUID());
        employee.setFullName(employee.getFirstName() + " " + employee.getLastName());
        employee.setContractHireDate(Instant.now());
        employees.put(employee.getUuid(), employee);
        return employee;
    }

}