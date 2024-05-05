package com.example.demo.services;

import com.example.demo.models.Employee;
import com.example.demo.repositories.EmployeeRepository;

public class EmployeeService {
    private EmployeeRepository employeeRepository;
    public EmployeeService() {

    }

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee create(Employee employee) {
        Employee savedEmployee = this.employeeRepository.save(employee);
        return savedEmployee;
    }
}
