package com.gupaoedu.vip.test;

import com.gupaoedu.vip.entity.House;
import com.gupaoedu.vip.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {

    public static void main(String[] args) {
        House house = new House(100,"red",100);
        List<House> houses =new ArrayList<House>();
        houses.add(house);
        Person person =new Person(houses,"tom",30);

        Person p =person.deepClone();

        System.out.println(person);
        System.out.println(p);
        System.out.println(person == p);
    }
}
