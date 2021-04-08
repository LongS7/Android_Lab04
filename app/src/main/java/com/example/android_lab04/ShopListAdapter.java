package com.example.android_lab04;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ShopListAdapter extends BaseAdapter {
    private Context context;
    private List<Shop> shopList;

    public ShopListAdapter(Context context, List<Shop> shopList) {
        this.context = context;
        this.shopList = shopList;
    }

    @Override
    public int getCount() {
        return shopList.size();
    }

    @Override
    public Object getItem(int position) {
        return shopList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.listview_item, parent, false);

        ImageView img = convertView.findViewById(R.id.shop_image);
        TextView tvDescription = convertView.findViewById(R.id.shop_description);
        TextView tvName = convertView.findViewById(R.id.shop_name);

        img.setImageResource(shopList.get(position).getShopImage());
        tvDescription.setText(shopList.get(position).getDescription());
        tvName.setText(shopList.get(position).getName());

        return convertView;
    }
}
