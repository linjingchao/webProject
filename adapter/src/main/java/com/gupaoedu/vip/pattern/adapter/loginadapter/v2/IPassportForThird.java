package com.gupaoedu.vip.pattern.adapter.loginadapter.v2;

import com.gupaoedu.vip.pattern.adapter.loginadapter.ResultMsg;

public interface IPassportForThird {

    ResultMsg loginForQQ(String id);

    ResultMsg loginWeChat(String id);

    ResultMsg loginForToken(String id);

    ResultMsg loginForTelPhone(String telPhone,String code);

    ResultMsg loginForRegist(String username,String password);
}
