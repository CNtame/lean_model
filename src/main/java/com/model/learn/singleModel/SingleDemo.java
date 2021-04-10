package com.model.learn.singleModel;

/**
 * @author liu
 * @version 1.0
 * @description 恶汉
 * @createDate 2021/4/10
 */
public class SingleDemo {

    private static SingleDemo instance = new SingleDemo();

    public SingleDemo() {
        if (instance != null) {
            throw new RuntimeException();
        }
    }

    public static SingleDemo getInstance() {
        return instance;
    }
}
