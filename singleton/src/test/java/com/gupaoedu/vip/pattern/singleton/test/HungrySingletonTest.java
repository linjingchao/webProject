package com.gupaoedu.vip.pattern.singleton.test;

public class HungrySingletonTest {

    public static void main(String[] args) {
        //多线程测试(虽然没啥意义)
        Thread t1=new Thread(new ExectorThread());
        Thread t2=new Thread(new ExectorThread());

        t1.start();
        t2.start();
        System.out.println("end");

        //反射破坏


    }
}
