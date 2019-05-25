package com.angle.alita.mimor.mapTest;

import java.util.HashMap;
import java.util.Map;

/***
 * @creation purpose : map 遍历
 * @data : 21:09,2019-05-20
 * @author : 『Ezreal』
 * @Character description : 最帅的那个就是我
 ***/
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Object> hashMap = new HashMap<>(16);
        hashMap.put("test1",12345);
        hashMap.put("test2",109876);
        hashMap.forEach((key,value)->{
            if ("test1".equals(key)){
                System.out.println(value);
            }
        });
        for (Map.Entry<String,Object> entry : hashMap.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }
    }
}
