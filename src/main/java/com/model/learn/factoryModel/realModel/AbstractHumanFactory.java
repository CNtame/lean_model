package com.model.learn.factoryModel.realModel;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/4/10
 */
public abstract class AbstractHumanFactory {

    /**
     * 必须是human的实现类，必须是Class类型
     * @param c
     * @param <T>
     * @return
     */
    public abstract <T extends Human> T createHuman(Class<T> c);
}
