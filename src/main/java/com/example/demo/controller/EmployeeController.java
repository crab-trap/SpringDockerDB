package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

        @Autowired
        EmployeeService empService;

        @RequestMapping(value="/createmp", method=RequestMethod.POST)
        public Employee createEmployee(@RequestBody Employee emp) {
            return empService.createEmployee(emp);
        }
        @RequestMapping(value="/getemp", method=RequestMethod.GET)
        public List<Employee> readEmployees() {
            return empService.getEmployees();
        }

        @RequestMapping(value="/employees/{empId}", method=RequestMethod.PUT)
            public Employee readEmployees(@PathVariable(value = "empId") Long id, @RequestBody Employee empDetails) {
            return empService.updateEmployee(id, empDetails);
        }

        @RequestMapping(value="/employees/{empId}", method=RequestMethod.DELETE)
            public void deleteEmployees(@PathVariable(value = "empId") Long id) {
            empService.deleteEmployee(id);
        }

}