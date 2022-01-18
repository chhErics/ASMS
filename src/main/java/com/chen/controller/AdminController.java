package com.chen.controller;

import com.chen.pojo.Admin;
import com.chen.pojo.Msg;
import com.chen.service.AdminService;
import com.chen.util.MyRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;

//    @RequestMapping("/allAdmin")
//    @ResponseBody
//    public Msg getAdminListWithJson(){
//        List<Admin> list = adminService.queryAllAdmin();
//
//        return Msg.success().add("adminList",list);
//    }

//    查询全部的管理员，返回到展示页面
    @RequestMapping("/allAdmin")
    public String list(Model model){
        List<Admin> list = adminService.queryAllAdmin();
        model.addAttribute("adminList",list);
        return "allAdmin";
    }

    @RequestMapping("/addAdmin")
    public String addAdmin(Admin admin){
        admin.setId(MyRandom.getUUID10());
        adminService.addAdmin(admin);
        return "redirect:/allAdmin";
    }


}
