package test;

import bean.Department;
import bean.Employee;
import dao.DepartmentMapper;
import dao.EmployeeMapper;
import dao.EmployeeMapperAnnotation;
import dao.EmployeeMapperPlus;
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

    @Test
    public void test() throws IOException {
        // 1. 根据xml配置文件（全局配置文件）创建一个SqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2. 从SqlSessionFactory中获取SqlSession实例，SqlSession可以执行已经映射的Sql语句
        SqlSession session = sqlSessionFactory.openSession();

        try {
            /*两个参数：
             * statement – 要使用的sql语句在Mapper中的唯一标识符id(Mappers的namespace+id）
             * parameter – sql语句中的参数
             * */
            Employee employee = session.selectOne("EmployeeMapper.selectEmployee",1);
            System.out.println(employee);
        }finally {
            session.close();
        }
    }
    
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
            // 3. 获取接口的实现类对象
            // 会为接口自动创建一个代理对象，代理对象去执行增删改查方法
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
            System.out.println(mapper);// org.apache.ibatis.binding.MapperProxy@543c6f6d
            // 4. 从数据库获取对象
            Employee employee = mapper.getEmployeeById(1);
            System.out.println(employee);
        }finally {
            session.close();
        }
    }

    @Test
    public void test3() throws IOException {
        // 1. 获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        // 2. 获取sqlSession对象
        SqlSession session = sqlSessionFactory.openSession();
        try{
            // 3. 获取接口的实现类对象
            // 会为接口自动创建一个代理对象，代理对象去执行增删改查方法
            EmployeeMapperAnnotation mapper = session.getMapper(EmployeeMapperAnnotation.class);
            // 4. 从数据库获取对象
            Employee employee = mapper.getEmployeeById(1);
            System.out.println(employee);
        }finally {
            session.close();
        }
    }

    @Test
    public void test4() throws IOException{
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        // 无参方法获得的session不会自动提交数据
        SqlSession session = sqlSessionFactory.openSession();

        try{
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
            // 添加
            Employee employee = new Employee(null, "jerry", "jerry@qq.com", "0");
            mapper.addEmployee(employee);
            System.out.println(employee);

//            // 更新
//            Employee employee = new Employee(2, "jerry", "jerry@163.com", "0");
//            mapper.updateEmployee(employee);

//            // 删除
//            mapper.deleteEmployeeById(2);
//            // 手动提交数据
//            session.commit();
        }finally {
            session.close();
        }
    }

    @Test
    public void test5() throws IOException{
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        // 无参方法获得的session不会自动提交数据
        SqlSession session = sqlSessionFactory.openSession();

        try{
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
            List<Integer> ids = new ArrayList<>();
            ids.add(1);
            Employee employee = mapper.getEmployeeByIds(ids);
            System.out.println(employee);
            session.commit();
        }finally {
            session.close();
        }
    }
    @Test
    public void test6() throws IOException{
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        // 无参方法获得的session不会自动提交数据
        SqlSession session = sqlSessionFactory.openSession();

        try{
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            Map<Integer, Employee> employeeByLastNameLikeReturnMap = mapper.getEmployeeByLastNameLikeReturnMap("%o%");
            System.out.println(employeeByLastNameLikeReturnMap);
            session.commit();
        }finally {
            session.close();
        }
    }

    @Test
    public void test7() throws IOException{
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        // 无参方法获得的session不会自动提交数据
        SqlSession session = sqlSessionFactory.openSession();

        try{
            EmployeeMapperPlus mapper = session.getMapper(EmployeeMapperPlus.class);
            Employee employee = mapper.getEmployeeById(1);
            System.out.println(employee);
            session.commit();
        }finally {
            session.close();
        }
    }

    @Test
    public void test8() throws IOException{
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        // 无参方法获得的session不会自动提交数据
        SqlSession session = sqlSessionFactory.openSession();

        try{
            EmployeeMapperPlus mapper = session.getMapper(EmployeeMapperPlus.class);
//            Employee employee = mapper.getEmployeeAndDept(5);
            Employee employee = mapper.getEmployeeByIdInStep(5);
            System.out.println(employee);
            session.commit();
        }finally {
            session.close();
        }
    }

    @Test
    public void test9() throws IOException{
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        // 无参方法获得的session不会自动提交数据
        SqlSession session = sqlSessionFactory.openSession();

        try{
            DepartmentMapper mapper = session.getMapper(DepartmentMapper.class);
            Department department = mapper.getDepartmentByIdInStep(2);
            System.out.println(department);
            session.commit();
        }finally {
            session.close();
        }
    }

    @Test
    public void test10() throws IOException{
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        // 无参方法获得的session不会自动提交数据
        SqlSession session = sqlSessionFactory.openSession();

        try{
            EmployeeMapperPlus mapper = session.getMapper(EmployeeMapperPlus.class);
            List<Employee> employees = mapper.getEmployeesByDepartmentId(2);
            System.out.println(employees);
            session.commit();
        }finally {
            session.close();
        }
    }


}
