package com.gupaoedu.vip.pattern.adapter.loginadapter.v1;

import com.gupaoedu.vip.pattern.adapter.loginadapter.v1.service.SinginForThirdService;

public class SiginForThirdServiceTest {

    public static void main(String[] args) {
        SinginForThirdService singinForThirdService = new SinginForThirdService();
        System.out.println(singinForThirdService.loginForQQ("12345"));
        System.out.println(singinForThirdService.login("123","456"));
        System.out.println(singinForThirdService.loginForWechat("666"));
    }
}
