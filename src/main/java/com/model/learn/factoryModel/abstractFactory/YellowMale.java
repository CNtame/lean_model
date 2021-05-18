package com.model.learn.factoryModel.abstractFactory;

/**
 * @author liu
 * @version 1.0
 * @description
 * @date 5/18/21
 */
public class YellowMale extends YellowHumanAbstract {

    @Override
    public String getSex() {
        System.out.println("黄种男性");
        return "male";
    }
}
