package lic.pattern.singleton.test;

import lic.pattern.singleton.lazy.LazySimpleSingleton;

/**
 * @author ZerlindaLi create at 2020/9/4 14:07
 * @version 1.0.0
 * @description LazySimpleSingletonTest
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {
        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
        LazySimpleSingleton s = instance.clone();
        System.out.println(s);
        System.out.println(instance);
        System.out.println(s == instance);
    }
}
