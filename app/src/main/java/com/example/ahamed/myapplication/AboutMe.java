package com.example.ahamed.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ahamed on 15/07/2017.
 */

public class AboutMe extends AppCompatActivity {
    final static String msgKey = "key.com.example.ahamed.myapplication.msgKey";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String message = intent.getStringExtra(msgKey);
      //  cc (message);
       // TextView txt = (TextView)findViewById(R.id.displayName);
        //txt.setText('s');
       // setContentView(txt);
        setContentView(R.layout.aboutme_lo);
    }

    public void cc ( String message){
        TextView txt = (TextView)findViewById(R.id.displayName);
        txt.setText(message);
    }



}
