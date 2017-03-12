package com.qianfeng.mingyihui.mingyibang.ui;

import android.os.Bundle;

import com.qianfeng.mingyihui.R;
import com.qianfeng.mingyihui.other.ui.BaseActivity;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void initViews() {
        showLeftImage();
        setTitleText("登录");
    }

    @Override
    protected void initEvents() {

    }

    @Override
    protected void initData() {

    }
}
