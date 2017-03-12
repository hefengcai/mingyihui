package com.qianfeng.mingyihui.other.ui;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by HeFengCai
 * 2016/2/20.
 */
public class MyApplication extends Application {
   public static RequestQueue requestQueue;

    @Override
    public void onCreate() {
        super.onCreate();
        requestQueue= Volley.newRequestQueue(this);
    }
}
