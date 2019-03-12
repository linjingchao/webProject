package com.gupaoedu.vip.pattern.singleton.lazy;

import java.io.Serializable;

public class LazySimpleSingleton implements Serializable {

    private LazySimpleSingleton(){

    }

    private static LazySimpleSingleton lazySimpleSingleton;

    public synchronized static LazySimpleSingleton getInstance(){
        if(lazySimpleSingleton == null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
