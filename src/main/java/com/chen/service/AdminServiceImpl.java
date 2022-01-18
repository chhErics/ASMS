package com.chen.service;

import com.chen.mapper.AdminMapper;
import com.chen.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

//    public void setAdminMapper(AdminMapper adminMapper) {
//        this.adminMapper = adminMapper;
//    }

    @Override
    public int addAdmin(Admin admin) {
        return adminMapper.addAdmin(admin);
    }

    @Override
    public int deleteAdminById(int id) {
        return adminMapper.deleteAdminById(id);
    }

    @Override
    public int updateAdmin(Admin admin) {
        return adminMapper.updateAdmin(admin);
    }

    @Override
    public Admin queryAdminById(int id) {
        return adminMapper.queryAdminById(id);
    }

    @Override
    public List<Admin> queryAllAdmin() {
        return adminMapper.queryAllAdmin();
    }

    @Override
    public Admin queryAdminByUserNameAndPassword(String username, String password) {
        return adminMapper.queryAdminByUserNameAndPassword(username, password);
    }
}
