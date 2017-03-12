package com.qianfeng.mingyihui.other.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;

import com.qianfeng.mingyihui.R;
import com.qianfeng.mingyihui.other.adapter.GuideAdapter;
import com.qianfeng.mingyihui.other.utils.MingYiHuiContent;

import java.util.ArrayList;
import java.util.List;

/**
 * 引导页
 */
public class GuideActivity extends Activity {
    private ViewPager viewpager;
    private GuideAdapter adaper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        viewpager= (ViewPager) findViewById(R.id.guide_content_vp);

        final List<ImageView>list=new ArrayList<>();
        final int[]bitmaps={R.drawable.splash_one,R.drawable.splash_two,R.drawable.splash_three,R.drawable.splash_four};
        for (int i = 0; i <bitmaps.length ; i++) {
            ImageView imageview=new ImageView(this);
            imageview.setImageResource(bitmaps[i]);
            imageview.setScaleType(ImageView.ScaleType.FIT_XY);
            list.add(imageview);
        }
            adaper=new GuideAdapter(list);
            viewpager.setAdapter(adaper);
            viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
            if(position==list.size()-1){
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //进入主页面，并设置进入的标识
                        //获取指定的sharedprefrence
                        SharedPreferences sp=getSharedPreferences(MingYiHuiContent.PREFRENCE_FIRST_USED, Context.MODE_PRIVATE);
                        //获取编辑器
                        SharedPreferences.Editor editor=sp.edit();
                        //添加一个字段，表示第一次已经使用过了
                        editor.putBoolean(MingYiHuiContent.PREFRENCE_FLAG_USED,false);
                        editor.commit();
                        Intent intent=new Intent(GuideActivity.this,HomeActivity.class);
                        startActivity(intent);
                        finish();
                    }
                },2000);
            }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}
