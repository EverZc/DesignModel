package com.zc.factory.Demo;

import android.util.Log;

/**
 * Created by Panda_Program on 2017/1/14 0014.
 */

public class NokiaN85 extends NokiaPhone {
    @Override
    public void call() {
        Log.e("nokia","N85打电话");
    }

    @Override
    public void send_sms() {
        Log.e("nokia","N85发信息");

    }
}
