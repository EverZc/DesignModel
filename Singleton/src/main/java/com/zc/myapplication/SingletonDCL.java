package com.zc.myapplication;

/**
 * Created by Panda_Program on 2017/1/7 0007.
 */

public class SingletonDCL {
    private static SingletonDCL mInstance=null;
    private SingletonDCL(){};
    public static SingletonDCL getSingletonDCL(){
        //主要判断为了避免不必要的同步
        if (mInstance==null){
            synchronized (SingletonDCL.class){
                //判断为了在null的情况下创建实例
                if (mInstance==null){
                    mInstance=new SingletonDCL();
                }
            }
        }
        return mInstance;
    }
}
