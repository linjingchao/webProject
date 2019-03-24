package com.gupaoedu.vip.pattern.decorator.battercake.v1;

public class BetterCakeWithEggAndSausage extends BetterCakeWithEgg{
    @Override
    public String getMsg() {
        return super.getMsg() +"+根香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice() +2;
    }
}
