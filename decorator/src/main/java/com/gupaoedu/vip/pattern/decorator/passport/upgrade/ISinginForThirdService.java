package com.gupaoedu.vip.pattern.decorator.passport.upgrade;

import com.gupaoedu.vip.pattern.decorator.passport.old.ISiginService;
import com.gupaoedu.vip.pattern.decorator.passport.old.ResultMsg;

public interface ISinginForThirdService extends ISiginService {
    ResultMsg loginForQQ(String id);

    ResultMsg loginWeChat(String id);

    ResultMsg loginForToken(String id);

    ResultMsg loginForTelPhone(String telPhone,String code);

    ResultMsg loginForRegist(String username,String password);
}
