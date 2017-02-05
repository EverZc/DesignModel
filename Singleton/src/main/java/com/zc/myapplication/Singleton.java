package com.zc.myapplication;

/**
 * Created by Panda_Program on 2017/1/7 0007.
 */
//懒汉式
public class Singleton {
    //私有化一个静态变量
    private static Singleton instance;
    //私有化构造函数  使用synchronized可以在多线程情况下baozn6t8
    private static synchronized Singleton getInstance() {
        if (instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
