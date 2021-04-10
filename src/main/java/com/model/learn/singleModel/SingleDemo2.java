package com.model.learn.singleModel;

/**
 * @author liu
 * @version 1.0
 * @description 懒汉模式
 * @createDate 2021/4/10
 */
public class SingleDemo2 {

    private static SingleDemo2 instance;

    public SingleDemo2() {
        if (instance != null) {
            throw new RuntimeException();
        }
    }

    public static synchronized SingleDemo2 getInstance() {
        if (instance == null) {
            instance = new SingleDemo2();

        }

        return instance;

    }
}
