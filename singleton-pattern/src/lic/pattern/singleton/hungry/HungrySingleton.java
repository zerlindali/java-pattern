package lic.pattern.singleton.hungry;

import java.io.IOException;

/**
 * @author ZerlindaLi create at 2020/9/4 11:20
 * @version 1.0.0
 * @description HungrySingleton
 * 饿汉模式
 * 优点：
 * 缺点：
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){
    };

    public HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
