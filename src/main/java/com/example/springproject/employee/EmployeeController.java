package com.example.springproject.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value="/")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping(value="/{employeeId}")
    public Employee getEmployeeById(@PathVariable int employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

    @PostMapping(value="/")
    public Employee saveEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @PutMapping(value="/{employeeId}")
    public Employee updateEmployee(@PathVariable int employeeId, @RequestBody Employee employee) {
        Employee emp = employeeService.getEmployeeById(employeeId);
        emp.setName(employee.getName());
        emp.setEmail(employee.getEmail());
        emp.setPhone(employee.getPhone());
        emp.setAddress(employee.getAddress());
        emp.setSalary(employee.getSalary());
        employeeService.saveEmployee(emp);
        return emp;
    }

    @DeleteMapping("/{employeeId}")
    public String deleteEmployeeById(@PathVariable int employeeId) {
        employeeService.deleteEmployeeById(employeeId);
        return "Employee deleted with ID: " + employeeId;
    }
}