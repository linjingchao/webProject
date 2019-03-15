package com.gupaoedu.vip.pattern.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKMeipo implements InvocationHandler {
    private Object target;

    public Object getInstance(Object person){
        this.target = person;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object o =method.invoke(this.target);
        after();
        return o;

    }

    private void before() {
        System.out.println("准备物色");
    }

    private void after() {
        System.out.println("办事");
    }
}
