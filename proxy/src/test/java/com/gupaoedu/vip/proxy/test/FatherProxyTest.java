package com.gupaoedu.vip.proxy.test;

import com.gupaoedu.vip.pattern.proxy.staticproxy.Father;
import com.gupaoedu.vip.pattern.proxy.staticproxy.Son;

public class FatherProxyTest {
    public static void main(String[] args) {
        Father father =new Father(new Son());
        father.findLove();
    }
}
