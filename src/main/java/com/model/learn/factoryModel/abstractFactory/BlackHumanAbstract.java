package com.model.learn.factoryModel.abstractFactory;

/**
 * @author liu
 * @version 1.0
 * @description
 * @date 5/18/21
 */
public abstract class BlackHumanAbstract implements Human {
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
