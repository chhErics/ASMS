package com.chen.controller;


import com.chen.pojo.Customer;
import com.chen.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/allCustomer")
    public String list(Model model){
        List<Customer> customers = customerService.queryAllCustomer();
        model.addAttribute("customerList",customers);
        return "allCustomer";
    }

    @RequestMapping("/addCustomer")
    public String list(Customer customer){
        System.out.println(customer);
        customerService.insertCustomer(customer);
        return "redirect:/allCustomer";
    }

}
