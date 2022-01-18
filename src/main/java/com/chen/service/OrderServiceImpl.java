package com.chen.service;

import com.chen.mapper.OrderMapper;
import com.chen.pojo.Order;
import com.chen.util.GetDate;
import com.chen.util.MyRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private CarService carService;

    @Override
    public List<Order> queryAllOrder() {
        return orderMapper.queryAllOrder();
    }

    @Override
    public int deleteOrderById(String orderId) {
        return orderMapper.deleteOrderById(orderId);
    }

    @Override
    public Order queryOrderByVin(String vin) {
        return orderMapper.queryOrderByVin(vin);
    }

    @Override
    public void addOrder(Order order) {
        //先检查该车辆是否卖出，如果已经卖出，则不可再次卖出
        Order order1 = this.queryOrderByVin(order.getVin());
        if(order1!=null) return;
        //如果还未售出
        order.setOrderId(MyRandom.getUUID10());
        order.setDealTime(GetDate.getDate());
        int i = orderMapper.addOrder(order);
        //如果订单创建成功
        if(i==1){
            //把该车辆所属车型销量+1,库存-1
            carService.updateCarModelAdd(order.getVin());
            //把该车辆标记为已售出
            carService.updateSale(order.getVin());
        }
    }

    @Override
    public void deleteOrder(String orderId, String vin) {
        int i = this.deleteOrderById(orderId);
        if(i==1){ //删除订单成功
            //把该车辆所属车型销量+1,库存-1
            carService.updateCarModelMinus(vin);
        }
    }

    @Override
    public void updateOrderPriceById(String orderId, String price) {
        orderMapper.updateOrderPriceById(orderId,price);
    }
}
