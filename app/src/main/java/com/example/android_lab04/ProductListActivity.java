package com.example.android_lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.Arrays;
import java.util.List;

public class ProductListActivity extends AppCompatActivity {
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        List<Product> products = Arrays.asList(
                new Product(R.drawable.giacchuyen, "Cáp chuyển từ Cổng USB sang PS2", 4.3f, 15, 69900, 39),
                new Product(R.drawable.daynguon, "Dây nguồn cổng HDMI và USB", 3.5f, 10, 59900, 15),
                new Product(R.drawable.dauchuyendoipsps2, "Cáp chuyển từ Cổng USB sang PS2", 4.7f, 19, 80000, 25),
                new Product(R.drawable.dauchuyendoi, "Cáp chuyển từ Cổng USB sang PS2", 4.3f, 15, 69900, 39),
                new Product(R.drawable.carbusbtops2, "Cáp ăng ten kết hợp USB", 3.5f, 5, 36000, 10),
                new Product(R.drawable.daucam, "Đầu cắm", 4.0f, 9, 48900, 32)
        );

        ProductGridAdapter productGridAdapter = new ProductGridAdapter(this, products);

        gridView = findViewById(R.id.grid_view);
        gridView.setAdapter(productGridAdapter);
    }
}