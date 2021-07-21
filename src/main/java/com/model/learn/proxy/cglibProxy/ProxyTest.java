package com.model.learn.proxy.cglibProxy;

/**
 * @author liu
 * @version 1.0
 * @description
 * @date 7/21/21
 */
public class ProxyTest {


    public static void main(String[] args) {
        ProxySubject proxySubject = new ProxySubject();
        MainSubject mainSubject = proxySubject.getInstance(new MainSubject());
        mainSubject.doSomething();

    }
}
