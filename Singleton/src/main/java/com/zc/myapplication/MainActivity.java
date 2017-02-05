package com.zc.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.fastjson.JSON;
import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;
import com.zc.myapplication.json.ArrayUtill;
import com.zc.myapplication.json.MainClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
String jsonData="{\n" +
        "    \"array\": [   \n" +
        "        {\n" +
        "            \"username\": \"在中\", \n" +
        "            \"recommend\": 0, \n" +
        "            \"user_photo\": \"0\", \n" +
        "            \"like\": false, \n" +
        "            \"reply_cnt\": 3, \n" +
        "            \"distance\": \"2154m\", \n" +
        "            \"add_date\": \"3天前\", \n" +
        "            \"text\": \"肯德基快吃吐了，明天去麦当劳看看\", \n" +
        "            \"stamp__name\": null, \n" +
        "            \"place_id\": 1, \n" +
        "            \"ptype\": \"d\", \n" +
        "            \"like_cnt\": \"2\", \n" +
        "            \"posting_image_url\": \"1\", \n" +
        "            \"stamp_name\": null, \n" +
        "            \"user\": 0, \n" +
        "            \"stamp__id\": null, \n" +
        "            \"dislike\": \"0\", \n" +
        "            \"icon\": \"cate_icon_a_09\", \n" +
        "            \"id\": 0, \n" +
        "            \"mayor_cnt\": 2, \n" +
        "            \"place_name\": \"东大桥肯德基\",\n" +
        "\t    \"place_level\": 2\n" +
        "        }, \n" +
        "        {\n" +
        "            \"username\": \"在中\", \n" +
        "            \"recommend\": 0, \n" +
        "            \"user_photo\": \"0\", \n" +
        "            \"like\": false, \n" +
        "              \"reply_cnt\": 0, \n" +
        "            \"distance\": \"2425m\", \n" +
        "            \"add_date\": \"3天前\", \n" +
        "            \"text\": \"这是在跳僵尸舞呢吗？\", \n" +
        "            \"stamp__name\": null, \n" +
        "            \"place_id\": 7, \n" +
        "            \"ptype\": \"d\", \n" +
        "            \"like_cnt\": \"0\", \n" +
        "            \"posting_image_url\": \"0\", \n" +
        "            \"stamp_name\": null, \n" +
        "            \"user\": 0, \n" +
        "            \"stamp__id\": null, \n" +
        "            \"dislike\": \"0\", \n" +
        "            \"icon\": \"cate_icon_b_05\", \n" +
        "            \"id\": 4, \n" +
        "            \"mayor_cnt\": 2, \n" +
        "            \"place_name\": \"悠唐\",\n" +
        "\t    \"place_level\": 1\n" +
        "        } \n" +
        "    ], \n" +
        "    \"error\": 0, \n" +
        "    \"next\": true\n" +
        "}";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String TAG = "My_Log";
        Logger.init(TAG).                //自定义设置一个TAG
                methodCount(3).          //方法栈的打印个数 默认是2
                hideThreadInfo().        //隐藏线程信息默认是显示的
                //methodOffset(8);       //设置调用堆栈函数偏移值 默认是0
                logLevel(LogLevel.FULL); //设置临时不打印
        //打印Log信息
        Logger.e("11");
        //打印JSON
       /* Gson gson=new Gson();
        MainClass mainClass=gson.fromJson(jsonData,MainClass.class);
        ArrayList<ArrayUtill> arrayUtills= (ArrayList<ArrayUtill>) mainClass.getArray();
        Logger.d(arrayUtills.get(1).getUsername());*/
        MainClass mainClass= JSON.parseObject(jsonData,MainClass.class);
        ArrayList<ArrayUtill> arrayUtills= (ArrayList<ArrayUtill>) mainClass.getArray();
        Logger.d(arrayUtills.get(0).getUsername());



    }
}
