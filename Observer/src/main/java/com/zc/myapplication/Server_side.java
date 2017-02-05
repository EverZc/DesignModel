package com.zc.myapplication;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Panda_Program on 2017/1/13 0013.
 */

public class Server_side extends Observable {
    public  void postNews(String content){
        //表示状态或者内容发生改变
        setChanged();
        //通知所有观察者
        notifyObservers(content);
    }
    //添加观察者
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }
    //删除观察者
    @Override
    public synchronized void deleteObserver(Observer o) {
        super.deleteObserver(o);
    }
    //表示状态或者内容发生改变
    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }
    //通知所有观察者
    @Override
    public void notifyObservers(Object arg) {
        super.notifyObservers(arg);
    }
}
