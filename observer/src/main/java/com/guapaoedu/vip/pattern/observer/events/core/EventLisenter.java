package com.guapaoedu.vip.pattern.observer.events.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 监听器，即观察者
 */
public class EventLisenter {
    protected Map<String,Event> events = new HashMap<String, Event>();

    public void addLisenter(String eventType,Object targert){
        try{
            this.addLisenter(eventType,targert,targert.getClass().getMethod("on" +toUpperFirstCase(eventType),Event.class));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addLisenter(String eventType, Object target, Method callback){
        //注册事件
        events.put(eventType,new Event(target,callback));
    }

    private void trigger(Event event){
        event.setSource(this);
        event.setTime(System.currentTimeMillis());

        try{
            if(event.getCallback()!=null){
                event.getCallback().invoke(event.getTarget(),event);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    protected void trigger(String trigger){
        if(!this.events.containsKey(trigger)){
            return;
        }
       Event event =this.events.get(trigger);
//        event.setTrigger(trigger);
        trigger(event);
    }

    private String toUpperFirstCase(String str){
        char[] chars = str.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }

}
