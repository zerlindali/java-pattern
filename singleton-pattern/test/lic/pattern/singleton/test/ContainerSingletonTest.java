package lic.pattern.singleton.test;

import lic.pattern.singleton.threadlocal.ThreadlocalSingleton;

/**
 * @author ZerlindaLi create at 2020/9/8 15:51
 * @version 1.0.0
 * @description ContainerSingletonTest
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        Thread t3 = new Thread(new ExectorThread());
        Thread t4 = new Thread(new ExectorThread());

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
