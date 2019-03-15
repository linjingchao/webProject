package com.gupaoedu.vip.pattern.proxy.simpleproxy;

import java.io.Serializable;

public class Client implements Serializable {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }

}
