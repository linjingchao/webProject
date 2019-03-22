package com.gupaoedu.vip.pattern.adapter.loginadapter.v1.service;

import com.gupaoedu.vip.pattern.adapter.loginadapter.ResultMsg;

public class SinginForThirdService extends SiginService{

    public ResultMsg loginForQQ(String openId){
        return loginForRegist(openId,null);
    }

    public ResultMsg loginForWechat(String openId){
        return null;
    }

    public ResultMsg loginForToken(String openId){
        return null;
    }

    public ResultMsg loginForTelephone(String telephone,String code){
        return null;
    }

    public ResultMsg loginForRegist(String username,String password){
        super.regist(username,password);
        return super.login(username,password);
    }
}
