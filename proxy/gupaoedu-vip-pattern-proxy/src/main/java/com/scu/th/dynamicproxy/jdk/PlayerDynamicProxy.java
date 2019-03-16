package com.scu.th.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description 运动员动态代理
 * @Author 18708
 * @Date 2019/3/16 16:27
 **/
public class PlayerDynamicProxy implements InvocationHandler {

    private Object target;

    public Object getInstance(Object obj){
        this.target = obj;
        Class clazz = obj.getClass();

        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object object = method.invoke(target, args);
        after();

        return object;
    }

    private void before() {
        System.out.println("运动开始了");
    }

    private void after() {
        System.out.println("运动结束");
    }

}
