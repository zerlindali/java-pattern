package lic.pattern.singleton.hungry;

/**
 * @author ZerlindaLi create at 2020/9/4 11:20
 * @version 1.0.0
 * @description HungrySingleton
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){
    };

    public HungrySingleton getInstance(){
        return hungrySingleton;
    }


}
