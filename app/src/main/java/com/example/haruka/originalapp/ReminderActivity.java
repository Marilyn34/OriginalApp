package com.example.haruka.originalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Haruka on 15/06/22.
 */
public class ReminderActivity extends ActionBarActivity {
    private Common common;
    TextView comment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);

        common=(Common)getApplication();

        comment=(TextView)findViewById(R.id.textView37);

        if(common.day==1){
            comment.setText("週の始まり。張り切っていこう！");
        }else if(common.day==2){
            comment.setText("幹部練があるよ！着替えを持ってね。くら環あるからスカート禁止。");
        }else if(common.day==3){
            comment.setText("1限だ！泣 でもはよ帰れるし頑張ろう…");
        }else if(common.day==4){
            comment.setText("母体練もあって長丁場。着替えを持って糖分補給もせねば `・ω・´!!");
        }else if(common.day==5){
            comment.setText("１！限！か！つ！バ！イ！ト！だ！よ！ 気合だーーー！");
        }
    }

    public void click(View v) {
        Intent i = new Intent(this, DrumrollActivity.class);
        startActivity(i);
    }

}
