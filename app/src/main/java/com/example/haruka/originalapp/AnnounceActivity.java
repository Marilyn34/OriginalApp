package com.example.haruka.originalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


/**
 * Created by Haruka on 15/06/22.
 */
public class AnnounceActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announce);
    }

    public void click(View v) {
        Intent i = new Intent(this, SuggestionActivity.class);
        startActivity(i);
    }
}
