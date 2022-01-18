package com.chen.mapper;

import com.chen.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {

    //查询所有员工
    List<Employee> queryAllEmployee();

}
