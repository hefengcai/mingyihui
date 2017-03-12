package com.qianfeng.mingyihui.texiu.ui;

import android.os.Bundle;
import android.widget.ListView;

import com.google.gson.Gson;
import com.orhanobut.logger.Logger;
import com.qianfeng.mingyihui.R;
import com.qianfeng.mingyihui.other.ui.BaseActivity;
import com.qianfeng.mingyihui.other.utils.MingYiHuiTask;
import com.qianfeng.mingyihui.texiu.adapter.YiZhenAdapter;
import com.qianfeng.mingyihui.texiu.bean.YiZhen;
import com.qianfeng.mingyihui.texiu.util.TeXiuHttpUtil;

import java.util.ArrayList;
import java.util.List;

public class TeXiu_YiZhenActivity extends BaseActivity {
    private ListView lv;
    private List<YiZhen.BodyEntity.ListEntity>listEntities=new ArrayList<>();
    private YiZhenAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_te_xiu__yi_zhen;
    }

    @Override
    protected void initViews() {
        lv= (ListView) findViewById(R.id.texiu_yizhen_list_lv);
        showLeftImage();
        setTitleText("专科义诊");
        adapter=new YiZhenAdapter(TeXiu_YiZhenActivity.this,listEntities);
    }

    @Override
    protected void initEvents() {
    lv.setAdapter(adapter);
    }

    @Override
    protected void initData() {
        TeXiuHttpUtil.requestAd(TeXiuHttpUtil.URL_TEXIU_YIZHEN, new MingYiHuiTask.RequestCallback() {
            @Override
            public void success(Object result) {
                Logger.json(result.toString());
                if(result==null){
                    return;
                }
                Gson gson=new Gson();
                YiZhen yiZhen=gson.fromJson(result.toString(), YiZhen.class);
                List<YiZhen.BodyEntity.ListEntity>list=yiZhen.getBody().getList();
                for (int i = 0; i <list.size() ; i++) {
                    listEntities.add(list.get(i));
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
