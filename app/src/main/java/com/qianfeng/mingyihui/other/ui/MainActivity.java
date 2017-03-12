package com.qianfeng.mingyihui.other.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.lidroid.xutils.BitmapUtils;
import com.qianfeng.mingyihui.R;
import com.qianfeng.mingyihui.other.utils.MingYiHuiContent;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView= (ImageView) findViewById(R.id.main_content_iv);
       if(!isFirst()){
           String picurl="http://219.232.241.117/M00/01/A5/2-jxdVVma9LjsqNEAAb1NkT4Mys66x720x1280.png";
           int iSize=(int)(Runtime.getRuntime().maxMemory()/8);
           BitmapUtils bitmapUtils=new BitmapUtils(MainActivity.this,"/sdcard/",iSize);
           bitmapUtils.configMemoryCacheEnabled(true);//允许内存缓存
           bitmapUtils.configDiskCacheEnabled(true);//允许本地缓存
           bitmapUtils.display(imageView,picurl);
       }
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                   if(isFirst()){
                       Intent intent=new Intent(MainActivity.this,GuideActivity.class);
                       startActivity(intent);
                   }else {
                       Intent intent=new Intent(MainActivity.this,HomeActivity.class);
                       startActivity(intent);
                   }
                    finish();
                }
            },2000);


    }
    public boolean isFirst(){
        SharedPreferences sp=getSharedPreferences(MingYiHuiContent.PREFRENCE_FIRST_USED, Context.MODE_PRIVATE);
        return sp.getBoolean(MingYiHuiContent.PREFRENCE_FLAG_USED,true);
    }
}
