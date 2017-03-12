package com.qianfeng.mingyihui.texiu.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.google.gson.Gson;
import com.orhanobut.logger.Logger;
import com.qianfeng.mingyihui.R;
import com.qianfeng.mingyihui.other.ui.BaseActivity;
import com.qianfeng.mingyihui.other.utils.MingYiHuiTask;
import com.qianfeng.mingyihui.texiu.adapter.PeiZhenAdapter;
import com.qianfeng.mingyihui.texiu.bean.PeiZhen;
import com.qianfeng.mingyihui.texiu.util.TeXiuHttpUtil;

import java.util.ArrayList;
import java.util.List;

public class TeXiu_PeiZhenActivity extends BaseActivity {
    private ListView lv;
    private PeiZhenAdapter adapter;
    private List<PeiZhen.BodyEntity.ItemsEntity>entityList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_te_xiu__pei_zhen;
    }

    @Override
    protected void initViews() {
        showLeftImage();
        setTitleText("健康陪诊");
        setRightText("电话预约");
        lv= (ListView) findViewById(R.id.texiu_peizhen_lv);
        adapter=new PeiZhenAdapter(TeXiu_PeiZhenActivity.this,entityList);
    }

    @Override
    protected void initEvents() {
    lv.setAdapter(adapter);
        setRightOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogInfo();
            }
        });
    }

    @Override
    protected void initData() {
        TeXiuHttpUtil.requestAd(TeXiuHttpUtil.URL_TEXIU_PEIZHEN, new MingYiHuiTask.RequestCallback() {
            @Override
            public void success(Object result) {
                if (result == null) {
                    return;
                }
                Logger.json(result.toString());
                Gson gson = new Gson();
                PeiZhen peiZhen = gson.fromJson(result.toString(), PeiZhen.class);
                List<PeiZhen.BodyEntity.ItemsEntity> list = peiZhen.getBody().getItems();
                for (int i = 0; i < list.size(); i++) {
                    entityList.add(list.get(i));
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void error(String msg) {
                Logger.e("tag", msg);
            }
        });
    }
    private void showDialogInfo() {
        AlertDialog dialog=new AlertDialog.Builder(this).setMessage("400-076-0706").setPositiveButton("呼叫", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                return;
            }
        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        }).create();
               dialog.show();
    }
}
