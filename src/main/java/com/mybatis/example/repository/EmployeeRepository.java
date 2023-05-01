package com.mybatis.example.repository;

import com.mybatis.example.mapper.EmployeeMapper;
import com.mybatis.example.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    @Autowired
    private EmployeeMapper employeeMapper;

    public Employee findEmployeeById(final int id){
        Employee employee = employeeMapper.findEmployeeById(id);
        return employee;
    }
}
