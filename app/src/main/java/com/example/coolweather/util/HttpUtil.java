package com.example.coolweather.util;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * author:hequnyu
 * Description:
 * Date:2020/7/29
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        Log.e("请求地址",address);
        client.newCall(request).enqueue(callback);
    }
}
