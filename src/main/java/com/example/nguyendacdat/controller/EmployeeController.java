package com.example.nguyendacdat.controller;

import com.example.nguyendacdat.entity.EmployeeEntity;
import com.example.nguyendacdat.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmpService empService;

    @GetMapping({"/", "index"})
    public String findAll(Model model){
        List<EmployeeEntity> emps = empService.findAllEmployee();
        model.addAttribute("emps",emps);
        return "index";
    }

    @GetMapping("/createView")
    public String createView(Model model){
        EmployeeEntity emps = new EmployeeEntity();
        model.addAttribute("emps",emps);
        return "create";
    }

    @PostMapping(value = "/add")
    public String addEmp(@ModelAttribute EmployeeEntity emp){
        empService.createEmp(emp);
        return "redirect:/";
    }


}
