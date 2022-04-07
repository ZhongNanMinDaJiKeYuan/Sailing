package com.lks.service;

import com.lks.bean.Employee;
import com.lks.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getEmployees(){
        return employeeMapper.getEmployees();
    }
}
