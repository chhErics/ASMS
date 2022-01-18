package com.chen.controller;

import com.chen.pojo.Car;
import com.chen.pojo.Depository;
import com.chen.service.CarService;
import com.chen.service.DepositoryService;
import com.chen.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class CarController {
    @Autowired
    private CarService carService;
    @Autowired
    private ModelService modelService;
    @Autowired
    private DepositoryService depositoryService;

    @RequestMapping("/allCar")
    public String list(Model model){
        List<Car> cars = carService.queryAllCar();
        List<com.chen.pojo.Model> models = modelService.queryAllModel();
        List<Depository> depositories = depositoryService.queryAllDepository();
        model.addAttribute("carList",cars);
        model.addAttribute("modelList",models);
        model.addAttribute("depositoryList",depositories);

        return "allCar";
    }

    @RequestMapping("/addCar")
    public String addCar(HttpServletRequest request){

        Map<String, String[]> parameterMap = request.getParameterMap();
        carService.addCar(parameterMap);

        return "redirect:/allCar";
    }

    @RequestMapping("/editCar")
    public String editCar(@RequestParam(value = "vin") String vin,Model model){
        Car car = carService.queryCarByIdPartly1(vin);
        model.addAttribute("car",car);
        return "editCar";
    }

    @RequestMapping("/updateCar")
    public String updateCar(Car car){
        carService.updateCarPartly1(car);
        return "redirect:/allCar";
    }

}
