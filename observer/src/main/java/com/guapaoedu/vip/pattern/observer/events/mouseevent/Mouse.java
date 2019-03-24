package com.guapaoedu.vip.pattern.observer.events.mouseevent;

import com.guapaoedu.vip.pattern.observer.events.core.EventLisenter;

public class Mouse extends EventLisenter {
    public void click(){
        System.out.println("单击方法");
        this.trigger(MouseEventType.ON_CLICK);
    }
}
