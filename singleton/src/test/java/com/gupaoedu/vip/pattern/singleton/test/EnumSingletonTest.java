package com.gupaoedu.vip.pattern.singleton.test;

import com.gupaoedu.vip.pattern.singleton.register.EnumSingleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class EnumSingletonTest implements Serializable {
    public static void main(String[] args) {
//        //文件输入流
//        FileInputStream fis = null;
//        //对象输入流
//        ObjectInputStream ois = null;
//        //文件输出流
//        FileOutputStream fos = null;
//        //对象输出流
//        ObjectOutputStream oos = null;
//
//
//        EnumSingleton enumSingleton1 =EnumSingleton.getInstance();
//        EnumSingleton enumSingleton2 =null;
//
//        enumSingleton1.setData(new Object());
//        try{
//            //hungrySingleton1对象写入内存
//            fos = new FileOutputStream("object.obj");
//            oos = new ObjectOutputStream(fos);
//            oos.writeObject(enumSingleton1);
//            oos.flush();
//
//
//            //从内存读出写入对象
//            fis = new FileInputStream("object.obj");
//            ois = new ObjectInputStream(fis);
//            enumSingleton2 = (EnumSingleton) ois.readObject();
//
//            System.out.println(enumSingleton1.getData());
//            System.out.println(enumSingleton2.getData());
//
//            //比较两个对象地址
//            System.out.println(enumSingleton1 == enumSingleton2);
//            System.out.println(enumSingleton1.getData() == enumSingleton2.getData());
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            try{
//                if(fis !=null){
//                    fis.close();
//                }
//
//                if(ois != null){
//                    ois.close();
//                }
//
//                if(fos != null){
//                    fos.close();
//                }
//                if(oos != null){
//                    oos.close();
//                }
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        }

        //反射
        Class clazz = EnumSingleton.class;

        try {
            Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true);

            EnumSingleton enumSingleton = (EnumSingleton) c.newInstance("123",1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
