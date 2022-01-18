package com.chen.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDate {
    public static String getDate(){
        Date date1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        return sdf.format(date1);

    }
}
