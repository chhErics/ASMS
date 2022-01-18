package com.chen.mapper;

import com.chen.pojo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {

    //查询所有订单
    List<Order> queryAllOrder();

    //根据订单ID删除订单
    int deleteOrderById(@Param(value = "orderId") String orderId);

    //根据vin查是否有该订单
    Order queryOrderByVin(@Param(value = "vin") String vin);

    //添加新订单
    int addOrder(Order order);

    //根据订单号修改订单的成交价
    void updateOrderPriceById(@Param(value = "orderId") String orderId,
                              @Param(value = "price") String price);
}
