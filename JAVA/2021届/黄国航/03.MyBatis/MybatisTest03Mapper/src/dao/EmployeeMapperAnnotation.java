package dao;

import bean.Employee;
import org.apache.ibatis.annotations.Select;

public interface EmployeeMapperAnnotation {

    @Select("select * from mybatis_test.employee where id = #{id}")
    public Employee getEmployeeById(Integer id);
}
