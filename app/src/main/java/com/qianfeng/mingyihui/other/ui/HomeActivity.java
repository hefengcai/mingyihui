package com.qianfeng.mingyihui.other.ui;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import com.qianfeng.mingyihui.R;
import com.qianfeng.mingyihui.mingyibang.ui.LoginActivity;
import com.qianfeng.mingyihui.mingyibang.ui.MingYiBangActivity;
import com.qianfeng.mingyihui.mingyibang.ui.MingyiBangFragment;
import com.qianfeng.mingyihui.setting.ui.SettingFragment;
import com.qianfeng.mingyihui.texiu.ui.TeXiuFragment;
import com.qianfeng.mingyihui.yiliaoquan.ui.YiLiaoQuanFragment;

public class HomeActivity extends FragmentActivity {
    private Fragment[]fragments;
    private FrameLayout frameLayout;
    private RadioGroup radioGroup;
    private int checkIndex;
    private View checkButton;
    private boolean isLogin=false;
    private RadioGroup.OnCheckedChangeListener changeListener=new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            View radioButton=findViewById(checkedId);
            radioButton.performClick();
            if(checkButton==radioButton){
                return;
            }
            //把上一个的radiobutton颜色变回灰色
           checkButton.setSelected(false);
            //保存当前选中的radiobutton
            checkButton=radioButton;
            int index=0;
            switch (checkedId){
                case R.id.home_rb_texiu:
                    index=0;
                    break;
                case R.id.home_rb_yiliaoquan:
                    index=1;
                    break;
                case R.id.home_rb_mingyibang:
                    if(!isLogin){
                        Intent intent=new Intent(HomeActivity.this, LoginActivity.class);
                        startActivity(intent);
                        //设置切换动画 ，从右边进入，左边退出
                        HomeActivity.this.overridePendingTransition(R.anim.move_in_right,R.anim.out_to_left);
                    }else {
                       // index=2;
                        Intent intent=new Intent(HomeActivity.this, MingYiBangActivity.class);
                        startActivity(intent);
                    }
                    isLogin=true;
                    break;
                case R.id.home_rb_setting:
                    index=3;
                    break;
                default:
                    index=0;
                    break;
            }
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction transaction=fragmentManager.beginTransaction();
            transaction.show(fragments[index]);
            transaction.hide(fragments[checkIndex]);
            transaction.commit();
            checkIndex=index;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        frameLayout= (FrameLayout) findViewById(R.id.home_content_fl);
        radioGroup= (RadioGroup) findViewById(R.id.home_rg);
        //设置监听
        radioGroup.setOnCheckedChangeListener(changeListener);
        //从RadioGroup中获取第一个radiobutton
        View firstChild=radioGroup.getChildAt(0);
        fragments=new Fragment[]{new TeXiuFragment(),new YiLiaoQuanFragment(),new MingyiBangFragment(),
        new SettingFragment()};
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        for (int i = 0; i <fragments.length ; i++) {
            Fragment fragment=fragments[i];
            transaction.add(R.id.home_content_fl,fragment);
            transaction.hide(fragment);
        }
        transaction.show(fragments[0]);
        transaction.commit();
        checkButton=firstChild;
        //让第一个执行一下点击事件
        firstChild.performClick();
    }
}
