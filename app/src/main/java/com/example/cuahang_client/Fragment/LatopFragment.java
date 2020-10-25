package com.example.cuahang_client.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.cuahang_client.DanhMuc;
import com.example.cuahang_client.R;

import androidx.appcompat.widget.Toolbar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;



public class LatopFragment extends Fragment {
    ImageButton asus,hp,acer;
    Button gia1,gia2,gia3,gia4,gia5,gia6;
    Toolbar toolbar;
    public LatopFragment() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.daudoc_fragment, container, false);

        asus = (ImageButton) view.findViewById(R.id.asus);

        hp = (ImageButton) view.findViewById(R.id.hp);
        acer = (ImageButton) view.findViewById(R.id.acer);

        gia1 = (Button) view.findViewById(R.id.gia1);
        gia2 = (Button) view.findViewById(R.id.gia2);
        gia3 = (Button) view.findViewById(R.id.gia3);
        gia4 = (Button) view.findViewById(R.id.gia4);
        gia5 = (Button) view.findViewById(R.id.gia5);
        gia6 = (Button) view.findViewById(R.id.gia6);

        toolbar = (Toolbar) view.findViewById(R.id.toolbardanhmuc);

        Envent();

        return view;
    }
    public void Envent(){
        asus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getContext(), DanhMuc.class);
                intent.putExtra("danhmuc","asus");
                startActivity(intent);
            }
        });
        acer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getContext(), DanhMuc.class);
                intent.putExtra("danhmuc","acer");
                startActivity(intent);
            }
        });
        hp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getContext(), DanhMuc.class);
                intent.putExtra("danhmuc","hp");
                startActivity(intent);
            }
        });



        gia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getContext(), DanhMuc.class);
                intent.putExtra("danhmuc","gia1");
                startActivity(intent);
            }
        });
        gia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getContext(), DanhMuc.class);
                intent.putExtra("danhmuc","gia2");
                startActivity(intent);
            }
        });
        gia3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getContext(), DanhMuc.class);
                intent.putExtra("danhmuc","gia3");
                startActivity(intent);
            }
        });
        gia4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getContext(), DanhMuc.class);
                intent.putExtra("danhmuc","gia4");
                startActivity(intent);
            }
        });
        gia5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getContext(), DanhMuc.class);
                intent.putExtra("danhmuc","gia5");
                startActivity(intent);
            }
        });
        gia6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getContext(), DanhMuc.class);
                intent.putExtra("danhmuc","gia6");
                startActivity(intent);
            }
        });
    }
}
