package com.angle.alita.mimor.Hash;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * saber-opensource
 * 2020/1/20,3:53 下午
 */
public class HashTabelDemo {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable(11);
        hashtable.put("", 1);
        HashMap hashMap = new HashMap(16);
        hashMap.put("", 1);
        System.out.println(hashtable.toString());
        System.out.println(hashMap.toString());
    }
}
