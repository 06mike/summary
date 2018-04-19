package com.org.my.test;

import java.util.*;

/**
 * Created by binary on 18/4/18.
 * List 删除重复
 */
public class ListRemovalTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("5");
        list.add("2");
        list.add("1");
        list.add("3");
        list.add("2");
        list.add("5");

        // 使用List.contains去重
        List<String> newList2 = new ArrayList<>();
        list.forEach(s->{
            if(!newList2.contains(s))// 如果新列表中不包含当前元素,添加该元素
                newList2.add(s);
        });
        System.out.println(Arrays.toString(newList2.toArray()));

        // 使用Set进行去重
        Set<String> set = new HashSet<>(list);
        set.forEach(s -> {
            System.out.println("set 去重后遍历 = " + s);
        });

        // 去重并按照自然顺序排序
        List<String> newList = new ArrayList<>(new TreeSet<>(list));
        newList.forEach(s -> {
            System.out.println("treeSet 去重后遍历 = " + s);
        });
    }

}
