package com.littlekids8.test;

import com.littlekids8.entity.Book;
import com.littlekids8.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setBookId("1");
        book.setBookName("《算法》");
        book.setComment("abc");
        bookService.addBook(book);

    }

    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        int count = bookService.findCount();
        System.out.println("count:" + count);

    }

    @Test
    public void test03() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = bookService.findOne("1");
        System.out.println(book);

    }
    @Test
    public void test04() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        List<Book> bookList = bookService.findAll();
        System.out.println(bookList);

    }

    //批量添加
    @Test
    public void test05() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3","青年", "123"};
        Object[] o2 = {"4","青年2", "123"};
        Object[] o3= {"5","青年3", "123"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchAdd(batchArgs);


    }
}
