package com.challenge.api.controller;

import com.challenge.api.model.Employee;
import java.util.List;
import java.util.UUID;

import com.challenge.api.model.EmployeeImplement;
import com.challenge.api.servicelayer.EmployeeServiceLayer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

/**
 * Fill in the missing aspects of this Spring Web REST Controller. Don't forget to add a Service layer.
 */
@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    // Connect layers
    private final EmployeeServiceLayer employeeServiceLayer;

    public EmployeeController(EmployeeServiceLayer employeeServiceLayer) {
        this.employeeServiceLayer = employeeServiceLayer;
    }

    /**
     * @implNote Need not be concerned with an actual persistence layer. Generate mock Employee models as necessary.
     * @return One or more Employees.
     */
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeServiceLayer.getAllEmployees();
    }

    /**
     * @implNote Need not be concerned with an actual persistence layer. Generate mock Employee model as necessary.
     * @param uuid Employee UUID
     * @return Requested Employee if exists
     */
    @GetMapping("/{uuid}")
    public Employee getEmployeeByUuid(@PathVariable UUID uuid) {
        if (employeeServiceLayer.getEmployeeByUuid(uuid) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found");
        }
        return employeeServiceLayer.getEmployeeByUuid(uuid);
    }

    /**
     * @implNote Need not be concerned with an actual persistence layer.
     * @param requestBody hint!
     * @return Newly created Employee
     */
    @PostMapping()
    public Employee createEmployee(@RequestBody EmployeeImplement requestBody) {
        if (requestBody == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Request body is null");
        }
        try {
            return employeeServiceLayer.createEmployee(requestBody);
        } catch (IllegalArgumentException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }
}
