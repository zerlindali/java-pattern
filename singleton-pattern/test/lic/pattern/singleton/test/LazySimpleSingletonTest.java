package lic.pattern.singleton.test;

/**
 * @author ZerlindaLi create at 2020/9/4 14:07
 * @version 1.0.0
 * @description LazySimpleSingletonTest
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());

        t1.start();
        t2.start();
    }
}
