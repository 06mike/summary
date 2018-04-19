package com.org.my.test;

import java.util.Calendar;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by binary on 18/4/18.
 * HashTable 循环测试: 通过测试Map.entrySet效率较高
 * HashTable 特点:
 *
 */
public class HashTableLoopTest {

    public static void main(String[] args) {
        Hashtable<String, Object> table = new Hashtable<>(16);
        table.put("1", "1");
        table.put("2", "2");
        table.put("3", "3");
        table.put("4", "4");
        table.put("5", "5");
        table.put("6", "6");

        Long begin = Calendar.getInstance().getTimeInMillis();
        for (Map.Entry<String, Object> entry : table.entrySet()) {
            System.out.println("key=" + entry.getKey() + " value=" + entry.getValue());
        }
        Long end = Calendar.getInstance().getTimeInMillis();
        System.out.println("Map.entrySet 耗时 " + (end - begin));

        Long begin2 = Calendar.getInstance().getTimeInMillis();
        table.forEach((k, v) -> {
            System.out.println("key=" + k + " value=" + v);
        });
        Long end2 = Calendar.getInstance().getTimeInMillis();
        System.out.println("jdk8 耗时" + (end2 - begin2));

    }

}
