package com.lks.springbootwithothers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootWithOthersApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        userService.add();
    }

}
