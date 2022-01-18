package com.chen.controller;

import com.chen.pojo.Employee;
import com.chen.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/allEmployee")
    public String list(Model model){
        List<Employee> employees = employeeService.queryAllEmployee();
        model.addAttribute("employeeList", employees);
        return "allEmployee";
    }

}
