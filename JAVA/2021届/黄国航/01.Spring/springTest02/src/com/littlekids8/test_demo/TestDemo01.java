package com.littlekids8.test_demo;

import com.littlekids8.autowire.Employee;
import com.littlekids8.bean.Orders;
import com.littlekids8.collection_type.Book;
import com.littlekids8.collection_type.Course;
import com.littlekids8.collection_type.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo01 {
    @Test
    public void testCollection(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Student student = context.getBean("student", Student.class);
        student.test();
    }
    @Test
    public void testCollection2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);

        System.out.println(book1);
        System.out.println(book2);
    }
    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }
    @Test
    public void test4(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        context.close();
    }
    @Test
    public void test5(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Employee employee = context.getBean("emp", Employee.class);
        System.out.println(employee);

    }
}
