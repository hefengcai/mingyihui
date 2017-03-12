package com.qianfeng.mingyihui.setting.ui;

import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.qianfeng.mingyihui.R;
import com.qianfeng.mingyihui.other.ui.BaseFragment;

/**
 * 设置模块
 * Created by Administrator on 2016/2/19.
 */
public class SettingFragment extends BaseFragment {
    private LinearLayout login_ll,zixun_ll,huati_ll,yuyue_ll,setting_ll,shouchang_ll;
    @Override
    protected int getLayout() {
        return R.layout.setting_fragment;
    }

    @Override
    protected void initViews() {
        login_ll= (LinearLayout) root.findViewById(R.id.setting_login_ll);
        zixun_ll= (LinearLayout) root.findViewById(R.id.setting_zixun_ll);
        huati_ll= (LinearLayout) root.findViewById(R.id.setting_huati_ll);
        yuyue_ll= (LinearLayout) root.findViewById(R.id.setting_yuyue_ll);
        setting_ll= (LinearLayout) root.findViewById(R.id.setting_setting_ll);
        shouchang_ll= (LinearLayout) root.findViewById(R.id.setting_shouchang_ll);
    }

    @Override
    protected void initEvents() {
        login_ll.setOnClickListener(new ClickEvent());
        zixun_ll.setOnClickListener(new ClickEvent());
        huati_ll.setOnClickListener(new ClickEvent());
        yuyue_ll.setOnClickListener(new ClickEvent());
        shouchang_ll.setOnClickListener(new ClickEvent());
        setting_ll.setOnClickListener(new ClickEvent());
    }

    @Override
    protected void initData() {

    }
    private final class ClickEvent implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.setting_login_ll:
                    Log.e("tag","setting_login_ll");
                    break;
                case R.id.setting_zixun_ll:
                    Log.e("tag","setting_zixun_ll");
                    break;
                case R.id.setting_huati_ll:

                    break;
                case R.id.setting_yuyue_ll:

                    break;
                case R.id.setting_shouchang_ll:

                    break;
                case R.id.setting_setting_ll:

                    break;
            }
        }
    }
}
