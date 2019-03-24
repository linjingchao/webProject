package com.gupaoedu.vip.pattern.decorator.passport;

import com.gupaoedu.vip.pattern.decorator.passport.old.SiginService;
import com.gupaoedu.vip.pattern.decorator.passport.upgrade.ISinginForThirdService;
import com.gupaoedu.vip.pattern.decorator.passport.upgrade.SiginForThirdService;

public class DecoratorTest {

    public static void main(String[] args) {
        ISinginForThirdService singinForThirdService =new SiginForThirdService(new SiginService());

        singinForThirdService.loginForQQ("2");
    }
}
