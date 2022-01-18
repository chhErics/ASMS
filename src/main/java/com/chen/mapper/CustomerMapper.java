package com.chen.mapper;

import com.chen.pojo.Customer;

import java.util.List;

public interface CustomerMapper {

    //查询所有客户
    List<Customer> queryAllCustomer();

    //新增用户
    int insertCustomer(Customer customer);

}
