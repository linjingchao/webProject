package com.gupaoedu.vip.pattern.strategy.pay.payport;

public class JdPay extends Payment{
    public String getName() {
        return "京东白条";
    }

    protected double queryBalance(String uid) {
        return 500;
    }
}
