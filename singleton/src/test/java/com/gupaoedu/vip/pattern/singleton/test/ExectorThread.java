package com.gupaoedu.vip.pattern.singleton.test;

import com.gupaoedu.vip.pattern.singleton.hungry.HungrySingleton;
import com.gupaoedu.vip.pattern.singleton.lazy.LazySimpleSingleton;
import com.gupaoedu.vip.pattern.singleton.threadLocal.ThreadLocalSingleton;

public class ExectorThread implements Runnable{
    Object object;

    public void run() {
        //饿汉模式
        //HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        //懒汉模式
         object = ThreadLocalSingleton.getInstance();
        //打印当前线程名字和类地址
        System.out.println(Thread.currentThread().getName() + ":" +object);
    }
}
