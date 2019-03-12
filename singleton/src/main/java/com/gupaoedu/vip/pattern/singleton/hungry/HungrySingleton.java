package com.gupaoedu.vip.pattern.singleton.hungry;

import java.io.Serializable;

public class HungrySingleton implements Serializable {

    private HungrySingleton(){
        if(hungrySingleton !=null){
            throw new RuntimeException("你特么的已经创建过了");
        }
    }

    //全局变量
    private final static HungrySingleton hungrySingleton = new HungrySingleton();

//    static{
//        hungrySingleton = new HungrySingleton();
//    }

    /**
     * 获取当前对象
     * @return
     */
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    public Object readResolve(){
        return hungrySingleton;
    }
}
