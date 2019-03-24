package com.gupaoedu.vip.pattern.decorator.battercake.v2;

public class BetterCakeDecorator extends BetterCake{
    private BetterCake betterCake;

    public BetterCakeDecorator(BetterCake betterCake) {
        this.betterCake = betterCake;
    }

    protected String getMsg() {
        return this.betterCake.getMsg();
    }

    protected int getPrice() {
        return this.betterCake.getPrice();
    }
}
