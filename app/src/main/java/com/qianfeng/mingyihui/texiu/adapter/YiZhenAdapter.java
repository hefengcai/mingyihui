package com.qianfeng.mingyihui.texiu.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.qianfeng.mingyihui.R;
import com.qianfeng.mingyihui.other.utils.ImageLoader;
import com.qianfeng.mingyihui.texiu.bean.YiZhen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HeFengCai
 * 2016/2/23.
 */
public class YiZhenAdapter<T> extends BaseAdapter {

    private List<T> objects = new ArrayList<T>();
    private ImageLoader imageLoader;
    private Context context;
    private LayoutInflater layoutInflater;

    public YiZhenAdapter(Context context,List<T>list) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        imageLoader=new ImageLoader(context);
        objects=list;
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public T getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.adapter_texiu_yizhen, null);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.adapterYizhenHeaderIv = (ImageView) convertView.findViewById(R.id.adapter_yizhen_header_iv);
            viewHolder.adapterYizhenNameTv = (TextView) convertView.findViewById(R.id.adapter_yizhen_name_tv);
            viewHolder.adapterYizhenPlaceTv = (TextView) convertView.findViewById(R.id.adapter_yizhen_place_tv);
            viewHolder.adapterYizhenHospitalTv = (TextView) convertView.findViewById(R.id.adapter_yizhen_hospital_tv);
            viewHolder.adapterYizhenSpecialtyTv = (TextView) convertView.findViewById(R.id.adapter_yizhen_specialty_tv);

            convertView.setTag(viewHolder);
        }
        initializeViews((T)getItem(position), (ViewHolder) convertView.getTag());
        return convertView;
    }

    private void initializeViews(T object, ViewHolder holder) {
        //TODO implement
        YiZhen.BodyEntity.ListEntity listEntity= (YiZhen.BodyEntity.ListEntity) object;
        holder.adapterYizhenNameTv.setText(listEntity.getName());
        holder.adapterYizhenPlaceTv.setText(listEntity.getPlace());
        holder.adapterYizhenHospitalTv.setText(listEntity.getHospital());
        holder.adapterYizhenSpecialtyTv.setText("擅长："+listEntity.getSpecialty());
        imageLoader.DisplayImage(listEntity.getHeadImg(),holder.adapterYizhenHeaderIv);
    }

    protected class ViewHolder {
        private ImageView adapterYizhenHeaderIv;
        private TextView adapterYizhenNameTv;
        private TextView adapterYizhenPlaceTv;
        private TextView adapterYizhenHospitalTv;
        private TextView adapterYizhenSpecialtyTv;
    }
}
