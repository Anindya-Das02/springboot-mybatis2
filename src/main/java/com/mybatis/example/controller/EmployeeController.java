package com.mybatis.example.controller;

import com.mybatis.example.models.Employee;
import com.mybatis.example.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    @ResponseBody
    public ResponseEntity<?> index(){
        return ResponseEntity.ok(Map.of("status","server up"));
    }

    @GetMapping("/employee/{id}")
    @ResponseBody
    public Employee getEmployeeDetailsById(@PathVariable("id") int id){
        log.info("invoking getEmployeeDetailsById with id:{}",id);
        return employeeService.getEmployeeById(id);
    }
}
