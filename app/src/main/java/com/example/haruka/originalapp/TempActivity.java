package com.example.haruka.originalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.graphics.Typeface;
import android.graphics.Color;
import android.widget.TextView;

/**
 * Created by Haruka on 15/06/22.
 */
public class TempActivity extends ActionBarActivity {
    int sunny = 0;
    int cloudy = 0;
    int rainy = 0;
    int snowy = 0;
    int sup1 = 0;
    int sup2 = 0;
    int sup3 = 0;
    int sup4 = 0;
    int sum1 = 0;
    int sum2 = 0;
    int sum3 = 0;
    int sum4 = 0;
    int fal1 = 0;
    int fal2 = 0;
    int fal3 = 0;
    int fal4 = 0;
    int win1 = 0;
    int win2 = 0;
    int win3 = 0;
    int win4 = 0;
    Button sun;
    Button cloud;
    Button rain;
    Button snow;
    Button supr1;
    Button supr2;
    Button supr3;
    Button supr4;
    Button summ1;
    Button summ2;
    Button summ3;
    Button summ4;
    Button fall1;
    Button fall2;
    Button fall3;
    Button fall4;
    Button wint1;
    Button wint2;
    Button wint3;
    Button wint4;
    TextView temp;
    TextView weth;


    private Common common;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        sun = (Button) findViewById(R.id.button28);
        cloud = (Button) findViewById(R.id.button27);
        rain = (Button) findViewById(R.id.button30);
        snow = (Button) findViewById(R.id.button29);
        supr1 = (Button) findViewById(R.id.button15);
        supr2 = (Button) findViewById(R.id.button16);
        supr3 = (Button) findViewById(R.id.button17);
        supr4 = (Button) findViewById(R.id.button18);
        summ1 = (Button) findViewById(R.id.button19);
        summ2 = (Button) findViewById(R.id.button20);
        summ3 = (Button) findViewById(R.id.button21);
        summ4 = (Button) findViewById(R.id.button22);
        fall1 = (Button) findViewById(R.id.button23);
        fall2 = (Button) findViewById(R.id.button24);
        fall3 = (Button) findViewById(R.id.button25);
        fall4 = (Button) findViewById(R.id.button26);
        wint1 = (Button) findViewById(R.id.button11);
        wint2 = (Button) findViewById(R.id.button12);
        wint3 = (Button) findViewById(R.id.button13);
        wint4 = (Button) findViewById(R.id.button14);
        common = (Common) getApplication();
        common.initWS();
        temp = (TextView) findViewById(R.id.textView19);
        temp.setTypeface(Typeface.create(Typeface.MONOSPACE, Typeface.ITALIC));
        weth = (TextView) findViewById(R.id.textView20);
        weth.setTypeface(Typeface.create(Typeface.MONOSPACE, Typeface.ITALIC));

    }


    public void click(View v) {
        Intent i = new Intent(this, ReminderActivity.class);
        startActivity(i);
    }

    public void sun(View v) {
        sunny++;
        if (sunny % 2 == 1) {

            sun.setBackgroundColor(Color.rgb(0, 100, 200));
            cloud.setBackgroundResource(R.drawable.cloud);
            rain.setBackgroundResource(R.drawable.rain);
            snow.setBackgroundResource(R.drawable.snow_flake);
            common.weather = 1;
        } else {
            common.weather = 0;
            sun.setBackgroundResource(R.drawable.sun_weather);
        }
    }

    public void cloud(View v) {
        cloudy++;
        if (cloudy % 2 == 1) {
            cloud.setBackgroundColor(Color.rgb(0, 100, 200));
            sun.setBackgroundResource(R.drawable.sun_weather);
            rain.setBackgroundResource(R.drawable.rain);
            snow.setBackgroundResource(R.drawable.snow_flake);
            common.weather = 2;
        } else {
            cloud.setBackgroundResource(R.drawable.cloud);
            common.weather = 0;
        }
    }

    public void rain(View v) {
        rainy++;
        if (rainy % 2 == 1) {
            rain.setBackgroundColor(Color.rgb(0, 100, 200));
            sun.setBackgroundResource(R.drawable.sun_weather);
            cloud.setBackgroundResource(R.drawable.cloud);
            snow.setBackgroundResource(R.drawable.snow_flake);
            common.weather = 3;
        } else {
            rain.setBackgroundResource(R.drawable.rain);
            common.weather = 0;
        }
    }

    public void snow(View v) {
        snowy++;
        if (snowy % 2 == 1) {
            snow.setBackgroundColor(Color.rgb(0, 100, 200));
            sun.setBackgroundResource(R.drawable.sun_weather);
            cloud.setBackgroundResource(R.drawable.cloud);
            rain.setBackgroundResource(R.drawable.rain);
            common.weather = 4;
        } else {
            snow.setBackgroundResource(R.drawable.snow_flake);
            common.weather = 0;
        }
    }

    public void sup1(View v) {
        sup1++;
        if (sup1 % 2 == 1) {
            supr1.setBackgroundColor((Color.rgb(0, 100, 200)));

            supr2.setBackgroundColor(Color.rgb(255, 85, 204));
            supr3.setBackgroundColor(Color.rgb(255, 76, 142));
            supr4.setBackgroundColor(Color.rgb(255, 113, 102));
            summ1.setBackgroundColor(Color.rgb(255, 191, 10));
            summ2.setBackgroundColor(Color.rgb(255, 157, 21));
            summ3.setBackgroundColor(Color.rgb(255, 91, 63));
            summ4.setBackgroundColor(Color.rgb(255, 0, 17));
            fall1.setBackgroundColor(Color.rgb(180, 255, 0));
            fall2.setBackgroundColor(Color.rgb(206, 243, 72));
            fall3.setBackgroundColor(Color.rgb(191, 220, 27));
            fall4.setBackgroundColor(Color.rgb(208, 239, 0));
            wint1.setBackgroundColor(Color.rgb(115, 251, 255));
            wint2.setBackgroundColor(Color.rgb(54, 244, 255));
            wint3.setBackgroundColor(Color.rgb(68, 191, 255));
            wint4.setBackgroundColor(Color.rgb(0, 89, 255));

            common.season = 11;
        } else {
            supr1.setBackgroundColor(Color.rgb(227, 170, 255));
            common.weather = 0;
        }

    }

    public void sup2(View v) {
        sup2++;
        if (sup2 % 2 == 1) {
            supr2.setBackgroundColor(Color.rgb(0, 100, 200));
            supr1.setBackgroundColor(Color.rgb(227, 170, 255));
            supr3.setBackgroundColor(Color.rgb(255, 76, 142));
            supr4.setBackgroundColor(Color.rgb(255, 113, 102));
            summ1.setBackgroundColor(Color.rgb(255, 191, 10));
            summ2.setBackgroundColor(Color.rgb(255, 157, 21));
            summ3.setBackgroundColor(Color.rgb(255, 91, 63));
            summ4.setBackgroundColor(Color.rgb(255, 0, 17));
            fall1.setBackgroundColor(Color.rgb(180, 255, 0));
            fall2.setBackgroundColor(Color.rgb(206, 243, 72));
            fall3.setBackgroundColor(Color.rgb(191, 220, 27));
            fall4.setBackgroundColor(Color.rgb(208, 239, 0));
            wint1.setBackgroundColor(Color.rgb(115, 251, 255));
            wint2.setBackgroundColor(Color.rgb(54, 244, 255));
            wint3.setBackgroundColor(Color.rgb(68, 191, 255));
            wint4.setBackgroundColor(Color.rgb(0, 89, 255));
            common.season = 12;
        } else {
            supr2.setBackgroundColor(Color.rgb(255, 85, 204));
            common.season = 0;
        }
    }

    public void sup3(View v) {
        sup3++;
        if (sup3 % 2 == 1) {
            supr1.setBackgroundColor(Color.rgb(227, 170, 255));
            supr2.setBackgroundColor(Color.rgb(255, 85, 204));
            supr3.setBackgroundColor(Color.rgb(0, 100, 200));
            supr4.setBackgroundColor(Color.rgb(255, 113, 102));
            summ1.setBackgroundColor(Color.rgb(255, 191, 10));
            summ2.setBackgroundColor(Color.rgb(255, 157, 21));
            summ3.setBackgroundColor(Color.rgb(255, 91, 63));
            summ4.setBackgroundColor(Color.rgb(255, 0, 17));
            fall1.setBackgroundColor(Color.rgb(180, 255, 0));
            fall2.setBackgroundColor(Color.rgb(206, 243, 72));
            fall3.setBackgroundColor(Color.rgb(191, 220, 27));
            fall4.setBackgroundColor(Color.rgb(208, 239, 0));
            wint1.setBackgroundColor(Color.rgb(115, 251, 255));
            wint2.setBackgroundColor(Color.rgb(54, 244, 255));
            wint3.setBackgroundColor(Color.rgb(68, 191, 255));
            wint4.setBackgroundColor(Color.rgb(0, 89, 255));
            common.season = 13;
        } else {
            supr3.setBackgroundColor(Color.rgb(255, 76, 142));
            common.season = 0;
        }
    }

    public void sup4(View v) {
        sup4++;
        if (sup4 % 2 == 1) {
            supr1.setBackgroundColor(Color.rgb(227, 170, 255));
            supr2.setBackgroundColor(Color.rgb(255, 85, 204));
            supr3.setBackgroundColor(Color.rgb(255, 76, 142));
            supr4.setBackgroundColor(Color.rgb(0, 10, 200));
            summ1.setBackgroundColor(Color.rgb(255, 191, 10));
            summ2.setBackgroundColor(Color.rgb(255, 157, 21));
            summ3.setBackgroundColor(Color.rgb(255, 91, 63));
            summ4.setBackgroundColor(Color.rgb(255, 0, 17));
            fall1.setBackgroundColor(Color.rgb(180, 255, 0));
            fall2.setBackgroundColor(Color.rgb(206, 243, 72));
            fall3.setBackgroundColor(Color.rgb(191, 220, 27));
            fall4.setBackgroundColor(Color.rgb(208, 239, 0));
            wint1.setBackgroundColor(Color.rgb(115, 251, 255));
            wint2.setBackgroundColor(Color.rgb(54, 244, 255));
            wint3.setBackgroundColor(Color.rgb(68, 191, 255));
            wint4.setBackgroundColor(Color.rgb(0, 89, 255));
            common.season = 14;
        } else {
            supr4.setBackgroundColor(Color.rgb(255, 113, 102));
            common.season = 0;
        }
    }

    public void sum1(View v) {
        sum1++;
        if (sum1 % 2 == 1) {
            supr1.setBackgroundColor(Color.rgb(227, 170, 255));
            supr2.setBackgroundColor(Color.rgb(255, 85, 204));
            supr3.setBackgroundColor(Color.rgb(255, 76, 142));
            supr4.setBackgroundColor(Color.rgb(255, 113, 102));
            summ1.setBackgroundColor(Color.rgb(0, 100, 200));
            summ2.setBackgroundColor(Color.rgb(255, 157, 21));
            summ3.setBackgroundColor(Color.rgb(255, 91, 63));
            summ4.setBackgroundColor(Color.rgb(255, 0, 17));
            fall1.setBackgroundColor(Color.rgb(180, 255, 0));
            fall2.setBackgroundColor(Color.rgb(206, 243, 72));
            fall3.setBackgroundColor(Color.rgb(191, 220, 27));
            fall4.setBackgroundColor(Color.rgb(208, 239, 0));
            wint1.setBackgroundColor(Color.rgb(115, 251, 255));
            wint2.setBackgroundColor(Color.rgb(54, 244, 255));
            wint3.setBackgroundColor(Color.rgb(68, 191, 255));
            wint4.setBackgroundColor(Color.rgb(0, 89, 255));
            common.season = 21;
        } else {
            summ1.setBackgroundColor(Color.rgb(255, 191, 10));
            common.season = 0;
        }
    }

    public void sum2(View v) {
        sum2++;
        if (sum2 % 2 == 1) {
            supr1.setBackgroundColor(Color.rgb(227, 170, 255));
            supr2.setBackgroundColor(Color.rgb(255, 85, 204));
            supr3.setBackgroundColor(Color.rgb(255, 76, 142));
            supr4.setBackgroundColor(Color.rgb(255, 113, 102));
            summ1.setBackgroundColor(Color.rgb(255, 191, 10));
            summ2.setBackgroundColor(Color.rgb(0, 100, 200));
            summ3.setBackgroundColor(Color.rgb(255, 91, 63));
            summ4.setBackgroundColor(Color.rgb(255, 0, 17));
            fall1.setBackgroundColor(Color.rgb(180, 255, 0));
            fall2.setBackgroundColor(Color.rgb(206, 243, 72));
            fall3.setBackgroundColor(Color.rgb(191, 220, 27));
            fall4.setBackgroundColor(Color.rgb(208, 239, 0));
            wint1.setBackgroundColor(Color.rgb(115, 251, 255));
            wint2.setBackgroundColor(Color.rgb(54, 244, 255));
            wint3.setBackgroundColor(Color.rgb(68, 191, 255));
            wint4.setBackgroundColor(Color.rgb(0, 89, 255));
            common.season = 22;
        } else {
            summ2.setBackgroundColor(Color.rgb(255, 157, 21));
            common.season = 0;
        }
    }

    public void sum3(View v) {
        sum3++;
        if (sum3 % 2 == 1) {
            supr1.setBackgroundColor(Color.rgb(227, 170, 255));
            supr2.setBackgroundColor(Color.rgb(255, 85, 204));
            supr3.setBackgroundColor(Color.rgb(255, 76, 142));
            supr4.setBackgroundColor(Color.rgb(255, 113, 102));
            summ1.setBackgroundColor(Color.rgb(255, 191, 10));
            summ2.setBackgroundColor(Color.rgb(255, 157, 21));
            summ3.setBackgroundColor(Color.rgb(0, 100, 200));
            summ4.setBackgroundColor(Color.rgb(255, 0, 17));
            fall1.setBackgroundColor(Color.rgb(180, 255, 0));
            fall2.setBackgroundColor(Color.rgb(206, 243, 72));
            fall3.setBackgroundColor(Color.rgb(191, 220, 27));
            fall4.setBackgroundColor(Color.rgb(208, 239, 0));
            wint1.setBackgroundColor(Color.rgb(115, 251, 255));
            wint2.setBackgroundColor(Color.rgb(54, 244, 255));
            wint3.setBackgroundColor(Color.rgb(68, 191, 255));
            wint4.setBackgroundColor(Color.rgb(0, 89, 255));
            common.season = 23;
        } else {
            summ3.setBackgroundColor(Color.rgb(255, 91, 63));
            common.season = 0;
        }
    }

    public void sum4(View v) {
        sum4++;
        if (sum4 % 2 == 1) {
            supr1.setBackgroundColor(Color.rgb(227, 170, 255));
            supr2.setBackgroundColor(Color.rgb(255, 85, 204));
            supr3.setBackgroundColor(Color.rgb(255, 76, 142));
            supr4.setBackgroundColor(Color.rgb(255, 113, 102));
            summ1.setBackgroundColor(Color.rgb(255, 191, 10));
            summ2.setBackgroundColor(Color.rgb(255, 157, 21));
            summ3.setBackgroundColor(Color.rgb(255, 91, 63));
            summ4.setBackgroundColor(Color.rgb(0, 100, 200));
            fall1.setBackgroundColor(Color.rgb(180, 255, 0));
            fall2.setBackgroundColor(Color.rgb(206, 243, 72));
            fall3.setBackgroundColor(Color.rgb(191, 220, 27));
            fall4.setBackgroundColor(Color.rgb(208, 239, 0));
            wint1.setBackgroundColor(Color.rgb(115, 251, 255));
            wint2.setBackgroundColor(Color.rgb(54, 244, 255));
            wint3.setBackgroundColor(Color.rgb(68, 191, 255));
            wint4.setBackgroundColor(Color.rgb(0, 89, 255));
            common.season = 24;
        } else {
            summ4.setBackgroundColor(Color.rgb(255, 0, 17));
            common.season = 0;
        }
    }

    public void fal1(View v) {
        fal1++;
        if (fal1 % 2 == 1) {
            supr1.setBackgroundColor(Color.rgb(227, 170, 255));
            supr2.setBackgroundColor(Color.rgb(255, 85, 204));
            supr3.setBackgroundColor(Color.rgb(255, 76, 142));
            supr4.setBackgroundColor(Color.rgb(255, 113, 102));
            summ1.setBackgroundColor(Color.rgb(255, 191, 10));
            summ2.setBackgroundColor(Color.rgb(255, 157, 21));
            summ3.setBackgroundColor(Color.rgb(255, 91, 63));
            summ4.setBackgroundColor(Color.rgb(255, 0, 17));
            fall1.setBackgroundColor(Color.rgb(0, 100, 200));
            fall2.setBackgroundColor(Color.rgb(206, 243, 72));
            fall3.setBackgroundColor(Color.rgb(191, 220, 27));
            fall4.setBackgroundColor(Color.rgb(208, 239, 0));
            wint1.setBackgroundColor(Color.rgb(115, 251, 255));
            wint2.setBackgroundColor(Color.rgb(54, 244, 255));
            wint3.setBackgroundColor(Color.rgb(68, 191, 255));
            wint4.setBackgroundColor(Color.rgb(0, 89, 255));
            common.season = 31;
        } else {
            fall1.setBackgroundColor(Color.rgb(180, 255, 0));
            common.season = 0;
        }
    }

    public void fal2(View v) {
        fal2++;
        if (fal2 % 2 == 1) {
            supr1.setBackgroundColor(Color.rgb(227, 170, 255));
            supr2.setBackgroundColor(Color.rgb(255, 85, 204));
            supr3.setBackgroundColor(Color.rgb(255, 76, 142));
            supr4.setBackgroundColor(Color.rgb(255, 113, 102));
            summ1.setBackgroundColor(Color.rgb(255, 191, 10));
            summ2.setBackgroundColor(Color.rgb(255, 157, 21));
            summ3.setBackgroundColor(Color.rgb(255, 91, 63));
            summ4.setBackgroundColor(Color.rgb(255, 0, 17));
            fall1.setBackgroundColor(Color.rgb(180, 255, 0));
            fall2.setBackgroundColor(Color.rgb(0, 100, 200));
            fall3.setBackgroundColor(Color.rgb(191, 220, 27));
            fall4.setBackgroundColor(Color.rgb(208, 239, 0));
            wint1.setBackgroundColor(Color.rgb(115, 251, 255));
            wint2.setBackgroundColor(Color.rgb(54, 244, 255));
            wint3.setBackgroundColor(Color.rgb(68, 191, 255));
            wint4.setBackgroundColor(Color.rgb(0, 89, 255));
            common.season = 32;
        } else {
            fall2.setBackgroundColor(Color.rgb(206, 243, 72));
            common.season = 0;
        }
    }

    public void fal3(View v) {
        fal3++;
        if (fal3 % 2 == 1) {
            supr1.setBackgroundColor(Color.rgb(227, 170, 255));
            supr2.setBackgroundColor(Color.rgb(255, 85, 204));
            supr3.setBackgroundColor(Color.rgb(255, 76, 142));
            supr4.setBackgroundColor(Color.rgb(255, 113, 102));
            summ1.setBackgroundColor(Color.rgb(255, 191, 10));
            summ2.setBackgroundColor(Color.rgb(255, 157, 21));
            summ3.setBackgroundColor(Color.rgb(255, 91, 63));
            summ4.setBackgroundColor(Color.rgb(255, 0, 17));
            fall1.setBackgroundColor(Color.rgb(180, 255, 0));
            fall2.setBackgroundColor(Color.rgb(206, 243, 72));
            fall3.setBackgroundColor(Color.rgb(0, 100, 200));
            fall4.setBackgroundColor(Color.rgb(208, 239, 0));
            wint1.setBackgroundColor(Color.rgb(115, 251, 255));
            wint2.setBackgroundColor(Color.rgb(54, 244, 255));
            wint3.setBackgroundColor(Color.rgb(68, 191, 255));
            wint4.setBackgroundColor(Color.rgb(0, 89, 255));
            common.season = 33;
        } else {
            fall3.setBackgroundColor(Color.rgb(191, 220, 27));
            common.season = 0;
        }
    }

    public void fal4(View v) {
        fal4++;
        if (fal4 % 2 == 1) {
            supr1.setBackgroundColor(Color.rgb(227, 170, 255));
            supr2.setBackgroundColor(Color.rgb(255, 85, 204));
            supr3.setBackgroundColor(Color.rgb(255, 76, 142));
            supr4.setBackgroundColor(Color.rgb(255, 113, 102));
            summ1.setBackgroundColor(Color.rgb(255, 191, 10));
            summ2.setBackgroundColor(Color.rgb(255, 157, 21));
            summ3.setBackgroundColor(Color.rgb(255, 91, 63));
            summ4.setBackgroundColor(Color.rgb(255, 0, 17));
            fall1.setBackgroundColor(Color.rgb(180, 255, 0));
            fall2.setBackgroundColor(Color.rgb(206, 243, 72));
            fall3.setBackgroundColor(Color.rgb(191, 220, 27));
            fall4.setBackgroundColor(Color.rgb(0, 100, 200));
            wint1.setBackgroundColor(Color.rgb(115, 251, 255));
            wint2.setBackgroundColor(Color.rgb(54, 244, 255));
            wint3.setBackgroundColor(Color.rgb(68, 191, 255));
            wint4.setBackgroundColor(Color.rgb(0, 89, 255));
            common.season = 34;
        } else {
            ;
            fall4.setBackgroundColor(Color.rgb(208, 239, 0));
            common.season = 0;
        }
    }

    public void win1(View v) {
        win1++;
        if (win1 % 2 == 1) {
            supr1.setBackgroundColor(Color.rgb(227, 170, 255));
            supr2.setBackgroundColor(Color.rgb(255, 85, 204));
            supr3.setBackgroundColor(Color.rgb(255, 76, 142));
            supr4.setBackgroundColor(Color.rgb(255, 113, 102));
            summ1.setBackgroundColor(Color.rgb(255, 191, 10));
            summ2.setBackgroundColor(Color.rgb(255, 157, 21));
            summ3.setBackgroundColor(Color.rgb(255, 91, 63));
            summ4.setBackgroundColor(Color.rgb(255, 0, 17));
            fall1.setBackgroundColor(Color.rgb(180, 255, 0));
            fall2.setBackgroundColor(Color.rgb(206, 243, 72));
            fall3.setBackgroundColor(Color.rgb(191, 220, 27));
            fall4.setBackgroundColor(Color.rgb(208, 239, 0));
            wint1.setBackgroundColor(Color.rgb(0, 100, 200));
            wint2.setBackgroundColor(Color.rgb(54, 244, 255));
            wint3.setBackgroundColor(Color.rgb(68, 191, 255));
            wint4.setBackgroundColor(Color.rgb(0, 89, 255));
            common.season = 41;
        } else {
            wint1.setBackgroundColor(Color.rgb(115, 251, 255));
            common.season = 0;
        }
    }

    public void win2(View v) {
        win2++;
        if (win2 % 2 == 1) {
            supr1.setBackgroundColor(Color.rgb(227, 170, 255));
            supr2.setBackgroundColor(Color.rgb(255, 85, 204));
            supr3.setBackgroundColor(Color.rgb(255, 76, 142));
            supr4.setBackgroundColor(Color.rgb(255, 113, 102));
            summ1.setBackgroundColor(Color.rgb(255, 191, 10));
            summ2.setBackgroundColor(Color.rgb(255, 157, 21));
            summ3.setBackgroundColor(Color.rgb(255, 91, 63));
            summ4.setBackgroundColor(Color.rgb(255, 0, 17));
            fall1.setBackgroundColor(Color.rgb(180, 255, 0));
            fall2.setBackgroundColor(Color.rgb(206, 243, 72));
            fall3.setBackgroundColor(Color.rgb(191, 220, 27));
            fall4.setBackgroundColor(Color.rgb(208, 239, 0));
            wint1.setBackgroundColor(Color.rgb(115, 251, 255));
            wint2.setBackgroundColor(Color.rgb(0, 100, 200));
            wint3.setBackgroundColor(Color.rgb(68, 191, 255));
            wint4.setBackgroundColor(Color.rgb(0, 89, 255));
            common.season = 42;
        } else {
            wint2.setBackgroundColor(Color.rgb(54, 244, 255));
            common.season = 0;
        }
    }

    public void win3(View v) {
        win3++;
        if (win3 % 2 == 1) {
            supr1.setBackgroundColor(Color.rgb(227, 170, 255));
            supr2.setBackgroundColor(Color.rgb(255, 85, 204));
            supr3.setBackgroundColor(Color.rgb(255, 76, 142));
            supr4.setBackgroundColor(Color.rgb(255, 113, 102));
            summ1.setBackgroundColor(Color.rgb(255, 191, 10));
            summ2.setBackgroundColor(Color.rgb(255, 157, 21));
            summ3.setBackgroundColor(Color.rgb(255, 91, 63));
            summ4.setBackgroundColor(Color.rgb(255, 0, 17));
            fall1.setBackgroundColor(Color.rgb(180, 255, 0));
            fall2.setBackgroundColor(Color.rgb(206, 243, 72));
            fall3.setBackgroundColor(Color.rgb(191, 220, 27));
            fall4.setBackgroundColor(Color.rgb(208, 239, 0));
            wint1.setBackgroundColor(Color.rgb(115, 251, 255));
            wint2.setBackgroundColor(Color.rgb(54, 244, 255));
            wint3.setBackgroundColor(Color.rgb(0, 100, 200));
            wint4.setBackgroundColor(Color.rgb(0, 89, 255));
            common.season = 43;
        } else {
            wint3.setBackgroundColor(Color.rgb(68, 191, 255));
            common.season = 0;
        }
    }

    public void win4(View v) {
        win4++;
        if (win4 % 2 == 1) {
            supr1.setBackgroundColor(Color.rgb(227, 170, 255));
            supr2.setBackgroundColor(Color.rgb(255, 85, 204));
            supr3.setBackgroundColor(Color.rgb(255, 76, 142));
            supr4.setBackgroundColor(Color.rgb(255, 113, 102));
            summ1.setBackgroundColor(Color.rgb(255, 191, 10));
            summ2.setBackgroundColor(Color.rgb(255, 157, 21));
            summ3.setBackgroundColor(Color.rgb(255, 91, 63));
            summ4.setBackgroundColor(Color.rgb(255, 0, 17));
            fall1.setBackgroundColor(Color.rgb(180, 255, 0));
            fall2.setBackgroundColor(Color.rgb(206, 243, 72));
            fall3.setBackgroundColor(Color.rgb(191, 220, 27));
            fall4.setBackgroundColor(Color.rgb(208, 239, 0));
            wint1.setBackgroundColor(Color.rgb(115, 251, 255));
            wint2.setBackgroundColor(Color.rgb(54, 244, 255));
            wint3.setBackgroundColor(Color.rgb(68, 191, 255));
            wint4.setBackgroundColor(Color.rgb(0, 100, 200));
            common.season = 44;
        } else {
            wint4.setBackgroundColor(Color.rgb(0, 89, 255));
            common.season = 0;
        }
    }


}
