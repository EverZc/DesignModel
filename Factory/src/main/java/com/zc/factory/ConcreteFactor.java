package com.zc.factory;

/**
 * 具体工厂类
 */

public class ConcreteFactor extends Factor {
    @Override
    public Product createProduct() {
        return new ConcreteProduct();
    }
}
