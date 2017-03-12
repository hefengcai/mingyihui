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
import com.qianfeng.mingyihui.texiu.bean.WenZhen;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by HeFengCai
 * 2016/2/23.
 */
public class WenZhenAdapter<T> extends BaseAdapter {

    private List<T> objects = new ArrayList<T>();

    private Context context;
    private LayoutInflater layoutInflater;
    private ImageLoader imageLoader;
    public WenZhenAdapter(Context context,List<T>list) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.objects=list;
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
            convertView = layoutInflater.inflate(R.layout.adapter_wenzhen_list, null);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.adapterWenzhenHeaderIv = (ImageView) convertView.findViewById(R.id.adapter_wenzhen_header_iv);
            viewHolder.adapterWenzhenNameTv = (TextView) convertView.findViewById(R.id.adapter_wenzhen_name_tv);
            viewHolder.adapterWenzhenPlaceTv = (TextView) convertView.findViewById(R.id.adapter_wenzhen_place_tv);

            viewHolder.adapterWenzhenHospitalTv = (TextView) convertView.findViewById(R.id.adapter_wenzhen_hospital_tv);

            viewHolder.adapterWenzhenSpecialtyTv = (TextView) convertView.findViewById(R.id.adapter_wenzhen_specialty_tv);

            convertView.setTag(viewHolder);
        }
        initializeViews((T)getItem(position), (ViewHolder) convertView.getTag());
        return convertView;
    }

    private void initializeViews(T object, ViewHolder holder) {

        //TODO implement
        WenZhen.BodyEntity.ListEntity listEntity= (WenZhen.BodyEntity.ListEntity) object;
        holder.adapterWenzhenNameTv.setText(listEntity.getName());
        holder.adapterWenzhenPlaceTv.setText(listEntity.getPlace());
        holder.adapterWenzhenHospitalTv.setText(listEntity.getHospital());

       // String goodat=context.getString(R.string.texiu_wenzen_list_good,listEntity.getSpecialty());
        holder.adapterWenzhenSpecialtyTv.setText("擅长："+listEntity.getSpecialty());

        imageLoader.DisplayImage(listEntity.getHeadImg(),holder.adapterWenzhenHeaderIv);
    }

    protected class ViewHolder {
        private ImageView adapterWenzhenHeaderIv;
        private TextView adapterWenzhenNameTv;
        private TextView adapterWenzhenPlaceTv;
        private TextView adapterWenzhenHospitalTv;
        private TextView adapterWenzhenSpecialtyTv;
    }
}

