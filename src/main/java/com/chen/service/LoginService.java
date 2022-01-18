package com.chen.service;

import com.chen.pojo.Admin;

public interface LoginService {

    //1表示登陆成功,0表示登录失败
    int login(String username,String password);


}
