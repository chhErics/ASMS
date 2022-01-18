package com.chen.service;

import com.chen.mapper.AdminMapper;
import com.chen.mapper.CarMapper;
import com.chen.mapper.OrderMapper;
import com.chen.pojo.*;
import com.chen.util.MyRandom;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class ServiceTest {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //注意：这个bean名字首字母要小写
        AdminServiceImpl adminServiceImpl = (AdminServiceImpl) context.getBean("adminServiceImpl");
//        System.out.println(adminServiceImpl);
//        AdminMapper adminMapper = (AdminMapper) context.getBean("adminMapper");
//        System.out.println(adminMapper);
//        String id = MyRandom.getUUID10();
//        System.out.println(id);
//
//        int i = adminServiceImpl.addAdmin(new Admin(id, "小明", "xiaoming", "123456", 17));
//        System.out.println(i);
        Admin admin = adminServiceImpl.queryAdminByUserNameAndPassword("root", "123456");
        List<Admin> list = adminServiceImpl.queryAllAdmin();
        System.out.println(list);
        System.out.println(admin);

        //===========================================================

    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //注意：这个bean名字首字母要小写
        EmployeeServiceImpl employeeServiceImpl = (EmployeeServiceImpl) context.getBean("employeeServiceImpl");
        List<Employee> employees = employeeServiceImpl.queryAllEmployee();
        System.out.println(employees);
    }

    //===============================================================

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //注意：这个bean名字首字母要小写
        DepositoryServiceImpl depositoryServiceImpl = (DepositoryServiceImpl) context.getBean("depositoryServiceImpl");
        List<Depository> depositories = depositoryServiceImpl.queryAllDepository();
        System.out.println(depositories);
    }

    //===============================================================

    @Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //注意：这个bean名字首字母要小写
        ModelServiceImpl modelServiceImpl = (ModelServiceImpl) context.getBean("modelServiceImpl");
        System.out.println(modelServiceImpl);
        List<Model> models = modelServiceImpl.queryAllModel();
        System.out.println(models);

    }


    //===============================================================

    @Test
    public void test5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //注意：这个bean名字首字母要小写
        CustomerServiceImpl customerServiceImpl = (CustomerServiceImpl) context.getBean("customerServiceImpl");
//        List<Customer> customers = customerServiceImpl.queryAllCustomer();
//        System.out.println(customers);

        int i = customerServiceImpl.insertCustomer(new Customer(null, "插入1", "男", 16));
        System.out.println(i);

    }


    //===============================================================

    @Test
    public void test6(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //注意：这个bean名字首字母要小写
        CarServiceImpl carServiceImpl = (CarServiceImpl) context.getBean("carServiceImpl");
        List<Car> cars = carServiceImpl.queryAllCar();
        System.out.println(cars);

    }

    //===============================================================

    @Test
    public void test7(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //注意：这个bean名字首字母要小写
        CarMapper carMapper = (CarMapper) context.getBean("carMapper");
        carMapper.addCar(new Car("9234hbh","324hhs",new Model("C3449", null, null, null, null)
        ,"black", null, "2.0",new BigDecimal(89999),
                new Depository("0003",null,null,null)));


    }

    //===============================================================

    @Test
    public void test8(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //注意：这个bean名字首字母要小写
        CarMapper carMapper = (CarMapper) context.getBean("carMapper");
        Car car = carMapper.queryCarByIdPartly1("9234hbh");
        System.out.println(car);
    }

    //===============================================================

    @Test
    public void test9(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //注意：这个bean名字首字母要小写
        CarService carService = (CarServiceImpl) context.getBean("carServiceImpl");
//        int i = carService.updateCarPartly1(new Car("9234hbh", null, null, "black",
//                null, "2.0", new BigDecimal("89999"), null));
//        System.out.println(i);
        int i = carService.updateSale("9234hbh");
        System.out.println(i);
    }

    //===============================================================

    @Test
    public void test10(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //注意：这个bean名字首字母要小写
        OrderMapper orderMapper = (OrderMapper) context.getBean("orderMapper");
//        List<Order> orders = orderMapper.queryAllOrder();
//        System.out.println(orders);
        int i = orderMapper.deleteOrderById("gfhb213");
        System.out.println(i);
    }

    //===============================================================

    @Test
    public void test11(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //注意：这个bean名字首字母要小写
        OrderServiceImpl orderServiceImpl = (OrderServiceImpl) context.getBean("orderServiceImpl");
        Order gfhb213 = orderServiceImpl.queryOrderByVin("9234hbh");
        System.out.println(gfhb213);
    }
}
