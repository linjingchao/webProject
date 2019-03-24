package com.guapaoedu.vip.pattern.observer.gperadvice;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class Teacher implements Observer {
    private String name;
    public Teacher(String name){
        this.name = name;
    }
    public void update(Observable o, Object arg) {
        GPer gper =(GPer)o;
        Question question =(Question)arg;

        System.out.println("=========");
        System.out.println("收到" +gper.getName() + "的提问" +question.getContent() + "\n" + "提问者：" + question.getUserName());
    }
}
