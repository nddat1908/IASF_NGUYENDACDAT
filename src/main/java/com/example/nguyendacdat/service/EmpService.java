package com.example.nguyendacdat.service;

import com.example.nguyendacdat.entity.EmployeeEntity;

import java.util.List;

public interface EmpService {
    List<EmployeeEntity> findAllEmployee();
    EmployeeEntity createEmp(EmployeeEntity emp);
}
