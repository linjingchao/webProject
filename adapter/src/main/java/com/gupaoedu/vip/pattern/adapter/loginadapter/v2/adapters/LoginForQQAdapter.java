package com.gupaoedu.vip.pattern.adapter.loginadapter.v2.adapters;

import com.gupaoedu.vip.pattern.adapter.loginadapter.ResultMsg;

public class LoginForQQAdapter implements LoginAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof LoginAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
