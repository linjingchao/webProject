package com.gupaoedu.vip.pattern.adapter.loginadapter.v2;

import com.gupaoedu.vip.pattern.adapter.loginadapter.ResultMsg;
import com.gupaoedu.vip.pattern.adapter.loginadapter.v1.service.SiginService;
import com.gupaoedu.vip.pattern.adapter.loginadapter.v2.adapters.LoginAdapter;
import com.gupaoedu.vip.pattern.adapter.loginadapter.v2.adapters.LoginForQQAdapter;

public class PassportForThirdAdapter extends SiginService implements IPassportForThird {
    public ResultMsg loginForQQ(String id) {
        return processLogin(id, LoginForQQAdapter.class);
    }

    public ResultMsg loginWeChat(String id) {
        return null;
    }

    public ResultMsg loginForToken(String id) {
        return null;
    }

    public ResultMsg loginForTelPhone(String telPhone, String code) {
        return null;
    }

    public ResultMsg loginForRegist(String username, String password) {
        super.regist(username,password);
        return super.login(username,password);
    }

    private ResultMsg processLogin(String key, Class<? extends LoginAdapter> clazz){
        try{
            LoginAdapter adapter =clazz.newInstance();

            if(adapter.support(adapter)){
                return adapter.login(key,adapter);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
