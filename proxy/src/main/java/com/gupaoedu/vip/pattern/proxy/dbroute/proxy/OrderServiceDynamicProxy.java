package com.gupaoedu.vip.pattern.proxy.dbroute.proxy;


import com.gupaoedu.vip.pattern.proxy.dbroute.Order;
import com.gupaoedu.vip.pattern.proxy.dbroute.OrderService;
import com.gupaoedu.vip.pattern.proxy.dbroute.db.DynamicDataSourceEntity;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;

public class OrderServiceDynamicProxy implements InvocationHandler {
    private SimpleDateFormat sdf =new SimpleDateFormat("yyyy");

    private Object object;

    public Object getInstance(Object object){
        this.object = object;
        Class<?> clazz = object.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        for(Object a : args){
            System.out.println(a);
        }
        Object o = method.invoke(this.object, args);
        after();
        return o;
    }

    private void after() {
        DynamicDataSourceEntity.restore();
        System.out.println("restore");
    }

}
