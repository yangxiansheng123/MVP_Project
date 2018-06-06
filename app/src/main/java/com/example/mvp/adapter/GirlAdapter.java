package com.example.mvp.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestOptions;
import com.example.mvp.R;
import com.example.mvp.bean.Girl;

import java.util.List;


public class GirlAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private List<Girl> girls;
    private Context mContext;

    public GirlAdapter(Context context, List<Girl> girs) {
        inflater = LayoutInflater.from(context);
        this.girls = girs;
        mContext = context;
    }

    @Override
    public int getCount() {
        return girls.size();
    }

    @Override
    public Object getItem(int position) {
        return girls.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = inflater.inflate(R.layout.item, null);
        Girl g = girls.get(position);
        ImageView iv_icon = (ImageView) view.findViewById(R.id.iv_icon);
//		iv_icon.setImageResource(g.icon);


        RequestOptions options = new RequestOptions()
                .placeholder(R.color.colorAccent)
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL);
        Glide.with(mContext)
                .load(g.icon)
                .transition(DrawableTransitionOptions.withCrossFade())
                .apply(options)
                .into(iv_icon);

        TextView tv_like = (TextView) view.findViewById(R.id.tv_like);
        tv_like.setText("喜欢程度:" + g.like);

        TextView tv_style = (TextView) view.findViewById(R.id.tv_style);
        tv_style.setText(g.style);

        return view;
    }

}
