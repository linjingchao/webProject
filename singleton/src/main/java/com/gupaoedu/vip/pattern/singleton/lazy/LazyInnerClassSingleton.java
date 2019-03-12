package com.gupaoedu.vip.pattern.singleton.lazy;

import java.io.Serializable;

public class LazyInnerClassSingleton implements Serializable {
    private LazyInnerClassSingleton(){
        //类似饿汉模式
        if(LazyHolder.LAZY !=null){
            throw new RuntimeException("已经创建过了");
        }
    }

    public static LazyInnerClassSingleton getInstance(){
        //只有调用到这，才会执行内部类加载
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

    public Object readResolve(){
        return LazyHolder.LAZY;
    }
}
