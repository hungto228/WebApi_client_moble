package com.example.cuahang_client.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.cuahang_client.Model.Server;
import com.example.cuahang_client.R;


import org.json.JSONException;
import org.json.JSONObject;

public class Themsanpham extends AppCompatActivity {
    EditText edtten, edtgia,edthinhanh,edtsoluong,edtmota,edtloai;
    Button btnthem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themsanpham);
        init();
        btnthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PostSanPham();
            }
        });
    }
    public void init(){
        edtten = (EditText) findViewById(R.id.edttensp);
        edtgia = (EditText) findViewById(R.id.edtgiasp);
        edthinhanh = (EditText) findViewById(R.id.edthinhanh);
        edtsoluong = (EditText) findViewById(R.id.edtsoluong);
        edtmota = (EditText) findViewById(R.id.edtmota);
        edtloai = (EditText) findViewById(R.id.edtloaisp);
        btnthem = (Button) findViewById(R.id.btnThemsp);
    }
    //tensp,gia,hinhanhsp,soluong,mota,idsanpham
    public void PostSanPham() {
        String postUrl = Server.PostSanPham;
        RequestQueue requestQueue = Volley.newRequestQueue(getApplication());

        JSONObject postData = new JSONObject();
        try {
            postData.put("tensp", edtten.getText().toString());
            postData.put("gia", edtgia.getText().toString());
            postData.put("hinhanhsp",edthinhanh.getText().toString());
            postData.put("soluong", edtsoluong.getText().toString());
            postData.put("mota", edtmota.getText().toString());
            postData.put("idsanpham", edtloai.getText().toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, postUrl, postData,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "Thêm thành công", Toast.LENGTH_SHORT).show();
            }
        });

        requestQueue.add(jsonObjectRequest);

    }

}
