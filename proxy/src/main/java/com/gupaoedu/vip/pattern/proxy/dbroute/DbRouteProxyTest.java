package com.gupaoedu.vip.pattern.proxy.dbroute;

import com.gupaoedu.vip.pattern.proxy.dbroute.db.DynamicDataSourceEntity;
import com.gupaoedu.vip.pattern.proxy.dbroute.proxy.OrderServiceDynamicProxy;
import com.gupaoedu.vip.pattern.proxy.dbroute.proxy.OrderServiceStaticproxy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DbRouteProxyTest {
    public static void main(String[] args) {
        try{
            Order order =new Order();
            System.out.println(order);

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

            Date date = sdf.parse("2018/02/01");
            order.setCreateTime(date.getTime());

            //IOrderService orderService =new OrderServiceStaticproxy(new OrderService());
            IOrderService orderService = (IOrderService)new OrderServiceDynamicProxy().getInstance(new OrderService());
            orderService.createOrder(order);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
