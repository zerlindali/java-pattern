package lic.pattern.proxy.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ZerlindaLi create at 2020/9/15 10:35
 * @version 1.0.0
 * @description HuangNiu
 */
public class HuangNiu implements InvocationHandler {

    // RealSubject
    private Object target;

    // get proxy
    public Object getInstance(Object o){
        this.target = o;
        Class clazz = o.getClass();
        ClassLoader classLoader = clazz.getClassLoader();
        return Proxy.newProxyInstance(classLoader, clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        // 通过反射机制调用目标对象的方法
        Object object = method.invoke(target,args);
        after();
        return object;
    }


    private void before(){
        System.out.println("设置信息！"+target);
    }

    private void after(){
        System.out.println("出票成功！");
    }
}
