package com.chen.service;

import com.chen.mapper.DepositoryMapper;
import com.chen.pojo.Depository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepositoryServiceImpl implements DepositoryService{
    @Autowired
    private DepositoryMapper depositoryMapper;

    @Override
    public List<Depository> queryAllDepository() {
        return depositoryMapper.queryAllDepository();
    }
}
