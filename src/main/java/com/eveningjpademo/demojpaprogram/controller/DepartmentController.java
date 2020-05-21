package com.eveningjpademo.demojpaprogram.controller;

import com.eveningjpademo.demojpaprogram.model.Department;
import com.eveningjpademo.demojpaprogram.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value="/department")
public class DepartmentController {

    @Autowired
    private DepartmentRepo departmentRepo;

    @PostMapping(value="/save")
    public String saveDept(@RequestBody Department department){
        departmentRepo.save(department);
        return "Department saved";
    }

    @GetMapping(value="/getdept/{deptId}")
    public Optional<Department> getDept(@PathVariable Integer deptId){
        Optional<Department> department=departmentRepo.findById(deptId);
        return department;
    }
}
