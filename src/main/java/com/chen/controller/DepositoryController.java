package com.chen.controller;

import com.chen.pojo.Depository;
import com.chen.pojo.Employee;
import com.chen.service.DepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DepositoryController {
    @Autowired
    private DepositoryService depositoryService;

    @RequestMapping("/allDepository")
    public String list(Model model){
        List<Depository> depositories = depositoryService.queryAllDepository();
        model.addAttribute("depositoryList", depositories);
        return "allDepository";
    }

}
