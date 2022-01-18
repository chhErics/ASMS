package com.chen.service;

import com.chen.mapper.EmployeeMapper;
import com.chen.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> queryAllEmployee() {
        return employeeMapper.queryAllEmployee();
    }
}
