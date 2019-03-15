package com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy;

import java.lang.reflect.Method;

public class GPMeipo implements GPInvocationHandler {
    private Object target;

    public Object getInstance(Object person){
        this.target = person;
        Class<?> clazz =person.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = method.invoke(this.target,args);
        return obj;
    }
}
