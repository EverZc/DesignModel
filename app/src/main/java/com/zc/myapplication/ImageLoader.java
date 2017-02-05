package com.zc.myapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Panda_Program on 2017/1/4 0004.
 * 图片加载类
 */

public class ImageLoader {
    //图片缓存
    ImageCache mImageCache=new MemoryCache();
    //线程池 线程数量为CPU数量
    ExecutorService mExecutorService= Executors.newFixedThreadPool(
            Runtime.getRuntime().availableProcessors()
    );
    //注入缓存实现

    public ImageLoader(ImageCache mImageCache) {
        this.mImageCache = mImageCache;
    }

    //显示图片
    public void displayImage(final String url, final ImageView imageView){
        Bitmap bitmap=mImageCache.get(url);

        if (bitmap!=null){
            imageView.setImageBitmap(bitmap);
            return;
        }
        //图片没有缓存,提交到线程池中下载图片
        submitLoadRequest(url,imageView);


    }
    private void submitLoadRequest(final String imageUrl,
                                   final ImageView imageView){
        imageView.setTag(imageUrl);
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                Bitmap bitmap=downloadImage(imageUrl);
                if (bitmap==null){
                    return;
                }
                if (imageView.getTag().equals(imageUrl)){
                    imageView.setImageBitmap(bitmap);
                }
                mImageCache.put(imageUrl,bitmap);
            }
        });
    }
    //下载图片
    public Bitmap downloadImage(String imagUrl) {
        Bitmap bitmap=null;
        try {
            URL url=new URL(imagUrl);
            final HttpURLConnection conn= (HttpURLConnection) url.openConnection();
            bitmap= BitmapFactory.decodeStream(conn.getInputStream());
            conn.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bitmap;

    }
    //可以设置是否使用SD卡缓存
    public void useDiskCache(boolean useDiskCache){
        isUseDiskCache=useDiskCache;
    }
}
