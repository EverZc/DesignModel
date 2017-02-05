package com.zc.factory;

/**
 * 静态工厂模式,是工厂模式的一个弱火版本
 */

public class StaticFactor {
    public static Product createProduct(){
        return new ConcreteProduct();
    }
}
