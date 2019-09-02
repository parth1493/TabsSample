 package com.example.tabssample.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.tabssample.R;
import com.example.tabssample.tabs.CustomViewTabs;
import com.example.tabssample.tabs.IconTabs;
import com.example.tabssample.tabs.ScrollTabs;
import com.example.tabssample.tabs.TextTabs;

 public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private Button btnSimpleTabs, btnScrollableTabs, btnIconTabs, btnCustomIconTextTabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnSimpleTabs = (Button) findViewById(R.id.btnSimpleTabs);
        btnScrollableTabs = (Button) findViewById(R.id.btnScrollableTabs);
        btnIconTabs = (Button) findViewById(R.id.btnIconTabs);
        btnCustomIconTextTabs = (Button) findViewById(R.id.btnCustomIconTabs);

        btnSimpleTabs.setOnClickListener(this);
        btnScrollableTabs.setOnClickListener(this);
        btnIconTabs.setOnClickListener(this);
        btnCustomIconTextTabs.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId()) {

            case R.id.btnSimpleTabs:
                i = new Intent(MainActivity.this, TextTabs.class);
                startActivity(i);
                break;

            case R.id.btnIconTabs:
                i = new Intent(MainActivity.this, IconTabs.class);
                startActivity(i);
                break;

            case R.id.btnScrollableTabs:
                i = new Intent(MainActivity.this, ScrollTabs.class);
                startActivity(i);
                break;

            case R.id.btnCustomIconTabs:
                i = new Intent(MainActivity.this, CustomViewTabs.class);
                startActivity(i);
                break;

        }
    }
}
