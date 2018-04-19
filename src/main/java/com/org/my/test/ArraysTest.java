package com.org.my.test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by binary on 18/4/17.
 * java.util.arrays 测试类
 */
public class ArraysTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e");
        String[] array = new String[list.size()];
        array = list.toArray(array);
        System.out.println(Arrays.toString(array));

        int[] array2 = new int[5];
        Arrays.fill(array2, 3);// 填充数组
        System.out.println(Arrays.toString(array2));

        int[] array3 = {3, 2, 1, 5, 4};
        Arrays.sort(array3);// 排序
        System.out.println(Arrays.toString(array3));

        int[] array4 = {1, 2, 3};
        int[] array5 = {1, 2, 3};
        System.out.println(Arrays.equals(array4, array5));// 比较数组元素是否相等

    }


}
