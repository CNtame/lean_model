package com.model.learn.singleModel;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/4/10
 */
public class SingleDemo3 {

    private volatile static SingleDemo3 instance;

    public SingleDemo3() {
        if(instance!=null){
            throw new RuntimeException();
        }

    }

    public static SingleDemo3 getInstance() {
        if(instance==null){
            synchronized (SingleDemo3.class) {
                if(instance==null){
                    instance = new SingleDemo3();
                }
            }
        }
        return instance;
    }

}
