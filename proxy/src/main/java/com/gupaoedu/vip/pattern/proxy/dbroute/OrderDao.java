package com.gupaoedu.vip.pattern.proxy.dbroute;

public class OrderDao {
    public int insert(Order order){
        System.out.println("OrderDao创建Order");
        return 1;
    }
}
