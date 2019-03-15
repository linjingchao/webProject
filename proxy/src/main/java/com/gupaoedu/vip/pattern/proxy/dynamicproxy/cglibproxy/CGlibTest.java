package com.gupaoedu.vip.pattern.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.core.DebuggingClassWriter;

public class CGlibTest {

    public static void main(String[] args) {
        try{
            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"/Users/linjingchao/devTool/jadd/cglib_proxy");

            Custom obj = (Custom) new CGlibMeipo().getInstance(Custom.class);
            obj.findLove();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
