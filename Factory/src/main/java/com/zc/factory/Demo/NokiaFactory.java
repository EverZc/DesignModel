package com.zc.factory.Demo;

/**
 * Created by Panda_Program on 2017/1/14 0014.
 */

public abstract class NokiaFactory {
    /**
     * 诺基亚某型号的工厂方法
     */
    public abstract <T extends NokiaPhone > T createNOKIAPhone (Class<T> clas);
}
