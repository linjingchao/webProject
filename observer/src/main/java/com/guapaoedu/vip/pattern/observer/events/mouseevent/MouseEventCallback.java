package com.guapaoedu.vip.pattern.observer.events.mouseevent;

import com.guapaoedu.vip.pattern.observer.events.core.Event;

public class MouseEventCallback {

    public void onClick(Event e){
        System.out.println("=====触发鼠标单击事件=======");
    }
}
