package com.chen.service;

import com.chen.pojo.Admin;

import java.util.List;

public interface AdminService {

    //增加一个管理员
    int addAdmin(Admin admin);

    //根据id删除一个管理员
    int deleteAdminById(int id);

    //修改一个管理员
    int updateAdmin(Admin admin);

    //根据id查询一个管理员
    Admin queryAdminById(int id);

    //查询所有管理员
    List<Admin> queryAllAdmin();


    //根据用户名和密码查询一个管理员
    Admin queryAdminByUserNameAndPassword(String username, String password);


}
