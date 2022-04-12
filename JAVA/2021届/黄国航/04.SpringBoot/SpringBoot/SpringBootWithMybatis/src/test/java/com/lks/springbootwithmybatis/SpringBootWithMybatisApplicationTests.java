package com.lks.springbootwithmybatis;

import com.lks.springbootwithmybatis.bean.Employee;
import com.lks.springbootwithmybatis.dao.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootWithMybatisApplicationTests {

    @Autowired
    EmployeeMapper employeeMapper;
    @Test
    void contextLoads() {
        Employee employee = employeeMapper.getEmployeeById(1);
        System.out.println(employee);

    }

}
