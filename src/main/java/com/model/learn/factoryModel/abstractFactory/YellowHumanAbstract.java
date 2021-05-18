package com.model.learn.factoryModel.abstractFactory;

/**
 * @author liu
 * @version 1.0
 * @description
 * @date 5/18/21
 */
public abstract class YellowHumanAbstract implements Human {

    @Override
    public void talk() {
        System.out.println("我是黄种人");

    }

    @Override
    public String getColor() {
        System.out.println("我的肤色是黄色");
        return "yellow";
    }



}
