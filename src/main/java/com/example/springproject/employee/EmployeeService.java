package com.example.springproject.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int employeeId) {
        Optional<Employee> result = employeeRepository.findById(employeeId);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new RuntimeException("Employee not found with ID: " + employeeId);
        }
    }

    public void saveEmployee(Employee employee) {
        
        employeeRepository.save(employee);
    }

    public void deleteEmployeeById(int employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}