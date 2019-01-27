package com.st.order.utils;

import java.util.Random;

public class KeyUtil {


    public static synchronized String getUniqueString() {
        Random random = new Random();
        Integer num = random.nextInt(90000) + 10000;
        return System.currentTimeMillis() + String.valueOf(num);
    }
}
