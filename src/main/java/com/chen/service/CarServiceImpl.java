package com.chen.service;

import com.chen.mapper.CarMapper;
import com.chen.pojo.Car;
import com.chen.pojo.Depository;
import com.chen.pojo.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarMapper carMapper;

    @Override
    public List<Car> queryAllCar() {
        return carMapper.queryAllCar();
    }

    @Override
    public void addCar(Map<String, String[]> parameterMap) {
        String[] vins = parameterMap.get("vin");
        String[] ens = parameterMap.get("en");
        String[] models = parameterMap.get("model");
        String[] color = parameterMap.get("color");

        String[] displacement = parameterMap.get("displacement");
        String[] price = parameterMap.get("price");
        String[] deNo = parameterMap.get("deNo");

        Car car = new Car(vins[0], ens[0], new Model(models[0], null, null, null, null), color[0], null,
                displacement[0], new BigDecimal(price[0]), new Depository(deNo[0], null, null, null));

        carMapper.addCar(car);
    }

    @Override
    public Car queryCarByIdPartly1(String vin) {
        return carMapper.queryCarByIdPartly1(vin);
    }

    @Override
    public int updateCarPartly1(Car car) {
        return carMapper.updateCarPartly1(car);
    }

    @Override
    public int updateUnsale(String vin) {
        return carMapper.updateUnsale(vin);
    }

    @Override
    public int updateSale(String vin) {
        return carMapper.updateSale(vin);
    }

    @Override
    public int updateCarModelAdd(String vin) {
        return carMapper.updateCarModelAdd(vin);
    }

    @Override
    public int updateCarModelMinus(String vin) {
        return carMapper.updateCarModelMinus(vin);
    }
}
