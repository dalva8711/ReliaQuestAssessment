/*
Employee Object Implementation:
- all private variable
- all methods
*/

package com.challenge.api.model;

import java.time.Instant;
import java.util.UUID;

public class EmployeeImplement implements Employee {

    // private variables
    private UUID uuid;
    private String firstName;
    private String lastName;
    private String fullName;
    private Integer salary;
    private Integer age;
    private String jobTitle;
    private String email;
    private Instant hireDate;
    private Instant terminationDate;

    // return UUID uuid
    @Override
    public UUID getUuid() {
        return uuid;
    }

    // set uuid
    @Override
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    // return String firstName
    @Override
    public String getFirstName() {
        return firstName;
    }

    // set firstName
    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // return String lastName
    @Override
    public String getLastName() {
        return lastName;
    }

    // set lastName
    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // return String fullName
    @Override
    public String getFullName() {
        return fullName;
    }

    // set fullName
    @Override
    public void setFullName(String name) {
        this.fullName = name;
    }

    // return Integer salary
    @Override
    public Integer getSalary() {
        return salary;
    }

    // set salary
    @Override
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    // return Integer age
    @Override
    public Integer getAge() {
        return age;
    }

    // set age
    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    // return String jobTitle
    @Override
    public String getJobTitle() {
        return jobTitle;
    }

    // set jobTitle
    @Override
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // return String email
    @Override
    public String getEmail() {
        return email;
    }

    // set email
    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    // return Instant hireDate
    @Override
    public Instant getContractHireDate() {
        return hireDate;
    }

    // set hireDate
    @Override
    public void setContractHireDate(Instant date) {
        this.hireDate = date;
    }

    // return Instant terminationDate
    @Override
    public Instant getContractTerminationDate() {
        return terminationDate;
    }

    // set terminationDate
    @Override
    public void setContractTerminationDate(Instant date) {
        this.terminationDate = date;
    }

}