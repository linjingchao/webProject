package com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy;

import com.gupaoedu.vip.pattern.proxy.dynamicproxy.jdkproxy.Girl;
import com.gupaoedu.vip.pattern.proxy.inter.Person;

import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;

public class GPProxyTest {
    public static void main(String[] args) throws Throwable{
        Person obj = (Person) new GPMeipo().getInstance(new Girl());
        System.out.println(obj.getClass());
        obj.findLove();
    }
}
