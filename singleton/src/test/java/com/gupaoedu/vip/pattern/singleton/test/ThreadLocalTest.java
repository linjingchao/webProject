package com.gupaoedu.vip.pattern.singleton.test;

import com.gupaoedu.vip.pattern.singleton.threadLocal.ThreadLocalSingleton;

public class ThreadLocalTest {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 =new Thread(new ExectorThread());
        Thread t2 =new Thread(new ExectorThread());

        t1.start();
        t2.start();
    }

}
