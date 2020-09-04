package lic.pattern.singleton.lazy;

/**
 * @author ZerlindaLi create at 2020/9/4 11:23
 * @version 1.0.0
 * @description LazySimpleSingleton
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazySimpleSingleton;

    private LazySimpleSingleton(){}

    public static LazySimpleSingleton getInstance(){
        if(lazySimpleSingleton == null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }

}
