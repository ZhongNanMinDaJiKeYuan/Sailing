package dao;

import bean.Department;

public interface DepartmentMapper {
    public Department getDepartmentById(Integer id);

    public Department getDepartmentByIdPlus(Integer id);

    public Department getDepartmentByIdInStep(Integer id);
}
