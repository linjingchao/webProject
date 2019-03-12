package com.gupaoedu.vip.pattern.singleton.test;

import com.gupaoedu.vip.pattern.singleton.hungry.HungrySingleton;
import com.gupaoedu.vip.pattern.singleton.lazy.LazyInnerClassSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化破坏单例
 */
public class SeriableTest {
    public static void main(String[] args) {
        //文件输入流
        FileInputStream fis = null;
        //对象输入流
        ObjectInputStream ois = null;
        //文件输出流
        FileOutputStream fos = null;
        //对象输出流
        ObjectOutputStream oos = null;

//        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
//
//        HungrySingleton hungrySingleton2 = null;

        LazyInnerClassSingleton lazyInnerClassSingleton1 =LazyInnerClassSingleton.getInstance();
        LazyInnerClassSingleton lazyInnerClassSingleton2 = null;
        try{
            //hungrySingleton1对象写入内存
            fos = new FileOutputStream("object.obj");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(lazyInnerClassSingleton1);
            oos.flush();


            //从内存读出写入对象
            fis = new FileInputStream("object.obj");
            ois = new ObjectInputStream(fis);
            lazyInnerClassSingleton2 = (LazyInnerClassSingleton) ois.readObject();

            System.out.println(lazyInnerClassSingleton1);
            System.out.println(lazyInnerClassSingleton2);

            //比较两个对象地址
            System.out.println(lazyInnerClassSingleton1 == lazyInnerClassSingleton2);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(fis !=null){
                    fis.close();
                }

                if(ois != null){
                    ois.close();
                }

                if(fos != null){
                    fos.close();
                }
                if(oos != null){
                    oos.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
