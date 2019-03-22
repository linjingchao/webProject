package com.gupaoedu.vip.pattern.strategy.pay;

import com.gupaoedu.vip.pattern.strategy.pay.payport.PayStrategy;

public class PayStrategyTest {
    public static void main(String[] args) {

        Order order = new Order("1","2018010310392",324.45);

        System.out.println(order.pay(PayStrategy.WECHAT_PAY));
    }
}
