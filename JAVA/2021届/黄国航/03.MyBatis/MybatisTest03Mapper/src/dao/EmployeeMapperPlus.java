package dao;

import bean.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeMapperPlus {

    public Employee getEmployeeById(Integer id);

    public Employee getEmployeeAndDept(Integer id);

    public Employee getEmployeeByIdInStep(Integer id);

    public List<Employee> getEmployeesByDepartmentId(Integer id);
}
