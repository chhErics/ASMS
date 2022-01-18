package com.chen.service;

import com.chen.mapper.CustomerMapper;
import com.chen.pojo.Customer;
import com.chen.util.MyRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> queryAllCustomer() {
        return customerMapper.queryAllCustomer();
    }

    @Override
    public int insertCustomer(Customer customer) {
        customer.setCustomerId(MyRandom.getUUID10());
        return customerMapper.insertCustomer(customer);
    }
}
