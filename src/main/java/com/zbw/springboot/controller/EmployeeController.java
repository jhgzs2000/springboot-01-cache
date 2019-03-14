package com.zbw.springboot.controller;

import com.zbw.springboot.bean.Employee;
import com.zbw.springboot.service.EmployeeService;
import org.apache.ibatis.annotations.ResultType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangbin @create 2019-03-14 11:23
 */
@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/emp/{id}")
    public Employee getEmployee(@PathVariable("id") Integer id, Model model){
        Employee employee = employeeService.getEmpById(id);

        return employee;

    }


}
