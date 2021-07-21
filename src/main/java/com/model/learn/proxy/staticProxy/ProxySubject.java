package com.model.learn.proxy.staticProxy;

/**
 * @author liu
 * @version 1.0
 * @description
 * @date 7/21/21
 */
public class ProxySubject implements Subject {

    private RealObject realObject;

    public ProxySubject(RealObject realObject) {
        this.realObject = realObject;
    }

    public ProxySubject() throws ClassNotFoundException,IllegalAccessException,InstantiationException{
        this.realObject = (RealObject) this.getClass().getClassLoader().loadClass("com.model.learn.proxy.staticProxy.RealObject").newInstance();

    }

    @Override
    public void doSomething() {
        System.out.println("代理before");
        realObject.doSomething();
        System.out.println("代理after");
    }


}
