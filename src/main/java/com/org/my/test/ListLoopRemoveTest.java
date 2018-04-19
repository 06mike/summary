package com.org.my.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by binary on 18/4/17.
 * 如果需要循环对list中的某个元素做remove操作,需要将list转化为iterator进行操作
 */
public class ListLoopRemoveTest {

    public static void main(String[] args) {
//        listTest();
        iteratorTest();
    }

    /**
     * 错误示例
     */
    private static void listTest(){
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        for (String item : list) {
            if("b".equals(item))
                list.remove(item);
        }

    }

    /**
     * 正确用法
     */
    private static void iteratorTest(){
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String item = iterator.next();
            if("b".equals(item))
                iterator.remove();
        }
    }

}
