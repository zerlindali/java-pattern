package lic.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ZerlindaLi create at 2020/9/4 17:39
 * @version 1.0.0
 * @description ContainerSingleton
 * Spring框架中单例的应用，ioc容器
 * 	protected Object getSingleton(String beanName, boolean allowEarlyReference) {
 * 		Object singletonObject = this.singletonObjects.get(beanName);
 * 		if (singletonObject == null && isSingletonCurrentlyInCreation(beanName)) {
 * 			synchronized (this.singletonObjects) {
 * 				singletonObject = this.earlySingletonObjects.get(beanName);
 * 				if (singletonObject == null && allowEarlyReference) {
 * 					ObjectFactory<?> singletonFactory = this.singletonFactories.get(beanName);
 * 					if (singletonFactory != null) {
 * 						singletonObject = singletonFactory.getObject();
 * 						this.earlySingletonObjects.put(beanName, singletonObject);
 * 						this.singletonFactories.remove(beanName);
 *                  }
 *              }
 *        }
 * 		}
 * 		return (singletonObject != NULL_OBJECT ? singletonObject : nu    );
 * 	}
 */
public class ContainerSingleton {
    // 私有化构造器
    private ContainerSingleton(){}

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className){
        if (!ioc.containsKey(className)) {
            synchronized (ioc){
                if(!ioc.containsKey(className)){
                    Object obj = null;
                    try {
                        obj = Class.forName(className).newInstance();
                        ioc.put(className, obj);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    }
                    return obj;
                }else{
                    return ioc.get(className);
                }
            }

        } else {
            return ioc.get(className);
        }
    }

}
