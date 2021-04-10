package com.model.learn.factoryModel.realModel;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/4/10
 */
public class WhiteHuman implements Human{

    @Override
    public String getColor() {
        System.out.println("我的肤色是白色");
        return "white";
    }

    @Override
    public void talk() {
        System.out.println("我是白种人");

    }
}
