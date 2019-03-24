package com.gupaoedu.vip.pattern.decorator.passport.upgrade;

import com.gupaoedu.vip.pattern.decorator.passport.old.ISiginService;
import com.gupaoedu.vip.pattern.decorator.passport.old.ResultMsg;

public class QQDecorator extends SiginForThirdService{
    public QQDecorator(ISiginService siginService) {
        super(siginService);
    }

    @Override
    public ResultMsg loginForQQ(String id) {
        return super.loginForQQ(id);
    }
}
