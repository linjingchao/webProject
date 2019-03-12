package com.gupaoedu.vip.pattern.singleton.test;

import com.gupaoedu.vip.pattern.singleton.hungry.HungrySingleton;
import com.gupaoedu.vip.pattern.singleton.lazy.LazyInnerClassSingleton;
import com.gupaoedu.vip.pattern.singleton.lazy.LazySimpleSingleton;

import java.lang.reflect.Constructor;

/**
 * 反射破坏
 */
public class ReflexTest {

    public static void main(String[] args) {

        //Class<?> clazz = HungrySingleton.class;
        //Class<?> clazz = LazySimpleSingleton.class;
        Class<?> clazz = LazyInnerClassSingleton.class;

        try {
            Constructor c=clazz.getDeclaredConstructor(null);
            c.setAccessible(true);

            //调用构造方法初始化
            Object o1 = c.newInstance();
            //再次调用创建两个对象
            Object o2 = c.newInstance();

            System.out.println(o1 == o2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
