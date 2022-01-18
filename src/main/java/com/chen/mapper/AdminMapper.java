package com.chen.mapper;

import com.chen.pojo.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface AdminMapper {

    //增加一个管理员
    int addAdmin(Admin admin);

    //根据id删除一个管理员
    int deleteAdminById(@Param(value = "id") int id);

    //修改一个管理员
    int updateAdmin(Admin admin);

    //根据id查询一个管理员
    Admin queryAdminById(@Param(value = "id") int id);

    //查询所有管理员
    List<Admin> queryAllAdmin();

    //根据用户名和密码查询一个管理员
    Admin queryAdminByUserNameAndPassword(@Param("username") String username, @Param("password")String password);

}
