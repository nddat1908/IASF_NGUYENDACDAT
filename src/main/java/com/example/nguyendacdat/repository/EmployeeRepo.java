package com.example.nguyendacdat.repository;

import com.example.nguyendacdat.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Integer> {
}
