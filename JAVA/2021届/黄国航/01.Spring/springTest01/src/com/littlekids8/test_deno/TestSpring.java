package com.littlekids8.test_deno;

import com.littlekids8.User;
import com.littlekids8.bean.Employee;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void testAdd(){
        // 1 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        // 2 获取配置创建的对象
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }

}
