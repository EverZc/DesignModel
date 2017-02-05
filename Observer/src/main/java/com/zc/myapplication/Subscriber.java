package com.zc.myapplication;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Panda_Program on 2017/1/13 0013.
 */
//时间接收函数的注解类,运用在函数上
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Subscriber {
    /**
     * 事件的Tag,类似于BroadcastReceiver中的Action,事件的标识符
     */
    //String tag() default EventType.DEFAULT_TAG;
   // ThreadM
}
