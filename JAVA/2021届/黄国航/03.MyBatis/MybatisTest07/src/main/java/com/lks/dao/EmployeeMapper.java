package com.lks.dao;


import com.lks.bean.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {

    // 单个字面量类型的参数
    Employee getEmployeeById(Integer id);

    // 两个字面量类型的参数
    Employee getEmployeeByIdAndName(@Param("id") Integer id, String name);

    // 实体类型的参数
    Employee getEmployeeByIdAndNameInEmp (Employee emp);

    // 多组合实体类型的参数
    Employee getEmployeeByIdAndNameInEmp2 (Integer id, Employee emp);

    //多组合类型
    Employee getEmployeeByIdAndNameInList (List<Integer> ids, String name);

    // List
    Employee getEmployeeByIdAndNameInList2 (List<Integer> ids);


}
