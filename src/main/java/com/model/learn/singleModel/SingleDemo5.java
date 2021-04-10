package com.model.learn.singleModel;

/**
 * @author liu
 * @version 1.0
 * @description 静态内部类
 * @createDate 2021/4/10
 */
public class SingleDemo5 {
    private static SingleDemo5 instance;

    private static class SingleHolder {
        public static final SingleDemo5 instance = new SingleDemo5();
    }

    public SingleDemo5() {
        if(instance==null){
            throw new RuntimeException();
        }
    }

    public SingleDemo5 getInstance() {
        return SingleHolder.instance;
    }
}
