package com.chen.controller;

import com.chen.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public String login(@RequestParam(value = "username", required = false) String username,
                        @RequestParam(value = "password", required = false) String password,
                        HttpServletRequest request){

        System.out.println(username);
        System.out.println(password);
        int login_status = loginService.login(username,password);

        if(login_status >= 1){
            HttpSession session = request.getSession(true);
            session.setAttribute("username",username);
            return "redirect:/allAdmin";
        }

        return "redirect:/index.jsp";
    }


}
