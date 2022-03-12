package com.littlekids8.handlers;

import com.littlekids8.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

@SessionAttributes(value = {"user"},types = {String.class})
@Controller
@RequestMapping("/springmvc")
public class SpringMVCTest {
    private static final String OK = "success";

    @RequestMapping("/testRedirect")
    public String testRedirect(){
        return "redirect:/index.jsp";
    }

    @RequestMapping("/testHelloView")
    public String testHelloView(){
        System.out.println("testHelloView");
        return "helloView";
    }

    @RequestMapping("/testViewAndViewResolver")
    public String testViewAndViewResolver(){
        System.out.println("testViewAndViewResolver");
        return OK;
    }


    @ModelAttribute
    public void getUser(@RequestParam(value="id", required = false) Integer id, Map<String, Object> map){
        if (id != null){
            User user = new User(1,"Tom", "12345", "guo@qq.com", 12);
            //System.out.println("从系统中获取一个对象：" + user);
            map.put("user", user);
        }
    }

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(User user){
        System.out.println("修改："+ user);
        return OK;
    }
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Map<String, Object> map){
        User user = new User("marry","12345", "guo@qq.com",11);
        map.put("user", user);
        map.put("school","heng");
        return OK;
    }

    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map){
        map.put("names", Arrays.asList("tom","marry","jack"));
        return "success";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        String viewName = OK;
        ModelAndView modelAndView = new ModelAndView(viewName);

        // 添加模型数据到ModelAndView中，SpringMVC会将ModelAndView中的model中的数据放到request域对象中。
        // 该数据可在视图部分使用request域对象访问到
       /* User user = new User();
        user.setUsername("marry");
        user.setAge(10);*/
        modelAndView.addObject("time",new Date());

        return modelAndView;
    }

    @RequestMapping("/testPojo")
    public String testPojo(User user){
        System.out.println("testPojo: " + user);
        return OK;
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String sessionID){
        System.out.println("testCookieValue, sessionID: "+ sessionID);
        return OK;
    }

    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept-Language") String acceptLanguage){
        System.out.println("testRequestHeader-acceptLanguage: " + acceptLanguage);
        return OK;
    }

    @RequestMapping(value = "/testRequestParam")
    public String testRequestParam(@RequestParam(value = "username")String username,
                                   @RequestParam(value = "age", required = false, defaultValue = "0") int age){
        System.out.println("Test RequestParam: "+username +", age: " + age );
        return OK;
    }

}
