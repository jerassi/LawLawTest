package com.example.lawlawtest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Intro2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro2);

        overridePendingTransition(R.anim.rightin_activity, R.anim.not_move_activity);


    }
}
