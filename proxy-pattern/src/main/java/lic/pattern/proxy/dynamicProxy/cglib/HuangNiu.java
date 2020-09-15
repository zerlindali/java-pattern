package lic.pattern.proxy.dynamicProxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ZerlindaLi create at 2020/9/15 10:35
 * @version 1.0.0
 * @description HuangNiu
 */
public class HuangNiu implements MethodInterceptor {

    // RealSubject
    private Object target;

    private void before(){
        System.out.println("设置信息！"+target);
    }

    private void after(){
        System.out.println("出票成功！");
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        methodProxy.invokeSuper(o, objects);
        after();
        return o;
    }

    public Object getInstance(Object o, Class[] argumentTypes, Object[] arguments){
        this.target = o;
        Class clazz = o.getClass();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);

        return enhancer.create(argumentTypes,arguments);
    }
}
