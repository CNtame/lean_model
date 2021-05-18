package com.model.learn.factoryModel.abstractFactory;


/**
 * @author liu
 * @version 1.0
 * @description
 * @date 5/18/21
 */
public class MaleFactory implements HumanFactory {

    @Override
    public Human createYellow() {
        return new YellowMale();
    }

    @Override
    public Human createBlack() {
        return new BlackMale();
    }

}
