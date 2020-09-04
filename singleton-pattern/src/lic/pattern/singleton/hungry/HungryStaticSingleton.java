package lic.pattern.singleton.hungry;

/**
 * @author ZerlindaLi create at 2020/9/4 14:23
 * @version 1.0.0
 * @description HungryStaticSingleton
 */
public class HungryStaticSingleton {

    private static HungryStaticSingleton instance;

    static{
        instance = new HungryStaticSingleton();
    }

    public HungryStaticSingleton getInstance(){
        return instance;
    }
}
