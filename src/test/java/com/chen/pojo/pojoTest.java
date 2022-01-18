package com.chen.pojo;

import com.chen.util.GetDate;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;


public class pojoTest {
    @Test
    public void test1(){

        Date date1 = new Date();
        System.out.println(date1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String f1 = sdf.format(date1);
        System.out.println(f1);

        System.out.println("工具类---->" + GetDate.getDate());

    }
}
