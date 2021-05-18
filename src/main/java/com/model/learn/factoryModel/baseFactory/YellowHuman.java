package com.model.learn.factoryModel.baseFactory;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/4/10
 */
public class YellowHuman implements Human {

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
