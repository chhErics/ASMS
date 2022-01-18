package com.chen.util;

import java.util.UUID;

public class MyRandom {

    public static String getUUID10() {

        return UUID.randomUUID().toString().replace("-", "").toLowerCase().substring(0,10);

    }
}