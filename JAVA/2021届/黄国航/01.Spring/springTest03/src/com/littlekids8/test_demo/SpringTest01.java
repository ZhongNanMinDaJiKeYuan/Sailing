package com.littlekids8.test_demo;

import com.littlekids8.config.SpringConfig;
import com.littlekids8.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest01 {
    @Test
    public void testService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService" ,UserService.class);
        System.out.println(userService);
        userService.add();
    }
    @Test
    public void testService2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService" ,UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
