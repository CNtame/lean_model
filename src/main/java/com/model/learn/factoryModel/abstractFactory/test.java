package com.model.learn.factoryModel.abstractFactory;

/**
 * @author liu
 * @version 1.0
 * @description
 * @date 5/18/21
 */
public class test {


    public static void main(String[] args) {
        HumanFactory maleFactory = new MaleFactory();
        Human yellowMan = maleFactory.createYellow();
        System.out.println(yellowMan.getSex());
        System.out.println(yellowMan.getColor());
        yellowMan.talk();
    }
}
