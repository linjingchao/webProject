package com.gupaoedu.vip.pattern.decorator.battercake.v2;

public class SausageDecorator extends BetterCakeDecorator{
    public SausageDecorator(BetterCake betterCake) {
        super(betterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"+1根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+2;
    }
}
