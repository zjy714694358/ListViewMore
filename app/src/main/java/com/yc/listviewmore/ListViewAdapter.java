package com.yc.listviewmore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * @Date 2024/5/27 11:13
 * @Author ZJY
 * @email 714694358@qq.com
 */
public class ListViewAdapter extends BaseAdapter {
    private List<Number> items;
    private LayoutInflater inflater;

    public ListViewAdapter(Context context, List<Number> items) {
        this.items = items;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.lv_item_layout, null);
        }
        TextView text =  convertView.findViewById(R.id.tvLvItem);
        text.setText(items.get(position).numStr);
        return convertView;
    }
    /**
     * 添加列表项
     * @param item
     */
    public void addItem(Number item) {
        items.add(item);
    }
}
