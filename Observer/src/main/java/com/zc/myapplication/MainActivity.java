package com.zc.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //被观察的角色
        Server_side server_side=new Server_side();
        //观察者
        Client client=new Client("小猪");
        Client client1=new Client("小狗");
        Client client2=new Client("小鸭子");

        //将观察者注册到可观察的对象中
        server_side.addObserver(client);
        server_side.addObserver(client1);
        server_side.addObserver(client2);

        //发布消息
        server_side.postNews("萨达姆做好了战斗准备");


    }
    public class  AdTest extends BaseAdapter{
        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return null;
        }
    }
}
