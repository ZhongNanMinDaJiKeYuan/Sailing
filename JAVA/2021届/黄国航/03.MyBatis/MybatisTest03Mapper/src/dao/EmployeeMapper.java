package dao;

import bean.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {

    public Employee getEmployeeById(Integer id);

    public Map<String, Object> getEmployeeByIdReturnMap(Integer id);

    // 告诉mybatis封装这个map的时候使用哪个属性作为map的key
    @MapKey("last_name")
    public Map<Integer, Employee> getEmployeeByLastNameLikeReturnMap(String lastName);

    public Employee getEmployeeByIds(@Param("ids") List<Integer> ids);

    public Long addEmployee(Employee employee);

    public Integer updateEmployee(Employee employee);

    public boolean deleteEmployeeById(Integer id);




}
