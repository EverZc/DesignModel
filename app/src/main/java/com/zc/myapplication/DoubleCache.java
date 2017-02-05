package com.zc.myapplication;

import android.graphics.Bitmap;

/**
 * Created by Panda_Program on 2017/1/7 0007.
 */

public class DoubleCache implements ImageCache{
    ImageCache mMemoryCache=new MemoryCache();
    ImageCache mDiskCache=new DiskCache();
    //先从内存缓存缓存中获取图片,如果没有在从SD卡中获取
    public Bitmap get(String url){
        Bitmap bitmap=mMemoryCache.get(url);
        if (bitmap==null){
            bitmap=mDiskCache.get(url);
        }
        return bitmap;
    }
    //将图片缓存到内存和SD卡中
    public void put(String url,Bitmap bitmap){
        mMemoryCache.put(url,bitmap);
        mDiskCache.put(url,bitmap);
    }
}
