package com.sutdy.work.weex_20180601;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.sutdy.work.weex_20180601.activity.netWorkActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void netWork(View view) {
        // describe add click for  you can intent an activiyt of netWorkActivity
        Intent intent =new Intent(getApplicationContext(), netWorkActivity.class);
        startActivity(intent);
    }
}
