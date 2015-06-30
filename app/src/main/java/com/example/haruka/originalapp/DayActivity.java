package com.example.haruka.originalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by Haruka on 15/06/24.
 */
public class DayActivity extends ActionBarActivity {
    private Common common;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);

        common=(Common)getApplication();

        common.initD();
    }


    public void mon(View v){
        common.day=1;
        Intent i = new Intent(this, TempActivity.class);
        startActivity(i);
    }

    public void tue(View v){
        common.day=2;
        Intent i = new Intent(this, TempActivity.class);
        startActivity(i);
    }

    public void wed(View v){
        common.day=3;
        Intent i = new Intent(this, TempActivity.class);
        startActivity(i);
    }

    public void thu(View v){
        common.day=4;
        Intent i = new Intent(this, TempActivity.class);
        startActivity(i);
    }

    public void fri(View v){
        common.day=5;
        Intent i = new Intent(this, TempActivity.class);
        startActivity(i);
    }
}
