package lic.pattern.singleton.test;

import lic.pattern.singleton.lazy.LazyStaticInnerClassSingleton;
import lic.pattern.singleton.register.ContainerSingleton;
import lic.pattern.singleton.register.EnumSingleton;

import java.lang.reflect.Constructor;

/**
 * @author ZerlindaLi create at 2020/9/4 16:28
 * @version 1.0.0
 * @description ReferTest
 */
public class ReflectTest {
    public static void main(String[] args) {
        try{
//            Class<?> clazz = LazyStaticInnerClassSingleton.class;
//            Class<?> clazz = EnumSingleton.class;
            Class<?> clazz = ContainerSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object o1 = c.newInstance();
            Object o2 = c.newInstance();
            System.out.println(o1);
            System.out.println(o2);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
