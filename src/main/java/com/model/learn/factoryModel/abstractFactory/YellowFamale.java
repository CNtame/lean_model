package com.model.learn.factoryModel.abstractFactory;

/**
 * @author liu
 * @version 1.0
 * @description
 * @date 5/18/21
 */
public class YellowFamale extends YellowHumanAbstract {

    @Override
    public String getSex() {
        System.out.println("黄种女性");
        return "female";
    }
}
