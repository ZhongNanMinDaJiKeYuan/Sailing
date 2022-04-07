package dao;

import bean.Employee;

import java.util.List;

public interface EmployeeMapper {

    // 携带了哪个字段、查询条件就带上这个字段的值
    public List<Employee> getEmployeeByConditionIf(Employee employee);

    public List<Employee> getEmployeeByConditionTrim(Employee employee);

    public void updateEmployee(Employee employee);


}
