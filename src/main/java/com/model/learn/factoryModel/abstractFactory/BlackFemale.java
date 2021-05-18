package com.model.learn.factoryModel.abstractFactory;

/**
 * @author liu
 * @version 1.0
 * @description
 * @date 5/18/21
 */
public class BlackFemale extends BlackHumanAbstract {

    @Override
    public String getSex() {
        System.out.println("黑种女性");
        return "female";
    }
}
