package lic.pattern.singleton.hungry;

/**
 * @author ZerlindaLi create at 2020/9/4 11:20
 * @version 1.0.0
 * @description HungrySingleton
 * 饿汉式模式
 * 优点：代码简单
 * 缺点：容易造成内存泄露
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
