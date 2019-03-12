package com.gupaoedu.vip.entity;

import java.io.Serializable;

/**
 * 儿子类
 */
public class House implements Serializable {
    private int money;

    private String color;

    private int squre;

    public int getMoney() {
        return money;
    }

    public House(int money, String color, int squre) {
        this.money = money;
        this.color = color;
        this.squre = squre;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSqure() {
        return squre;
    }

    public void setSqure(int squre) {
        this.squre = squre;
    }
}
