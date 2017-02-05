package com.zc.myapplication;

import android.graphics.Bitmap;

/**
 * Created by Panda_Program on 2017/1/4 0004.
 */

public interface  ImageCache {

    public void put(String url,Bitmap bitmap);

    public Bitmap get(String url);
}
