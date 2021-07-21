package com.model.learn.proxy.staticProxy;

/**
 * @author liu
 * @version 1.0
 * @description
 * @date 7/21/21
 */
public class StaticTest {

    public static void main(String[] args) {
        try {
            //采用类加载器形式，去加载实列对象，这样我们就不同关心到底什么时候需要真实的实列化对象
            new ProxySubject().doSomething();

        } catch (Exception e) {
            System.out.println(e.toString());

        }
        //通过传值的形式，把实列化对象传过来。（理解为装饰器模式了）
        new ProxySubject(new RealObject()).doSomething();

    }
}
