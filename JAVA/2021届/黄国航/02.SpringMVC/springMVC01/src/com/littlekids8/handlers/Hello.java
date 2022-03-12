package com.littlekids8.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
    /**
     *   1. 使用请求映射来配置请求
     *   2. 返回值会通过视图解析器解析为实际的物理视图，对于InternalResourceViewResolver 视图解析器，会做如下的解析：
     *   通过prefix+returnVal+ suffix 这样的方式得到实际的物理视图，然后做转发操作
     *   如：        <property name="prefix" value="/WEB-INF/views"></property>
     *         <property name="suffix" value=".jsp"></property>
     *         返回值为：success
     *         则：prefix+returnVal+ suffix= "/WEB-INF/views/success.jsp"
      */

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return "success";
    }
}
