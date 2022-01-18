package com.chen.controller;

import com.chen.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ModelController {
    @Autowired
    private ModelService modelService;

    @RequestMapping("/allModel")
    public String list(Model model){
        List<com.chen.pojo.Model> models = modelService.queryAllModel();
        model.addAttribute("modelList",models);
        return "allModel";
    }


}
