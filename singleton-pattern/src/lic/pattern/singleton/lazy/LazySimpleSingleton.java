package lic.pattern.singleton.lazy;

/**
 * @author ZerlindaLi create at 2020/9/4 11:23
 * @version 1.0.0
 * @description LazySimpleSingleton
 * 懒汉模式
 * 优点：节省了内存,线程不安全
 * 缺点：性能低
 */
public class LazySimpleSingleton implements Cloneable{

    private static LazySimpleSingleton lazySimpleSingleton;

    private LazySimpleSingleton(){}

    public static  LazySimpleSingleton getInstance(){
        if(lazySimpleSingleton == null){
            synchronized (LazyStaticInnerClassSingleton.class){
                lazySimpleSingleton = new LazySimpleSingleton();
            }

        }
        return lazySimpleSingleton;
    }

    public LazySimpleSingleton clone(){
        try {
            return (LazySimpleSingleton)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

}
