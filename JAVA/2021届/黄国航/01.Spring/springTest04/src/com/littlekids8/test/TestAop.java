package com.littlekids8.test;

import com.littlekids8.aop_anno.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
