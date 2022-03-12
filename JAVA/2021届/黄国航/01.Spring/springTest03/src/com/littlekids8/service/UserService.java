package com.littlekids8.service;

import com.littlekids8.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


// 在注解里面value属性值可以省略不写
// 默认是首字母小写的类名
@Service(value = "userService")// <bean id="userService" class=".." >
public class UserService {


//    @Autowired // 根据类型进行注入
//    @Qualifier(value = "userDaoImpl1")
//    @Resource //根据类型注入
    @Resource(name = "userDaoImpl1") // 根据名称注入
    private UserDao userDao;

    @Value(value = "hello")
    private String name;

    public void add(){
        System.out.println("service add ...");
        userDao.add();
    }
}
