package com.model.learn.factoryModel.moreFactory;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/4/10
 */
public class BlackHumanFactory extends AbstractHumanFactory{

    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
