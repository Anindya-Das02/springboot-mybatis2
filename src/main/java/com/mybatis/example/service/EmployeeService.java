package com.mybatis.example.service;

import com.mybatis.example.models.Employee;
import com.mybatis.example.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getEmployeeById(final int id){
        log.info("invoking getEmployeeById ...");
        return employeeRepository.findEmployeeById(id);
    }
}
