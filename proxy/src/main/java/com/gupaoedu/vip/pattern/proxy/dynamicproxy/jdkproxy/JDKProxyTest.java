package com.gupaoedu.vip.pattern.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.Method;

public class JDKProxyTest {
    public static void main(String[] args) {
        try{
            //生成代理$Proxy0代理类
            //实现父类所有接口方法
            Object o =new JDKMeipo().getInstance(new Girl());
            Method m =o.getClass().getMethod("findLove");
            //调用接口的实例对象的方法-->其实时调用生成代理类的invoke方法
            for(Class c:m.getParameterTypes()){
                System.out.println(c.getName());
                System.out.println(c.getSimpleName());
            }
            m.invoke(o);



//           byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
//            FileOutputStream fileOutputStream = new FileOutputStream("proxy0.class");
//            fileOutputStream.write(bytes);
//            fileOutputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
