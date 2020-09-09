package lic.pattern.singleton.test;

import lic.pattern.singleton.threadlocal.ThreadlocalSingleton;

/**
 * @author ZerlindaLi create at 2020/9/9 11:16
 * @version 1.0.0
 * @description ThreadlocalSingletonTest
 */
public class ThreadlocalSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());

        t1.start();
        t2.start();

        System.out.println(ThreadlocalSingleton.getInstance());
        System.out.println(ThreadlocalSingleton.getInstance());
        System.out.println(ThreadlocalSingleton.getInstance());
        System.out.println(ThreadlocalSingleton.getInstance());


    }
}
