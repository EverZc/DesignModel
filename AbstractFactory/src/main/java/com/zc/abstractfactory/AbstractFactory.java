package com.zc.abstractfactory;

/**
 * Created by Panda_Program on 2017/1/14 0014.
 */

public abstract class AbstractFactory {
    //创建产品A的方法
    public abstract AbstractProductA createProductA();
    //创建产品B的方法
    public abstract AbstractProductB createProductB();
}
