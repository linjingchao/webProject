package com.gupaoedu.vip.pattern.strategy.pay.payport;

public class WeChatPay extends Payment{
    public String getName() {
        return "微信支付";
    }

    protected double queryBalance(String uid) {
        return 250;
    }
}
