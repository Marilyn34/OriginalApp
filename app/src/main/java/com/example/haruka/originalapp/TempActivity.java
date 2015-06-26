package com.example.haruka.originalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by Haruka on 15/06/22.
 */
public class TempActivity extends ActionBarActivity {

    private Common common;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        common = (Common)getApplication();

        common.initWS();
    }


    public void click(View v) {
        Intent i = new Intent(this, ReminderActivity.class);
        startActivity(i);
    }

    public void sun(View v){
        common.weather =1;
    }

    public void cloud(View v){
        common.weather=2;
    }

    public void rain(View v){
        common.weather=3;
    }

    public void snow(View v){
        common.weather=4;
    }

    public void sup1(View v){
        common.season=11;
    }

    public void sup2(View v){
        common.season=12;
    }

    public void sup3(View v){
        common.season=13;
    }

    public void sup4(View v){
        common.season=14;
    }

    public void sum1(View v){
        common.season=21;
    }

    public void sum2(View v){
        common.season=22;
    }

    public void sum3(View v){
        common.season=23;
    }

    public void sum4(View v){
        common.season=24;
    }

    public void fal1(View v){
        common.season=31;
    }

    public void fal2(View v){
        common.season=32;
    }

    public void fal3(View v){
        common.season=33;
    }

    public void fal4(View v){
        common.season=34;
    }

    public void win1(View v){
        common.season=41;
    }

    public void win2(View v){
        common.season=42;
    }

    public void win3(View v){
        common.season=43;
    }

    public void win4(View v){
        common.season=44;
    }
}



