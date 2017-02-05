package com.zc.factory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.zc.factory.Demo.NOKIAPhoneFactor;
import com.zc.factory.Demo.NokiaFactory;
import com.zc.factory.Demo.NokiaN85;
import com.zc.factory.Demo.NokiaN97;
import com.zc.factory.Demo.NokiaPhone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NokiaFactory nokiaFactory= new NOKIAPhoneFactor();
        NokiaN85 nokiaN85=nokiaFactory.createNOKIAPhone(NokiaN85.class);
        nokiaN85.call();
        nokiaN85.send_sms();
        Log.e("111", "onCreate: ");
        NokiaN97 nokiaN97=nokiaFactory.createNOKIAPhone(NokiaN97.class);
        nokiaN97.call();
        nokiaN97.send_sms();
        NokiaPhone nokiaPhone=NokiaN85.



    }
}
