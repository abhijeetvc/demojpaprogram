package com.eveningjpademo.demojpaprogram.controller;

import com.eveningjpademo.demojpaprogram.model.Employee;
import com.eveningjpademo.demojpaprogram.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping(value="/save")
    public String saveEmp(@RequestBody Employee employee){
        employeeRepo.save(employee);
        return "Employee saved";
    }

    @GetMapping(value="/getemp")
    public List<Employee> getEmpList(){
        return employeeRepo.findAll();
    }

    @GetMapping(value="/getemp/{id}")
    public Optional<Employee> getEmp(@PathVariable Integer id){
        return employeeRepo.findById(id);
    }

    @GetMapping(value="/getbyname/{empName}")
    public List<Employee> getEmpByName(@PathVariable String empName){
        return employeeRepo.findByEmpName(empName);
    }

    @GetMapping(value="/getbynameandcity/{empName}/{city}")
    public List<Employee> getEmpByNameAndCity(@PathVariable String empName,
                                              @PathVariable String city){
        return employeeRepo.findByEmpNameAndCity(empName,city);
    }
}
