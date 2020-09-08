package lic.pattern.singleton.seriable;

import java.io.Serializable;

/**
 * @author ZerlindaLi create at 2020/9/4 17:45
 * @version 1.0.0
 * @description SerilableSingletion
 */
public class SeriableSingleton implements Serializable {

    private static final SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton(){}

    public static SeriableSingleton getInstance() {
        return INSTANCE;
    }
}
