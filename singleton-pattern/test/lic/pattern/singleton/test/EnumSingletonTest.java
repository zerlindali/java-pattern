package lic.pattern.singleton.test;

import lic.pattern.singleton.register.EnumSingleton;

import java.io.*;

/**
 * @author ZerlindaLi create at 2020/9/8 10:31
 * @version 1.0.0
 * @description EnumSingletonTest
 */
public class EnumSingletonTest {

    public static void main(String[] args) {
        EnumSingleton s1 = EnumSingleton.getInstance();
        EnumSingleton s2 = null;

        FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
            fos = new FileOutputStream("SeriableEnumSingleton.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.flush();
            oos.close();

            fis = new FileInputStream("SeriableEnumSingleton.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s2 = (EnumSingleton)ois.readObject();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
