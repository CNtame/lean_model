package com.model.learn.factoryModel.moreFactory;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/4/10
 */
public class TestModel {

    public static void main(String[] args) {

        Human human = new WhiteHumanFactory().createHuman();
        human.getColor();
        human.talk();

        Human human1 = new YellowHumanFactory().createHuman();
        human1.getColor();
        human1.talk();

        Human human2 = new BlackHumanFactory().createHuman();
        human2.getColor();
        human2.talk();

    }
}
