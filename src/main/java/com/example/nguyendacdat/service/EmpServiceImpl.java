package com.example.nguyendacdat.service;

import com.example.nguyendacdat.entity.EmployeeEntity;
import com.example.nguyendacdat.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService{

    @Autowired
    EmployeeRepo empRepo;

    @Override
    public List<EmployeeEntity> findAllEmployee() {
        return empRepo.findAll();
    }

    @Override
    public EmployeeEntity createEmp(EmployeeEntity emp) {
        return empRepo.save(emp);
    }
}
