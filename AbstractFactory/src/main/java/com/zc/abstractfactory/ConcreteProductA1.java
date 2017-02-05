package com.zc.abstractfactory;

import android.util.Log;

/**
 * Created by Panda_Program on 2017/1/14 0014.
 */

public class ConcreteProductA1 extends AbstractProductA {
    @Override
    public void method() {
        Log.e("--ConcreteProductA--", "实现的具体产品A1" );
    }
}
