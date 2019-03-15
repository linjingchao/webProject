package com.gupaoedu.vip.pattern.proxy.dynamicproxy.jdkproxy;

import com.gupaoedu.vip.pattern.proxy.inter.Friend;
import com.gupaoedu.vip.pattern.proxy.inter.Person;


public class Girl implements Person,Friend {

    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("有6块腹肌");
    }

    @Override
    public void talk(String str) {
        System.out.println("talk");
        System.out.println(str);
    }
}
