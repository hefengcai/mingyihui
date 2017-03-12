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
import com.qianfeng.mingyihui.texiu.bean.PeiZhen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HeFengCai
 * 2016/2/23.
 */
public class PeiZhenAdapter<T> extends BaseAdapter {
    private List<T> objects = new ArrayList<T>();
    private Context context;
    private LayoutInflater layoutInflater;
    private ImageLoader imageLoader;
    public PeiZhenAdapter(Context context,List<T>list) {
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
            convertView = layoutInflater.inflate(R.layout.adapter_texiu_peizhen, null);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.adapterPeizhenPriceTv = (TextView) convertView.findViewById(R.id.adapter_peizhen_price_tv);
            viewHolder.adapterPeizhenOldpriceTv = (TextView) convertView.findViewById(R.id.adapter_peizhen_oldprice_tv);
            viewHolder.adapterPeizhenContentIv = (ImageView) convertView.findViewById(R.id.adapter_peizhen_content_iv);
            viewHolder.adapterPeizhenTitleTv = (TextView) convertView.findViewById(R.id.adapter_peizhen_title_tv);
            viewHolder.adapterPeizhenContentTv = (TextView) convertView.findViewById(R.id.adapter_peizhen_content_tv);

            convertView.setTag(viewHolder);
        }
        initializeViews((T)getItem(position), (ViewHolder) convertView.getTag());
        return convertView;
    }

    private void initializeViews(T object, ViewHolder holder) {
        //TODO implement
        PeiZhen.BodyEntity.ItemsEntity itemsEntity= (PeiZhen.BodyEntity.ItemsEntity) object;
        String priceInfo=context.getString(R.string.texiu_peizhen_list_price,itemsEntity.getPrice()+"");
        holder.adapterPeizhenPriceTv.setText(priceInfo);
        holder.adapterPeizhenOldpriceTv.setText(itemsEntity.getOldPrice()+"");
        holder.adapterPeizhenContentTv.setText(itemsEntity.getContent());
        holder.adapterPeizhenTitleTv.setText(itemsEntity.getTitle());
        imageLoader.DisplayImage(itemsEntity.getAndroidImage(),holder.adapterPeizhenContentIv);
    }

    protected class ViewHolder {
        private TextView adapterPeizhenPriceTv;
        private TextView adapterPeizhenOldpriceTv;
        private ImageView adapterPeizhenContentIv;
        private TextView adapterPeizhenTitleTv;
        private TextView adapterPeizhenContentTv;
    }
}

