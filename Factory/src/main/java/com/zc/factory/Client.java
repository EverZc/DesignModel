package com.zc.factory;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.zc.factory.Demo.NOKIAPhoneFactor;
import com.zc.factory.Demo.NokiaFactory;
import com.zc.factory.Demo.NokiaN85;
import com.zc.factory.Demo.NokiaN97;

/**
 * Created by Panda_Program on 2017/1/14 0014.
 */

public class Client  extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        NokiaFactory nokiaFactory= new NOKIAPhoneFactor();
        NokiaN85 nokiaN85=nokiaFactory.createNOKIAPhone(NokiaN85.class);
        nokiaN85.call();
        nokiaN85.send_sms();
        Log.e("111", "onCreate: ");
        NokiaN97 nokiaN97=nokiaFactory.createNOKIAPhone(NokiaN97.class);
        nokiaN97.call();
        nokiaN97.send_sms();
    }
}
