package com.chen.service;

import com.chen.mapper.AdminMapper;
import com.chen.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public int login(String username, String password) {

        Admin admin = adminMapper.queryAdminByUserNameAndPassword(username, password);
        if(admin != null)
            return 1;

        return 0;
    }
}
