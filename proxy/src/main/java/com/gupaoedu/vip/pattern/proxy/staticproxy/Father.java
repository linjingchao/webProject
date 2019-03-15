package com.gupaoedu.vip.pattern.proxy.staticproxy;

import com.gupaoedu.vip.pattern.proxy.inter.Person;

import java.io.Serializable;

public class Father implements  Serializable {
    private Son person;

    public Father(Son person){
        this.person =person;
    }
    public void findLove() {

        System.out.println("父亲物色对象");
        this.person.findLove();
        System.out.println("确立关系");
    }
}
