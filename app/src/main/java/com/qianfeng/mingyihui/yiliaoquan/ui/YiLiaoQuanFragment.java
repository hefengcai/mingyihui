package com.qianfeng.mingyihui.yiliaoquan.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.gson.Gson;
import com.orhanobut.logger.Logger;
import com.qianfeng.mingyihui.R;
import com.qianfeng.mingyihui.other.ui.BaseFragment;
import com.qianfeng.mingyihui.other.utils.MingYiHuiTask;
import com.qianfeng.mingyihui.yiliaoquan.adapter.YiLiaoQuanListAdapter;
import com.qianfeng.mingyihui.yiliaoquan.bean.YiLiao;
import com.qianfeng.mingyihui.yiliaoquan.util.YiLiaoQuanHttpUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 医疗圈模块
 * Created by Administrator on 2016/2/19.
 */
public class YiLiaoQuanFragment extends BaseFragment {
    private ListView lv;
    private List<YiLiao.BodyEntity.ItemsEntity>entityList=new ArrayList<>();
    private YiLiaoQuanListAdapter adapter;
    @Override
    protected int getLayout() {
        return R.layout.yiliaoquan_fragment;
    }

    @Override
    protected void initViews() {
    lv= (ListView) root.findViewById(R.id.yiliaoquan_content_lv);
        adapter=new YiLiaoQuanListAdapter(getActivity(),entityList);
    }

    @Override
    protected void initEvents() {
        lv.setAdapter(adapter);
        //listView设置点击事件，当点击子项目的时候触发
        lv.setOnItemClickListener(new ItemClickEvent());
    }

    /**
     * 初始化数据
     */
    @Override
    protected void initData() {
        YiLiaoQuanHttpUtil.getJsonString(YiLiaoQuanHttpUtil.URL_YILIAOQUAN_YILIAO, new MingYiHuiTask.RequestCallback() {
            @Override
            public void success(Object result) {
                Logger.json(result.toString());
                if (result == null) {
                    return;
                }
                Gson gson=new Gson();
                YiLiao yiLiao=gson.fromJson(result.toString(), YiLiao.class);
                List<YiLiao.BodyEntity.ItemsEntity>list=yiLiao.getBody().getItems();
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

    /**
     * 继承OnItemClickListener，当点击子项目的时候触发
     */
    private final class ItemClickEvent implements AdapterView.OnItemClickListener {
        //这里需要注意的是第三个参数arg2，这是代表单击第几项
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch (position){
                case 0:

                    break;
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    break;
            }
        }
    }
}
