package com.zbw.springboot.mapper;

import com.zbw.springboot.bean.Employee;
import org.apache.ibatis.annotations.*;

/**
 * @author zhangbin @create 2019-03-14 10:59
 */
@Mapper
public interface EmployeeMapper {
    @Select("select * from employee where id=#{id}")
    public Employee getEmpById(Integer id);

    @Update("update employee set lastName=#{lastName},email=${email}," +
            "gender=#{gender},did=#{dId} where id=#{id}")
    public void updateEmp(Employee employee);

    @Delete("delete from employee where id=#{id}")
    public void deleteEmpById(Integer id);

    @Insert("insert into employee(lastName,email,gender,did) " +
            "values(#{lastName},#{email},#{gender},#{dId})")
    public void insertEmp(Employee employee);

}
