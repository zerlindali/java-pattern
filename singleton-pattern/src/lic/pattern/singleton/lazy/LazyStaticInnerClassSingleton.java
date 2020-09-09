package lic.pattern.singleton.lazy;

/**
 * @author ZerlindaLi create at 2020/9/4 16:08
 * @version 1.0.0
 * @description LazyStaticInnerClassSingleton
 * 优点：内部类使用时才会被jvm加载，初始化静态成员变量
 * 缺点：解决被反射破坏后，不够优雅
 */
public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton(){
        if(LazyHolder.INSTANCE!=null){
            throw new RuntimeException("不允许非法访问");
        }
    }

    public static LazyStaticInnerClassSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder{
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }
}
