package com.gupaoedu.vip.pattern.decorator.battercake.v1;

public class BetterCakeTest {
    public static void main(String[] args) {
        BetterCake betterCake = new BetterCake();
        System.out.println(betterCake.getMsg() + ":" + betterCake.getPrice());

        BetterCakeWithEgg betterCakeWithEgg = new BetterCakeWithEgg();
        System.out.println(betterCakeWithEgg.getMsg() + ":" + betterCakeWithEgg.getPrice());

        BetterCakeWithEggAndSausage betterCakeWithEggAndSausage = new BetterCakeWithEggAndSausage();
        System.out.println(betterCakeWithEggAndSausage.getMsg() + ":" + betterCakeWithEggAndSausage.getPrice());
    }
}
