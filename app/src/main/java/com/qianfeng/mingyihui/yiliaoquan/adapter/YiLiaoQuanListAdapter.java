package com.qianfeng.mingyihui.yiliaoquan.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.qianfeng.mingyihui.R;
import com.qianfeng.mingyihui.other.utils.ImageLoader;
import com.qianfeng.mingyihui.yiliaoquan.bean.YiLiao;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by HeFengCai
 * 2016/2/24.
 */
public class YiLiaoQuanListAdapter<T> extends BaseAdapter {

    private List<T> objects = new ArrayList<T>();
    private ImageLoader imageLoader;
    private Context context;
    private LayoutInflater layoutInflater;

    public YiLiaoQuanListAdapter(Context context,List<T>list) {
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
            convertView = layoutInflater.inflate(R.layout.adapter_yiliaoquan_list, null);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.adapterYiliaoquanHeaderIv = (ImageView) convertView.findViewById(R.id.adapter_yiliaoquan_header_iv);
            viewHolder.adapterYiliaoquanNameTv = (TextView) convertView.findViewById(R.id.adapter_yiliaoquan_name_tv);
            viewHolder.adapterYiliaoquanTitleTv = (TextView) convertView.findViewById(R.id.adapter_yiliaoquan_title_tv);

            convertView.setTag(viewHolder);
        }
        initializeViews((T)getItem(position), (ViewHolder) convertView.getTag());
        return convertView;
    }

    private void initializeViews(T object, ViewHolder holder) {
        //TODO implement
        YiLiao.BodyEntity.ItemsEntity itemsEntity= (YiLiao.BodyEntity.ItemsEntity) object;
        holder.adapterYiliaoquanNameTv.setText(itemsEntity.getName()+"("+itemsEntity.getMessageNum()+")");
        holder.adapterYiliaoquanTitleTv.setText(itemsEntity.getTitle());
        imageLoader.DisplayImage(itemsEntity.getImage(),holder.adapterYiliaoquanHeaderIv);
    }

    protected class ViewHolder {
        private ImageView adapterYiliaoquanHeaderIv;
        private TextView adapterYiliaoquanNameTv;
        private TextView adapterYiliaoquanTitleTv;
    }
}
