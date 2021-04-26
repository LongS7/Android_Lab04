package com.example.android_lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class ShopListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_list);

        List<Shop> shops = Arrays.asList(
                new Shop(R.drawable.ca_nau_lau, "Ca nấu lẩu, nếu mì mini tiện dụng", "Devang"),
                new Shop(R.drawable.ga_bo_toi, "1 kg khô gà bơ tỏi", "LTD Food"),
                new Shop(R.drawable.xa_can_cau, "Xe cần cẩu đa năng", "Thế giới đồ chơi"),
                new Shop(R.drawable.do_choi_dang_mo_hinh, "Đồ chơi dạng mô hình", "Thế giới đồ chơi"),
                new Shop(R.drawable.lanh_dao_gian_don, "Lãnh đạo giản đơn", "Minh Long Book"),
                new Shop(R.drawable.hieu_long_con_tre, "Hiểu lòng con trẻ", "Minh Long Book"),
                new Shop(R.drawable.trump, "Donal Trump - Thiên tài lãnh đạo", "Minh Long Book")
        );

        ShopListAdapter shopListAdapter = new ShopListAdapter(this, shops);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(shopListAdapter);

    }
}