package com.gupaoedu.vip.pattern.decorator.passport.upgrade;

import com.gupaoedu.vip.pattern.decorator.passport.old.ISiginService;
import com.gupaoedu.vip.pattern.decorator.passport.old.ResultMsg;

public class SiginForThirdService implements ISinginForThirdService{
    private ISiginService siginService;

    public SiginForThirdService(ISiginService siginService) {
        this.siginService = siginService;
    }

    public ResultMsg loginForQQ(String id) {
       return null;
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
        return null;
    }

    public ResultMsg regist(String username, String password) {
        return this.siginService.regist(username,password);
    }

    public ResultMsg login(String username, String password) {
        return this.siginService.login(username,password);
    }
}
