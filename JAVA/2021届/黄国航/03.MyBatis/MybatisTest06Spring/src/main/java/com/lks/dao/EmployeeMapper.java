package com.lks.dao;


import com.lks.bean.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeMapper {

    public Employee getEmployeeById(Integer id);

    public List<Employee> getEmployees();
}
