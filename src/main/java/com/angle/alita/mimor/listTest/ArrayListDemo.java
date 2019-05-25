package com.angle.alita.mimor.listTest;


import java.util.ArrayList;
import java.util.List;

/***
 * @creation purpose : 测试ArrayList
 * @data : 21:06,2019-05-22
 * @author : 『Ezreal』
 * @Character description : 最帅的那个就是我
 ***/
public class ArrayListDemo {
    private static int len = 16;

    public static void main(String[] args) {
        List arrayList = new ArrayList();
        List brrayList = new ArrayList(len);
//        long time_1 = System.nanoTime();
//        for (int i=0;i<len;i++){
//            arrayList.add(i);
//        }
//        long time_2 = System.nanoTime();
//        for (int j=0;j<len;j++){
//            brrayList.add(j);
//        }
//        long time_3 = System.nanoTime();
//        System.out.println(time_2-time_1);
//        System.out.println(time_3-time_2);
//
        for (int i=0;i<len;i++){
            brrayList.add(i+"test");
        }
        brrayList.set(5,"tanqiyu");
        System.out.println(brrayList.toString());
    }

}
