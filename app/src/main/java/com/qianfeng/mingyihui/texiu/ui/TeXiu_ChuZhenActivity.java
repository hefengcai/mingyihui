package com.qianfeng.mingyihui.texiu.ui;

import android.os.Bundle;
import android.widget.ListView;

import com.google.gson.Gson;
import com.orhanobut.logger.Logger;
import com.qianfeng.mingyihui.R;
import com.qianfeng.mingyihui.other.ui.BaseActivity;
import com.qianfeng.mingyihui.other.utils.MingYiHuiTask;
import com.qianfeng.mingyihui.texiu.adapter.ChuZhenAdapter;
import com.qianfeng.mingyihui.texiu.bean.ChuZhen;
import com.qianfeng.mingyihui.texiu.util.TeXiuHttpUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 特需模块出诊页面
 */
public class TeXiu_ChuZhenActivity extends BaseActivity {
    private ListView lv;
    private ChuZhenAdapter adapter;
    private List<ChuZhen.BodyEntity.ListEntity>entityList=new ArrayList<>();//防报空指针错误
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_te_xiu__chu_zhen;
    }

    @Override
    protected void initViews() {
    lv= (ListView) findViewById(R.id.texiu_chuzhen_lv);
        showLeftImage();
        setTitleText("专家出诊");
        setRightText("北京市");
        adapter=new ChuZhenAdapter(TeXiu_ChuZhenActivity.this,entityList);
    }

    @Override
    protected void initEvents() {
    lv.setAdapter(adapter);
    }

    @Override
    protected void initData() {
        TeXiuHttpUtil.requestAd(TeXiuHttpUtil.URL_TEXIU_CHUZHEN, new MingYiHuiTask.RequestCallback() {
            @Override
            public void success(Object result) {
                Logger.json(result.toString());
                if(result==null){
                    return;
                }
                Gson gson=new Gson();
                ChuZhen chuZhen=gson.fromJson(result.toString(),ChuZhen.class);
                List<ChuZhen.BodyEntity.ListEntity>list=chuZhen.getBody().getList();
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
