package com.zc.factory;

/**
 * Created by Panda_Program on 2017/1/14 0014.
 */

public abstract class Factor {
    /**
     * 抽象工厂方法
     * 具体生产什么由子类去实现
     */
    public abstract Product createProduct();
}
