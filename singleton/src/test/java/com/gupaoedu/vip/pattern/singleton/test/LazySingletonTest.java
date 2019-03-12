package com.gupaoedu.vip.pattern.singleton.test;

public class LazySingletonTest {

    public static void main(String[] args) {
        Thread t1 =new Thread(new ExectorThread());
        Thread t2 =new Thread(new ExectorThread());

        t1.start();
        t2.start();

        System.out.println("end");
    }
}
