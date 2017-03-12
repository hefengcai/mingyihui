package com.qianfeng.mingyihui.mingyibang.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qianfeng.mingyihui.R;

/**
 * Created by Administrator on 2016/2/19.
 */
public class MingyiBangFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.mingyibang_fragment,container,false);
        return view;
    }
}
