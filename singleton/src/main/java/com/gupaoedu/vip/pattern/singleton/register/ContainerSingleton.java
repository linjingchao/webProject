package com.gupaoedu.vip.pattern.singleton.register;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton implements Serializable {

    private ContainerSingleton(){}

    private static Map<String,Object> ioc= new ConcurrentHashMap<String, Object>();

    public static Object getInstance(String className){
        //当前key不存在
        if(!ioc.containsKey(className)){
            Object obj = null;
            try{
               obj = Class.forName(className).newInstance();
               ioc.put(className,obj);
            }catch (Exception e){
                e.printStackTrace();
            }
            return obj;
        }else {
            return ioc.get(className);
        }
    }
}
