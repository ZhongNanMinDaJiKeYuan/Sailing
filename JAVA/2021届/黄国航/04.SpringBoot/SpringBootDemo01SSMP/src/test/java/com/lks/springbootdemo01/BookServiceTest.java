package com.lks.springbootdemo01;

import com.lks.springbootdemo01.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {
    @Autowired
    BookService bookService;

    @Test
    public void testGetById(){
        System.out.println(bookService.getById(1));
    }
}
