package com.qianfeng.mingyihui.texiu.ui;

import android.content.Intent;
import android.util.Log;
import android.widget.RadioGroup;

import com.qianfeng.mingyihui.R;
import com.qianfeng.mingyihui.other.ui.BaseFragment;
import com.qianfeng.mingyihui.other.utils.MingYiHuiTask;
import com.qianfeng.mingyihui.texiu.util.TeXiuHttpUtil;

/**
 * 特需模块页面
 * Created by Administrator on 2016/2/19.
 */
public class TeXiuFragment extends BaseFragment {
//    protected String[] adInfo;
//    protected String[] redirectUrl;
//    protected String[] imgUrl;
    private RadioGroup radioGroup;
    private RadioGroup.OnCheckedChangeListener changeListener=new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId){
                case R.id.texiu_wenzhen_rb :
                    getWenZhenInfo();
                    break;
                case R.id.texiu_peizhen_rb :
                    getPeiZhenInfo();
                    break;
                case R.id.texiu_chuzhen_rb :
                    getChuZhenfo();
                    break;
                case R.id.texiu_yizhen_rb :
                    getYiZhenInfo();
                    break;
                default:
                    break;
            }
        }


    };
    @Override
    protected int getLayout() {
        return R.layout.texiu_fragment;
    }

    @Override
    protected void initViews() {
        radioGroup= (RadioGroup) root.findViewById(R.id.texiu_content_rg);
    }

    @Override
    protected void initEvents() {
    radioGroup.setOnCheckedChangeListener(changeListener);
    }

    @Override
    protected void initData() {

        getStringJsonAd();
    }
    private void getStringJsonAd(){
        TeXiuHttpUtil.requestAd(TeXiuHttpUtil.URL_TEXIU_AD, new MingYiHuiTask.RequestCallback() {
            @Override
            public void success(Object result) {
                // Log.e("tag", result.toString());
                if (result == null) {
                    return;
                }

            }

            @Override
            public void error(String msg) {
                Log.e("tag", msg);
            }
        });
    }
    //问诊页面
    private void getWenZhenInfo() {
        Intent intent=new Intent(getActivity(),TeXiu_WenZhenActivity.class);
        startActivity(intent);
    }
    //陪诊页面
    private void getPeiZhenInfo(){
        Intent intent=new Intent(getActivity(),TeXiu_PeiZhenActivity.class);
        startActivity(intent);
    }
    //出诊页面
    private void getChuZhenfo() {
        Intent intent=new Intent(getActivity(),TeXiu_ChuZhenActivity.class);
        startActivity(intent);
    }
    //义诊页面
    private void getYiZhenInfo(){
        Intent intent=new Intent(getActivity(),TeXiu_YiZhenActivity.class);
        startActivity(intent);
    }
}
