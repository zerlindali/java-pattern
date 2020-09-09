package lic.pattern.singleton.threadlocal;

/**
 * @author ZerlindaLi create at 2020/9/4 17:46
 * @version 1.0.0
 * @description ThreadlocalSingleton
 * 不能保证其创建的对象全局唯一，但能保证在单个线程中是唯一的，天生是线程安全的
 */
public class ThreadlocalSingleton {

    private static ThreadLocal<ThreadlocalSingleton> threadLocal = ThreadLocal.withInitial(() -> new ThreadlocalSingleton());

    private ThreadlocalSingleton (){}

    public static ThreadlocalSingleton getInstance(){
        return threadLocal.get();
    }
}
