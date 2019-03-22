package com.gupaoedu.vip.pattern.adapter.loginadapter.v1.service;

import com.gupaoedu.vip.pattern.adapter.loginadapter.Member;
import com.gupaoedu.vip.pattern.adapter.loginadapter.ResultMsg;

public class SiginService {

    /**
     * 注册方法
     * @return
     */
    public ResultMsg regist(String username,String password){
        return new ResultMsg(200,"注册成功",new Member());
    }

    public ResultMsg login(String username,String password){
        return new ResultMsg(200,"登陆成功",new Member());
    }
}
