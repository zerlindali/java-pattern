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


    // 反序列化时，会调用readObject()，看这个方法里面的readObject0()。
    //                 case TC_OBJECT:
    //                    return checkResolve(readOrdinaryObject(unshared));
    // 在readOrdinaryObject()里面，会判断这个对象是否有无参构造器，如果有就实例化一个。 obj = desc.isInstantiable() ? desc.newInstance() : null;
    // 还会判断是否有readResolve()方法, 如果有就调用。Object rep = desc.invokeReadResolve(obj);所以在单例的类里面加一个readResolve()方法, 并且返回初始化的实例。
    // 这里虽然解决了序列化问题，但是如果每次反射调用还是会新创建一个实例。那么怎么解决这个问题呢，我们引出了注册式单例。
    private Object readResolve(){
        return INSTANCE;
    }
}
