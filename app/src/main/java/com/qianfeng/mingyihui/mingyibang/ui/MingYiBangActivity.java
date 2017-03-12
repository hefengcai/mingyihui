package com.qianfeng.mingyihui.mingyibang.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.qianfeng.mingyihui.R;
import com.qianfeng.mingyihui.mingyibang.utils.DensityUtils;
import com.qianfeng.mingyihui.mingyibang.utils.ResourceReader;
import com.qianfeng.mingyihui.other.ui.BaseActivity;

public class MingYiBangActivity extends BaseActivity {
    private TextView tv1,tv2,tv3;
    private LinearLayout layout_tab;
    @Override
    protected int getLayout() {
        return R.layout.activity_mingyibang;
    }

    @Override
    protected void initViews() {
        tv1= (TextView) findViewById(R.id.tv001);
        tv2= (TextView) findViewById(R.id.tv002);
        tv3= (TextView) findViewById(R.id.tv003);
        layout_tab= (LinearLayout) findViewById(R.id.mingyibang_layout_tab);
    }

    @Override
    protected void initEvents() {
        tv1.setOnClickListener(new ClickEvent());
        tv2.setOnClickListener(new ClickEvent());
        tv3.setOnClickListener(new ClickEvent());
        //默认第一个被点击
        setTabSelected(tv1);
    }

    @Override
    protected void initData() {

    }
    private final class ClickEvent implements View.OnClickListener{

        @Override
        public void onClick(View v) {

        switch (v.getId()){
            case R.id.tv001:
                setTabSelected(tv1);
                break;
            case R.id.tv002:
                setTabSelected(tv2);
                break;
            case R.id.tv003:
                setTabSelected(tv3);
                break;
        }

        }

    }
    private void setTabSelected(TextView tvselected){
        Drawable selectedDrawable= ResourceReader.readDrawable(this,R.drawable.shape_nav_indicator);
        int screenWidth= DensityUtils.getScreenSize(this)[0];
        int right=screenWidth/3;
        selectedDrawable.setBounds(0, 0, right, DensityUtils.dipTopx(this, 3));
        tvselected.setSelected(true);
        tvselected.setCompoundDrawables(null,null,null,selectedDrawable);
        int size=layout_tab.getChildCount();
        for (int i = 0; i <size ; i++) {
            if(tvselected.getId()!=layout_tab.getChildAt(i).getId()){
                layout_tab.getChildAt(i).setSelected(false);
                ((TextView)layout_tab.getChildAt(i)).setCompoundDrawables(null,null,null,null);
            }
        }
    }

}
