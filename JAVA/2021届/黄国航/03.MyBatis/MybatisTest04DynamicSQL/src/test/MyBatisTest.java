package test;

import bean.Employee;

import dao.EmployeeMapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MyBatisTest {


    // 根据xml配置文件（全局配置文件）创建一个SqlSessionFactory对象
    public SqlSessionFactory getSqlSessionFactory() throws IOException{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        return  new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void test2() throws IOException {
        // 1. 获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        // 2. 获取sqlSession对象
        SqlSession session = sqlSessionFactory.openSession();
        try{

            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            Employee employeeCondition = new Employee();
            employeeCondition.setGender("1");
            employeeCondition.setId(5);
            List<Employee> employees = mapper.getEmployeeByConditionIf(employeeCondition);
            System.out.println(employees);
        }finally {
            session.close();
        }
    }


}
