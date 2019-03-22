package com.gupaoedu.vip.pattern.delegate.simple;

public class EployeeB implements IEployee{
    public void doing(String command) {
        System.out.println("B,开始干"+command+"工作");
    }
}
