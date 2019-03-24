package com.guapaoedu.vip.pattern.observer.events.core;

import java.lang.reflect.Method;

/**
 * 监听器的包装
 */
public class Event {
    //事件源，事件的发起者
    private Object source;

    //事件触发，通知谁，观察者
    private Object target;

    //触发动作，回调函数
    private Method callback;

    //触发事件名称
    private String trigger;

    //触发时间
    private long time;

    public Event(Object target, Method callback) {
        this.target = target;
        this.callback = callback;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getCallback() {
        return callback;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
