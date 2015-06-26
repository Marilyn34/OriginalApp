package com.example.haruka.originalapp;

import android.app.Application;

/**
 * Created by Haruka on 15/06/25.
 */
public class Common extends Application {
    int weather;
    int season;
    int day;

    public void initWS(){
        weather=0;
        season=0;
    }

    public void initD(){
        day=0;
    }
}
