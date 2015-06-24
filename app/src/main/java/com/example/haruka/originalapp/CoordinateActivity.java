package com.example.haruka.originalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by Haruka on 15/06/23.
 */
public class CoordinateActivity extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinate);
    }

    public void click(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
