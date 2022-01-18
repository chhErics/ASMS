package com.chen.service;

import com.chen.pojo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderService {
    //查询所有订单
    List<Order> queryAllOrder();

    //根据订单ID删除订单
    int deleteOrderById(String orderId);

    //根据vin查是否有该订单
    Order queryOrderByVin(String vin);

    //添加订单并且将该车型的销量+1,库存-1
    void addOrder(Order order);

    //删除订单并且将该车型的销量-1,库存+1
    void deleteOrder(String orderId, String vin);

    //根据订单号修改订单的成交价
    void updateOrderPriceById(String orderId, String price);
}
