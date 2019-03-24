package com.gupaoedu.vip.pattern.decorator.battercake.v2;

public class EggDecorator extends BetterCakeDecorator{

    public EggDecorator(BetterCake betterCake) {
        super(betterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() +"+1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+1;
    }
}
