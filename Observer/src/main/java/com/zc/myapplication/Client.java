package com.zc.myapplication;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Panda_Program on 2017/1/13 0013.
 */

public class Client implements Observer {
    String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Log.e("客户", name+",内容更新了"+"-内容-"+arg);
    }

    @Override
    public String toString() {
        return "客户:"+name;
    }
}
