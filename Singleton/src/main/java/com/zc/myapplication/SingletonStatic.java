package com.zc.myapplication;

/**
 * Created by Panda_Program on 2017/1/7 0007.
 */

public class SingletonStatic {
    private SingletonStatic(){ }
    public static SingletonStatic getInstance(){
        return SingletonHolder.mInstance;
    }
    private static class SingletonHolder{
        private static final SingletonStatic mInstance=new SingletonStatic();
    }
}
