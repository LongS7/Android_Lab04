package com.example.android_lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity implements SendData {

    private TextView tvTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTotal = findViewById(R.id.tvTotal);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.frameBelow, BelowFragment.newInstance("0"))
                .commit();
    }

    @Override
    public void send(double price, int quantity) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        tvTotal.setText(numberFormat.format(quantity * price));

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameBelow, BelowFragment.newInstance(numberFormat.format(quantity * price)))
                .commit();
    }
}