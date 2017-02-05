package com.zc.abstractfactory;

/**
 * Created by Panda_Program on 2017/1/14 0014.
 */

public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
