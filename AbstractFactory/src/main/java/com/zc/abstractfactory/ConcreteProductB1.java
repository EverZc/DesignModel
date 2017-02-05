package com.zc.abstractfactory;

import android.util.Log;

/**
 * Created by Panda_Program on 2017/1/14 0014.
 */

public class ConcreteProductB1 extends AbstractProductB {
    @Override
    public void method() {
        Log.e("--ConcreteProductB--", "实现的具体产品B1" );
    }
}
