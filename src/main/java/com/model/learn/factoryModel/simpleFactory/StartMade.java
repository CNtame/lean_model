package com.model.learn.factoryModel.simpleFactory;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/4/10
 */
public class StartMade {

    public static void main(String[] args) {
        AbstractHumanFactory factory = new HumanFactory();

        YellowHuman human = factory.createHuman(YellowHuman.class);
        human.getColor();
        human.talk();

        BlackHuman human1 = factory.createHuman(BlackHuman.class);
        human1.getColor();
        human1.talk();

        WhiteHuman human2 = factory.createHuman(WhiteHuman.class);
        human2.getColor();
        human2.talk();

    }
}
