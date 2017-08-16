package com.lida.signdate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/8/16.
 */

public class AdapterWeek extends BaseAdapter {

    private String[] week = {"日","一","二","三","四","五","六"};
    private Context context;

    public AdapterWeek(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return week.length;
    }

    @Override
    public Object getItem(int i) {
        return week[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(view==null){
            view = LayoutInflater.from(context).inflate(R.layout.item_gv,null);
            viewHolder = new ViewHolder();
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.tv = view.findViewById(R.id.tvWeek);
        viewHolder.tv.setText(week[i]);
        return view;
    }

    class ViewHolder{
        TextView tv;
    }
}
