package com.qianfeng.mingyihui.texiu.ui;

import android.os.Bundle;
import android.widget.ListView;

import com.google.gson.Gson;
import com.orhanobut.logger.Logger;
import com.qianfeng.mingyihui.R;
import com.qianfeng.mingyihui.other.ui.BaseActivity;
import com.qianfeng.mingyihui.other.utils.MingYiHuiTask;
import com.qianfeng.mingyihui.texiu.adapter.WenZhenAdapter;
import com.qianfeng.mingyihui.texiu.bean.WenZhen;
import com.qianfeng.mingyihui.texiu.util.TeXiuHttpUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 问诊详情页面
 */
public class TeXiu_WenZhenActivity extends BaseActivity {
    private List<WenZhen.BodyEntity.ListEntity>entityList=new ArrayList<WenZhen.BodyEntity.ListEntity>();
    private WenZhenAdapter adapter;
    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_texiu__wen_zhen;
    }

    @Override
    protected void initViews() {
       lv= (ListView) findViewById(R.id.texiu_wenzhen_lv);
        showLeftImage();
        setTitleText("1+1问诊");
        adapter=new WenZhenAdapter(TeXiu_WenZhenActivity.this,entityList);
    }

    @Override
    protected void initEvents() {
        lv.setAdapter(adapter);
    }

    @Override
    protected void initData() {
        TeXiuHttpUtil.requestAd(TeXiuHttpUtil.URL_TEXIU_WENZHEN, new MingYiHuiTask.RequestCallback() {
            @Override
            public void success(Object result) {
                Logger.json(result.toString());
                Gson gson=new Gson();
                WenZhen wenZhen=gson.fromJson(result.toString(), WenZhen.class);
                List<WenZhen.BodyEntity.ListEntity>list=wenZhen.getBody().getList();
                for (int i = 0; i <list.size() ; i++) {
                    entityList.add(list.get(i));
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void error(String msg) {
                Logger.e("tag",msg);
            }
        });
    }
}
