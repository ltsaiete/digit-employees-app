package com.example.demo.controllers;

import com.example.demo.models.Employee;
import com.example.demo.services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @RequestMapping(value = "/_create", method = RequestMethod.POST)
    public ResponseEntity<Employee> create(@RequestBody Employee employee) {
        Employee savedEmployee = this.employeeService.create(employee);
        return ResponseEntity.status(HttpStatus.OK).body(savedEmployee);
    }

//    @RequestMapping(value = "/_search", method = RequestMethod.GET)
//    public  ResponseEntity<List<Employee>> searchAllEmployees() {
//        return ResponseEntity.status(HttpStatus.OK).body("Search");
//    }
//
//    @RequestMapping(value = "/_search/{id}", method = RequestMethod.GET)
//    public  ResponseEntity<Employee> searchById(@PathVariable(value = "id") String employeeId) {}
//
//    @RequestMapping(value = "/_update/{id}", method = RequestMethod.PUT)
//    public ResponseEntity<Employee> Update(
//            @PathVariable(value = "id") String employeeId,
//            @RequestBody Employee employee
//    ){
//
//    }
}
