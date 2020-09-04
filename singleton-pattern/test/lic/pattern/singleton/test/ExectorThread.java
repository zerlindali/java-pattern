package lic.pattern.singleton.test;

import lic.pattern.singleton.lazy.LazyDoubleCheckSingleton;

/**
 * @author ZerlindaLi create at 2020/9/4 11:33
 * @version 1.0.0
 * @description ExectorThread
 */
public class ExectorThread implements Runnable{
    @Override
    public void run() {
//        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+instance);
    }
}
