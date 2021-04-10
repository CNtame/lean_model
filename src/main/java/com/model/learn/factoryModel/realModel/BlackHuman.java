package com.model.learn.factoryModel.realModel;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/4/10
 */
public class BlackHuman implements Human {


    @Override
    public String getColor() {
        System.out.println("我的肤色是黑色");
        return "black";
    }

    @Override
    public void talk() {
        System.out.println("我是黑种人");

    }
}
