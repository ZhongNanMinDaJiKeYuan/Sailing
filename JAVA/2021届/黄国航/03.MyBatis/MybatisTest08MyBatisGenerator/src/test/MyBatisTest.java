package test;


import bean.Employee;
import dao.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
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
    public void test2() throws IOException, XMLParserException, SQLException, InterruptedException, InvalidConfigurationException {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("src/Resources/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

    @Test
    public void test3() throws IOException {
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = mapper.selectByPrimaryKey(1);
            System.out.println(employee);
        }finally {
            sqlSession.close();
        }
    }


}
