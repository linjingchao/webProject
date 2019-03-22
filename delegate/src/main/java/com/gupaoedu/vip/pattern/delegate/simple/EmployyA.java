package com.gupaoedu.vip.pattern.delegate.simple;

public class EmployyA implements IEployee{
    public void doing(String command) {
        System.out.println("A,开始干"+command+"工作");
    }
}
