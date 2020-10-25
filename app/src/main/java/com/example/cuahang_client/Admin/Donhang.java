package com.example.cuahang_client.Admin;

import android.os.Bundle;
import android.view.View;

import com.example.cuahang_client.CustomView.ViewAdapteDonHang;
import com.example.cuahang_client.R;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;



public class Donhang extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donhangadapter);
        init();
    }
    public void init() {
        toolbar = (Toolbar) findViewById(R.id.tabDangNhap);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        tabLayout = (TabLayout) findViewById(R.id.tabDN);
        viewPager = (ViewPager) findViewById(R.id.viewPaper);

        ViewAdapteDonHang viewpaperAdapterDangNhap = new ViewAdapteDonHang(getSupportFragmentManager());

        viewPager.setAdapter(viewpaperAdapterDangNhap);
        viewpaperAdapterDangNhap.notifyDataSetChanged();
        tabLayout.setupWithViewPager(viewPager);
    }
}
