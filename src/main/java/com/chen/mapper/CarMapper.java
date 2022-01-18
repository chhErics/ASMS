package com.chen.mapper;

import com.chen.pojo.Car;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarMapper {

    //查询所有车辆
    List<Car> queryAllCar();

    //新增一辆车
    void addCar(Car car);

    //根据vin查找一辆车（只查出vin,color,displacement,price字段）
    Car queryCarByIdPartly1(@Param(value = "vin") String vin);

    //根据vin修改车辆的color,displacement,price信息
    int updateCarPartly1(Car car);

    //将车辆设置为未售出，根据vin
    int updateUnsale(@Param(value = "vin") String vin);

    //将车辆设置为已售出，根据vin
    int updateSale(@Param(value = "vin")String vin);

    //根据vin将该车辆所属车型销量+1,库存-1
    int updateCarModelAdd(@Param(value = "vin") String vin);

    //根据vin将该车辆所属车型销量-1,库存+1
    int updateCarModelMinus(@Param(value = "vin") String vin);
}
