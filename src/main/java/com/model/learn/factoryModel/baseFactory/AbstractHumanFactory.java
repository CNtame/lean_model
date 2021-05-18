package com.model.learn.factoryModel.baseFactory;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/4/10
 */
public abstract class AbstractHumanFactory {

    /*
     * 创建一个产品对象，其输入参数类型可以自行设置
     * 通常为String、Enum、Class等，当然也可以为空
     * 此处举例简单，输入参数为空
     */
    /**
     * 必须是human的实现类，必须是Class类型
     *
     * @return
     */
    public abstract Human createHuman();
}
