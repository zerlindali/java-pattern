package lic.pattern.singleton.lazy;

/**
 * @author ZerlindaLi create at 2020/9/4 14:23
 * @version 1.0.0
 * @description DoubleCheckSingleton
 * 优点：性能高了，线程安全了
 * 确定：可读性难度加大，不够优雅
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton instance;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){
        // 检查是否要阻塞
        if(instance==null){
            synchronized (LazyDoubleCheckSingleton.class){
                // 检查是否要重新创建实例
                if(instance == null){
                    instance = new LazyDoubleCheckSingleton();
                    // 指令重排序的问题
                }
            }
        }
        return instance;
    }
}
