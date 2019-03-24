package com.gupaoedu.vip.pattern.decorator.battercake.v2;

public class BetterCakeDecoratorTest {
    public static void main(String[] args) {
        BetterCake betterCake;
        betterCake = new BaseBetterCake();

        System.out.println(betterCake.getMsg());

        betterCake = new EggDecorator(betterCake);

        System.out.println(betterCake.getMsg());

        betterCake = new EggDecorator(betterCake);

        System.out.println(betterCake.getMsg());

        betterCake = new SausageDecorator(betterCake);

        System.out.println(betterCake.getMsg() + ":" + betterCake.getPrice());
    }
}
