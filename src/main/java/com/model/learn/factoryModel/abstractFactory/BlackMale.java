package com.model.learn.factoryModel.abstractFactory;

/**
 * @author liu
 * @version 1.0
 * @description
 * @date 5/18/21
 */
public class BlackMale extends BlackHumanAbstract{

    @Override
    public String getSex() {
        System.out.println("黑种男性");
        return "male";
    }
}
