package com.gupaoedu.vip.pattern.proxy.simpleproxy;

public class Proxy {
    public Subject subject;

    public Proxy(Subject subject){
        this.subject = subject;
    }

    public void request(){
        before();
        subject.request();
        after();
    }

    private void before() {
        System.out.println("called before request()");
    }

    private void after() {
        System.out.println("called after request()");
    }
}
