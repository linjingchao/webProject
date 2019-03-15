package com.gupaoedu.vip.pattern.proxy.dbroute.proxy;

import com.gupaoedu.vip.pattern.proxy.dbroute.IOrderService;
import com.gupaoedu.vip.pattern.proxy.dbroute.Order;
import com.gupaoedu.vip.pattern.proxy.dbroute.db.DynamicDataSourceEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceStaticproxy implements IOrderService {
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

    private IOrderService orderService;

    public OrderServiceStaticproxy(IOrderService orderService){
        this.orderService = orderService;
    }
    @Override
    public int createOrder(Order order) {
        Long time = order.getCreateTime();
        Integer dbroute = Integer.valueOf(sdf.format(new Date(time)));
        System.out.println("静态代理类"+dbroute);

        DynamicDataSourceEntity.set(dbroute);
        this.orderService.createOrder(order);
        DynamicDataSourceEntity.restore();
        return 0;
    }
}
