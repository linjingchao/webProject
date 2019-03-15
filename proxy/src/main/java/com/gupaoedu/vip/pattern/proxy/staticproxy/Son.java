package com.gupaoedu.vip.pattern.proxy.staticproxy;

import com.gupaoedu.vip.pattern.proxy.inter.Person;

import java.io.Serializable;

public class Son implements Serializable {
    public void findLove() {
        System.out.println("儿子要求");
    }

}
