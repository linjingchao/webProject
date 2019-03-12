package com.gupaoedu.vip.entity;

import java.io.*;
import java.util.List;

/**
 * 父亲类
 */
public class Person implements Serializable {
    //房子集合，多个房子
    private List<House> houses;

    private String name;

    private int age;

    public Person(List<House> houses, String name, int age) {
        this.houses = houses;
        this.name = name;
        this.age = age;
    }

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person deepClone(){
        Person person = null;
        ByteArrayOutputStream byteArrayOutputStream =null;
        ObjectOutputStream objectOutputStream = null;

        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;

        try{
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            objectOutputStream.flush();

            byteArrayInputStream =new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            person = (Person) objectInputStream.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(byteArrayOutputStream != null){
                    byteArrayOutputStream.close();
                }
                if(objectOutputStream != null){
                    objectOutputStream.close();
                }
                if(byteArrayInputStream != null){
                    byteArrayInputStream.close();
                }
                if(objectInputStream != null){
                    objectInputStream.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return person;
    }
}
