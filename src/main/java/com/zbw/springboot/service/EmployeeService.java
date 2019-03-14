package com.zbw.springboot.service;

import com.zbw.springboot.bean.Employee;
import com.zbw.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author zhangbin @create 2019-03-14 11:20
 */
@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    @Cacheable(cacheNames = {"emp"})
    public Employee getEmpById(Integer id){
        System.out.println("查询--"+id+"号员工");
        Employee emp = employeeMapper.getEmpById(id);
        return emp;

    }


}
