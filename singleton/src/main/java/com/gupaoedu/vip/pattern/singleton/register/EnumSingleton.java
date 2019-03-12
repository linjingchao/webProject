package com.gupaoedu.vip.pattern.singleton.register;


import java.io.Serializable;

/**
 * 枚举单例
 */
public enum  EnumSingleton implements Serializable {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

}
