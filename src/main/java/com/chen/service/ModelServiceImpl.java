package com.chen.service;

import com.chen.mapper.ModelMapper;
import com.chen.pojo.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ModelServiceImpl implements ModelService{
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<Model> queryAllModel() {
        return modelMapper.queryAllModel();
    }
}
