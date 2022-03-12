package com.littlekids8.test;

import com.littlekids8.dao.EmployeeDao;
import com.littlekids8.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Collection;


@Controller
public class SpringMVCTest {
    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping("/testException")
    public String testException(@RequestParam("i") Integer i){
        System.out.println("result:"+(10/i));
        return "success";
    }

    @RequestMapping("/testFileUpload")
    public  String testFileUpload(@RequestParam("desc") String desc,
                                  @RequestParam("file")MultipartFile file) throws IOException {
        System.out.println("desc:" + desc);
        System.out.println("" + file.getOriginalFilename() + "\nsize:" + file.getSize());
        System.out.println("InputStream:" + file.getInputStream());
        return "success";
    }

    @ResponseBody
    @RequestMapping("/testJson")
    public Collection<Employee> testJson(){
        System.out.println("testJson");
        return employeeDao.getAll();
    }
}
