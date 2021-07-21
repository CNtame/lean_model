package com.model.learn.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author liu
 * @version 1.0
 * @description
 * @date 7/21/21
 */
public class TestSubject {

    /**
     * 对代理对象（$proxy InvocationHandler）的一种监听行为。
     * @param c
     * @return
     */
    public static BaseSubject newInstance(Class c) {

        //创建真实类对象
        BaseSubject baseSubject = new MainSubject();

        //代理类
        InvocationHandler pray = new ProxySubject(baseSubject);

        //向jvm索要代理对象 ，其实是监听对象
        Class classArray[] = {BaseSubject.class};
        BaseSubject baseSubject1 = (BaseSubject) Proxy.newProxyInstance(c.getClassLoader(), classArray, pray);
        return baseSubject1;
    }

    public static void main(String[] args) {
        BaseSubject baseSubject = newInstance(MainSubject.class);
        baseSubject.doSomething();
    }
}
