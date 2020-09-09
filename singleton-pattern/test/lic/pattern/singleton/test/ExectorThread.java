package lic.pattern.singleton.test;

import lic.pattern.singleton.lazy.LazyDoubleCheckSingleton;
import lic.pattern.singleton.register.ContainerSingleton;
import lic.pattern.singleton.threadlocal.ThreadlocalSingleton;

/**
 * @author ZerlindaLi create at 2020/9/4 11:33
 * @version 1.0.0
 * @description ExectorThread
 */
public class ExectorThread implements Runnable{
    @Override
    public void run() {
//        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
//        ThreadlocalSingleton instance = ThreadlocalSingleton.getInstance();
        Object instance = ContainerSingleton.getBean("lic.pattern.singleton.register.ContainerSingleton");
        System.out.println(Thread.currentThread().getName()+":"+instance);
    }
}
