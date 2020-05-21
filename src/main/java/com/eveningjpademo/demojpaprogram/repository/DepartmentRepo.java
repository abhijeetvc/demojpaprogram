package com.eveningjpademo.demojpaprogram.repository;

import com.eveningjpademo.demojpaprogram.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Integer> {
}
