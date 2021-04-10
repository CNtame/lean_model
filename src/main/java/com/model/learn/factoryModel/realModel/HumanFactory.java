package com.model.learn.factoryModel.realModel;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/4/10
 */
public class HumanFactory extends AbstractHumanFactory {

    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human =(T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误");
        }
        return (T) human;
    }
}
