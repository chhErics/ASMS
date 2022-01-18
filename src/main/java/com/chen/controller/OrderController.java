package com.chen.controller;

import com.chen.pojo.Admin;
import com.chen.pojo.Order;
import com.chen.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/allOrder")
    public String list(Model model){
        List<Order> orders = orderService.queryAllOrder();
        model.addAttribute("orderList",orders);
        return "allOrder";
    }

    @RequestMapping("/addOrder")
    public String addOrder(Order order){
        orderService.addOrder(order);
        return "redirect:/allOrder";
    }

    @RequestMapping("/deleteOrder")
    public String deleteOrder(@RequestParam(value = "orderId") String orderId
            , @RequestParam(value = "vin") String vin){
        orderService.deleteOrder(orderId,vin);

        return "redirect:/allOrder";
    }

    @RequestMapping("/editOrder")
    public String editOrder(@RequestParam(value = "orderId") String orderId
            , @RequestParam(value = "price") String price,Model model){
        model.addAttribute("orderId",orderId);
        model.addAttribute("price",price);
        return "editOrder";
    }

    @RequestMapping("/updateOrder")
    public String updateOrder(@RequestParam(value = "orderId") String orderId
            , @RequestParam(value = "price") String price){
        orderService.updateOrderPriceById(orderId,price);
        return "redirect:/allOrder";
    }

}
