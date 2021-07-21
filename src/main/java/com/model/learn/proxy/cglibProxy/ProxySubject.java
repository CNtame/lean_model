package com.model.learn.proxy.cglibProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author liu
 * @version 1.0
 * @description glib 无需通过接口来实现，它是通过实现子类的方式来完成调用的。
 *
 * @date 7/21/21
 */
public class ProxySubject implements MethodInterceptor {

    private MainSubject mainSubject;

    public MainSubject getInstance(MainSubject mainSubject) {
        this.mainSubject = mainSubject;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.mainSubject.getClass());
        enhancer.setCallback(this);
        return (MainSubject) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object o1 = methodProxy.invokeSuper(o, objects);
        after();
        return o1;
    }

    public void before() {
        System.out.println("before ....");

    }

    public void after() {
        System.out.println("after......");

    }
}
