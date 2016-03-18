package com.example.administrator.myweather.util;

/**
 * Created by Administrator on 2016/3/18.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
