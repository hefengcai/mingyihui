package com.qianfeng.mingyihui.other.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.qianfeng.mingyihui.R;

/**
 * Created by HeFengCai
 * 2016/2/23.
 */
public abstract class BaseActivity extends Activity {
    private ImageView ivLeft,ivRight;
    private TextView tvTitle,tvRight;
    private LinearLayout llContent;
    private RelativeLayout rlRight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        ivLeft= (ImageView) findViewById(R.id.title_bar_left_iv);
        ivRight= (ImageView) findViewById(R.id.title_bar_right_iv);
        tvTitle= (TextView) findViewById(R.id.title_bar_title_tv);
        tvRight= (TextView) findViewById(R.id.title_bar_right_tv);
        llContent= (LinearLayout) findViewById(R.id.base_content_all);
        rlRight= (RelativeLayout) findViewById(R.id.title_bar_right_rl);
        setDefaultEvent();
        //把子类里面的布局添加到title_bar下面的linearLayout去
        getLayoutInflater().inflate(getLayout(),llContent);
        initViews();
        initEvents();
        initData();

    }
    /**
     * 获取布局
     */
    protected abstract int getLayout();

    /**
     * 初始化视图
     */
    protected abstract void initViews();

    /**
     * 初始化事件
     */
    protected abstract void initEvents();

    /**
     * 初始化数据
     */
    protected abstract void initData();

    protected void setTitleText(String title){
        tvTitle.setText(title);
        tvTitle.setVisibility(View.VISIBLE);
    }
    protected void setTitleText(int stringId){
        tvTitle.setText(stringId);
        tvTitle.setVisibility(View.VISIBLE);
    }
    protected void setRightText(String title){
        tvRight.setText(title);
        tvRight.setVisibility(View.VISIBLE);
    }
    protected void setRightText(int stringId){
        tvRight.setText(stringId);
        tvRight.setVisibility(View.VISIBLE);
    }
    protected void setRightImage(int selectId){
        ivRight.setImageResource(selectId);
        ivRight.setVisibility(View.VISIBLE);
    }
    protected void showLeftImage(){
        ivLeft.setVisibility(View.VISIBLE);
    }
    private void setDefaultEvent(){
        ivLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    protected void setRightOnClickListener(View.OnClickListener OnClickListener){
        rlRight.setOnClickListener(OnClickListener);
    }

}
