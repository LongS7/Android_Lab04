package com.example.android_lab04;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class ProductGridAdapter extends BaseAdapter {
    private final Context context;
    private final List<Product> productList;
    private final NumberFormat numberFormat;

    public ProductGridAdapter(Context context, List<Product> shopList) {
        this.context = context;
        this.productList = shopList;
        numberFormat = NumberFormat.getInstance(Locale.US);
    }

    @Override
    public int getCount() {
        return productList.size();
    }

    @Override
    public Object getItem(int position) {
        return productList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint({"SetTextI18n", "ViewHolder"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.product_item, parent, false);

        ImageView img = convertView.findViewById(R.id.image);
        TextView tvPrice = convertView.findViewById(R.id.price);
        TextView tvNumRate = convertView.findViewById(R.id.numOfRating);
        TextView tvDiscount = convertView.findViewById(R.id.discount);
        TextView tvName = convertView.findViewById(R.id.product_name);
        RatingBar rbRating = convertView.findViewById(R.id.rating);

        img.setImageResource(productList.get(position).getPhoto());
        tvPrice.setText(numberFormat.format(productList.get(position).getPrice()));
        tvName.setText(productList.get(position).getName());
        tvDiscount.setText("-" + productList.get(position).getDiscountPercent() + "%");
        tvNumRate.setText("(" + productList.get(position).getNumOfRating() + ")");
        rbRating.setRating(productList.get(position).getRating());

        return convertView;
    }
}
