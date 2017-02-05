package com.zc.myapplication;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Created by Panda_Program on 2017/1/7 0007.
 */

public class MemoryCache implements ImageCache{
    private LruCache<String,Bitmap> mMemeryCache;
    //初始化LRU缓存
    public MemoryCache(){
        //计算可使用的最大内存
        final int maxMemory= (int) (Runtime.getRuntime().maxMemory()/1024);
        //取最大值的四分之一
        final int cacheSize=maxMemory/4;
        mMemeryCache=new LruCache<String, Bitmap>(cacheSize){
            //bitmap所占资源的大小
            @Override
            protected int sizeOf(String key, Bitmap bitmap) {
                return bitmap.getRowBytes()*bitmap.getHeight()/1024;
            }
        };
    }

    @Override
    public void put(String url, Bitmap bitmap) {
        mMemeryCache.put(url,bitmap);
    }

    @Override
    public Bitmap get(String url) {
        return mMemeryCache.get(url);
    }

}
