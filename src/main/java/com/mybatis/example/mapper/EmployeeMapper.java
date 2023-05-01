package com.mybatis.example.mapper;

import com.mybatis.example.models.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EmployeeMapper {
    Employee findEmployeeById(@Param("id") int id);
}
