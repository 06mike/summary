package com.my.test.set;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by binary on 18/4/17.
 * map的初始化和遍历 : 通过测试使用Map.Entry 方式循环效率最高
 */
public class MapLoopTest {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>(16);
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");
        map.put("5", "5");
        map.put("6", "6");

        Long begin = Calendar.getInstance().getTimeInMillis();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println("key=" + entry.getKey() + "value=" + entry.getValue());
        }
        Long end = Calendar.getInstance().getTimeInMillis();
        System.out.println("总耗时:" + (end - begin));

        Map<String, Object> map2 = new HashMap<>(16);
        map2.put("1", "1");
        map2.put("2", "2");
        map2.put("3", "3");
        map2.put("4", "4");
        map2.put("5", "5");
        map2.put("6", "6");
        // jdk8
        Long begin2 = Calendar.getInstance().getTimeInMillis();
        map2.forEach((k, v) -> {
            System.out.println("key=" + k + "value=" + v);
        });
        Long end2 = Calendar.getInstance().getTimeInMillis();
        System.out.println("总耗时" + (end2 - begin2));


    }

}
