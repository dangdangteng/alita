package com.angle.alita.mimor.hashcodeandequals;

/**
 * saber-opensource
 * 2020/1/20,2:56 下午
 */
public class Demo1 {
  public static void main(String[] args) {
    //
    String a = "asdf123";
    String b = "asdf";
    String c = "123";
    boolean equals = a.equals(b+c);
    boolean b1 = a.hashCode() == (b+c).hashCode();
    System.out.println(equals+":"+b1);
  }
}
