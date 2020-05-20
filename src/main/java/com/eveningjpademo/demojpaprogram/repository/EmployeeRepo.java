package com.eveningjpademo.demojpaprogram.repository;

import com.eveningjpademo.demojpaprogram.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    List<Employee> findByEmpName(String empName);

    List<Employee> findByEmpNameAndCity(String empName, String city);
}
