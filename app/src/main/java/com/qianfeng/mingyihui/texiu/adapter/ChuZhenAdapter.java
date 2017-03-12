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
import com.qianfeng.mingyihui.texiu.bean.ChuZhen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HeFengCai
 * 2016/2/23.
 */
public class ChuZhenAdapter<T> extends BaseAdapter {

    private List<T> objects = new ArrayList<T>();
    private ImageLoader imageLoader;
    private Context context;
    private LayoutInflater layoutInflater;

    public ChuZhenAdapter(Context context,List<T>list) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        objects=list;
        imageLoader=new ImageLoader(context);
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
            convertView = layoutInflater.inflate(R.layout.adapter_texiu_chuzhen, null);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.adapterChuzhenHeadreIv = (ImageView) convertView.findViewById(R.id.adapter_chuzhen_headre_iv);
            viewHolder.adapterChuzhenNameTv = (TextView) convertView.findViewById(R.id.adapter_chuzhen_name_tv);
            viewHolder.adapterChuzhenPlaceTv = (TextView) convertView.findViewById(R.id.adapter_chuzhen_place_tv);
            viewHolder.adapterChuzhenAnserTv = (TextView) convertView.findViewById(R.id.adapter_chuzhen_anser_tv);
            viewHolder.adapterChuzhenHospitalTv = (TextView) convertView.findViewById(R.id.adapter_chuzhen_hospital_tv);
            viewHolder.adapterChuzhenGoodTv = (TextView) convertView.findViewById(R.id.adapter_chuzhen_good_tv);
            viewHolder.adapterChuzhenScopeTv = (TextView) convertView.findViewById(R.id.adapter_chuzhen_scope_tv);

            convertView.setTag(viewHolder);
        }
        initializeViews((T)getItem(position), (ViewHolder) convertView.getTag());
        return convertView;
    }

    private void initializeViews(T object, ViewHolder holder) {
        //TODO implement
        ChuZhen.BodyEntity.ListEntity listEntity= (ChuZhen.BodyEntity.ListEntity) object;
        holder.adapterChuzhenNameTv.setText(listEntity.getName());
        holder.adapterChuzhenPlaceTv.setText(listEntity.getPlace());
        holder.adapterChuzhenHospitalTv.setText(listEntity.getHospital());
        holder.adapterChuzhenGoodTv.setText(listEntity.getSpecialty());
        String serviceRange=context.getString(R.string.texiu_chuzhen_list_servicerange,listEntity.getServiceRange());
        holder.adapterChuzhenScopeTv.setText(serviceRange);
        imageLoader.DisplayImage(listEntity.getHeadImg(),holder.adapterChuzhenHeadreIv);
    }

    protected class ViewHolder {
        private ImageView adapterChuzhenHeadreIv;
        private TextView adapterChuzhenNameTv;
        private TextView adapterChuzhenPlaceTv;
        private TextView adapterChuzhenAnserTv;
        private TextView adapterChuzhenHospitalTv;
        private TextView adapterChuzhenGoodTv;
        private TextView adapterChuzhenScopeTv;
    }
}
