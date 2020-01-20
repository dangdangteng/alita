package com.angle.alita.mimor.Thread;

import java.beans.Transient;
import java.util.concurrent.ThreadPoolExecutor;

/***
 * @creation purpose : Thread demo
 * @data : 20:55,2019-06-12
 * @author : 『Ezreal』
 * @Character description : 最帅的那个就是我
 ***/
public class ThreadDemoJ {
    public static void main(String[] args) {
        //指定线程的名字便于问题定位
        Thread thread = new Thread("Demo1"){
          @Override
          public void run() {
              System.out.println("Demo1");
          }
        };
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                System.out.println("demo2");
            }
        };
        thread1.setName("demo2");
//        Thread thread2 = new Thread(task,"faf");
//        thread2.interrupt();
//        ThreadPoolExecutor threadPool = new ThreadPoolExecutor();

    }

}
class task implements Runnable{

    @Override
    public void run() {
        System.out.println("test Thread");
    }
}