package com.example.examdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.recker.flybanner.FlyBanner;

public class HomeActivity extends AppCompatActivity {

    private FlyBanner banner;
    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        initData();
    }

    private void initData() {
        RequestQueue requestQueue = Volley.newRequestQueue(HomeActivity.this);
        //new JsonObjectRequest();
    }

    private void initView() {
        banner = (FlyBanner) findViewById(R.id.banner);
        recycler = (RecyclerView) findViewById(R.id.recycler);
    }
}
