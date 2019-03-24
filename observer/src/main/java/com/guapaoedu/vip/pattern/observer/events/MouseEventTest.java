package com.guapaoedu.vip.pattern.observer.events;

import com.guapaoedu.vip.pattern.observer.events.mouseevent.Mouse;
import com.guapaoedu.vip.pattern.observer.events.mouseevent.MouseEventCallback;
import com.guapaoedu.vip.pattern.observer.events.mouseevent.MouseEventType;

public class MouseEventTest {
    public static void main(String[] args) {
        MouseEventCallback callback = new MouseEventCallback();

        Mouse mouse = new Mouse();

        mouse.addLisenter(MouseEventType.ON_CLICK,callback);
        mouse.click();
    }
}
