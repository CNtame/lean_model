package com.model.learn.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author liu
 * @version 1.0
 * @description
 * @date 7/21/21
 */
public class ProxySubject implements InvocationHandler {

    private BaseSubject baseSubject;

    public ProxySubject(BaseSubject baseSubject) {
        this.baseSubject = baseSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        method.invoke(baseSubject, args);
        after();
        return null;
    }

    private void before() {
        System.out.println("before ....");

    }

    private void after() {
        System.out.println("after......");
    }




}
