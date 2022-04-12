package com.lks.springbootwithmybatis.dao;



import com.lks.springbootwithmybatis.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    // 单个字面量类型的参数
    Employee getEmployeeById(Integer id);

    // 两个字面量类型的参数
    Employee getEmployeeByIdAndName(@Param("id") Integer id, String name);



}
