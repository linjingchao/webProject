package com.gupaoedu.vip.pattern.singleton.lazy;

public class LazyDoubleCheckSingleton {

    private LazyDoubleCheckSingleton(){

    }

    //防止指令重排序导致数据不一致性
    private static volatile LazyDoubleCheckSingleton lazyDoubleCheckSingleton;

    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton== null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton == null){
                    //会出现指令重排序问题
                    lazyDoubleCheckSingleton =  new LazyDoubleCheckSingleton();
                }

            }

        }
        return lazyDoubleCheckSingleton;
    }
}
