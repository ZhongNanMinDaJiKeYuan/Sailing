package com.lks.springboot01helloworld02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    Person person;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println(person);
        return "hello Spring Boot!";
    }

}