package com.gupaoedu.vip.pattern.singleton.threadLocal;

import java.io.Serializable;

public class ThreadLocalSingleton implements Serializable {
    private ThreadLocalSingleton(){

    }

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {

                    return new ThreadLocalSingleton();
                }
            };

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }
}
