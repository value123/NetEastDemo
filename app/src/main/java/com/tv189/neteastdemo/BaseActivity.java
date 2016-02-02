package com.tv189.neteastdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initActionBar();
    }

    private void initActionBar() {
//        getSupportActionBar().setCustomView(LayoutInflater.from(this).inflate(R.layout.title, null));
    }
}
