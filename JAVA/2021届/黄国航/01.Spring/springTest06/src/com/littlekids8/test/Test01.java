package com.littlekids8.test;


import com.littlekids8.config.TxConfiguration;
import com.littlekids8.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.transferMoney();
    }
    @Test
    public void test02() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfiguration.class);
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.transferMoney();
    }


}
