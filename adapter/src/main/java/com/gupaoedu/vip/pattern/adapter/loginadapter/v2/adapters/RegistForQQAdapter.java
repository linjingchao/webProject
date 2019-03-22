package com.gupaoedu.vip.pattern.adapter.loginadapter.v2.adapters;

import com.gupaoedu.vip.pattern.adapter.loginadapter.ResultMsg;

public class RegistForQQAdapter implements RegistAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof RegistForQQAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
