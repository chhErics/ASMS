package com.chen.service;

import com.chen.pojo.Depository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DepositoryService {

    //查询所有仓库
    List<Depository> queryAllDepository();

}
