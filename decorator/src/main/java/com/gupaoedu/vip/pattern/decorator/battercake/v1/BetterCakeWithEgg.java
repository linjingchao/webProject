package com.gupaoedu.vip.pattern.decorator.battercake.v1;

public class BetterCakeWithEgg extends BetterCake{
    @Override
    public String getMsg() {
        return super.getMsg() +"+1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() +1;
    }
}
