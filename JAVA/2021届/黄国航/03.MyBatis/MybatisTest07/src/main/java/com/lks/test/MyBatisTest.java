package com.lks.test;


import com.lks.bean.Employee;
import com.lks.dao.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MyBatisTest {


    // 根据xml配置文件（全局配置文件）创建一个SqlSessionFactory对象
    public SqlSessionFactory getSqlSessionFactory() throws IOException{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        return  new SqlSessionFactoryBuilder().build(inputStream);
    }

    // 单字面量类型参数
    @Test
    public void test2() throws IOException {
        // 从Factory中获取sqlSession对象
        SqlSession session = getSqlSessionFactory().openSession();
        try {
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
            Employee employee = mapper.getEmployeeById(1);
            System.out.println(employee);
        }finally {
            session.close();
        }
    }

    // 多字面量类型参数
    @Test
    public void test3() throws IOException {
        // 从Factory中获取sqlSession对象
        SqlSession session = getSqlSessionFactory().openSession();
        try {
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
            Employee employee = mapper.getEmployeeByIdAndName(1, "tom");
            System.out.println(employee);
        }finally {
            session.close();
        }
    }

    // 实体类类型参数
    @Test
    public void test4() throws IOException {
        // 从Factory中获取sqlSession对象
        SqlSession session = getSqlSessionFactory().openSession();
        try {
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
            Employee empQuery = new Employee();
            empQuery.setId(1);
            empQuery.setLastName("tom");
            Employee employee = mapper.getEmployeeByIdAndNameInEmp(empQuery);
            System.out.println(employee);
        }finally {
            session.close();
        }
    }

    // 组合的情况下
    @Test
    public void test5() throws IOException {
        // 从Factory中获取sqlSession对象
        SqlSession session = getSqlSessionFactory().openSession();
        try {
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
            Employee empQuery = new Employee();
            empQuery.setLastName("tom");
            Employee employee = mapper.getEmployeeByIdAndNameInEmp2(1, empQuery);
            System.out.println(employee);
        }finally {
            session.close();
        }
    }

    // List的情况下
    @Test
    public void test7() throws IOException {
        // 从Factory中获取sqlSession对象
        SqlSession session = getSqlSessionFactory().openSession();
        try {
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
            List<Integer> ids = new ArrayList<>();
            ids.add(1);
            Employee employee = mapper.getEmployeeByIdAndNameInList2(ids);
            System.out.println(employee);
        }finally {
            session.close();
        }
    }

    // 组合的情况下
    @Test
    public void test6() throws IOException {
        // 从Factory中获取sqlSession对象
        SqlSession session = getSqlSessionFactory().openSession();
        try {
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
            List<Integer> ids = new ArrayList<>();
            ids.add(1);
            Employee employee = mapper.getEmployeeByIdAndNameInList(ids, "tom");
            System.out.println(employee);
        }finally {
            session.close();
        }
    }
}
