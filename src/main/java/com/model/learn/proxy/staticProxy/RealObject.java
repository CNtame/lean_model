package com.model.learn.proxy.staticProxy;

/**
 * @author liu
 * @version 1.0
 * @description
 * @date 7/21/21
 */
public class RealObject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("主体。。。。。");
    }
}
