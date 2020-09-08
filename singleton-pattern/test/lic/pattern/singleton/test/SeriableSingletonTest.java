package lic.pattern.singleton.test;

import lic.pattern.singleton.seriable.SeriableSingleton;

import java.io.*;

/**
 * @author ZerlindaLi create at 2020/9/7 13:51
 * @version 1.0.0
 * @description SeriableSingletonTest
 */
public class SeriableSingletonTest {
    public static void main(String[] args) {
        SeriableSingleton s1 = SeriableSingleton.getInstance();
        SeriableSingleton s2 = null;

        try {
            // 序列化
            FileOutputStream fos = new FileOutputStream("SeriableSingleton.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            // 关闭流
            oos.flush();
            oos.close();

            // 反序列化
            FileInputStream fis = new FileInputStream("SeriableSingleton.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s2 = (SeriableSingleton)ois.readObject();
            ois.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }
}
