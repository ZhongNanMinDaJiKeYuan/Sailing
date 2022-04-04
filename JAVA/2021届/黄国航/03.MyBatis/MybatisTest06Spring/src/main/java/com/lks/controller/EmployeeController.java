package com.lks.controller;

import com.lks.bean.Employee;
import com.lks.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/emps")
    public String getEmployees(Map<String, Object> map){
        List<Employee> employees = employeeService.getEmployees();
        map.put("all", employees);
        return "employee_list";
    }
}
