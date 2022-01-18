package com.chen.mapper;

import com.chen.pojo.Depository;

import java.util.List;

public interface DepositoryMapper {

    //查询所有仓库
    List<Depository> queryAllDepository();

}
