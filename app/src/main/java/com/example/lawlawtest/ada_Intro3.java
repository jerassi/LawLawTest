package com.example.lawlawtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ada_Intro3 extends AppCompatActivity {

    TextView tvBefore;
    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ada_intro3);

        overridePendingTransition(R.anim.rightin_activity, R.anim.not_move_activity);


        tvBefore = (TextView) findViewById(R.id.before);
        btnStart = (Button) findViewById(R.id.btn_start);


        tvBefore.setOnClickListener(mListener);
        btnStart.setOnClickListener(mListener);


    }

    Button.OnClickListener mListener = new Button.OnClickListener() {

        @Override
        public void onClick(View v) {

            switch (v.getId()) {

                case R.id.before :
                    finish();
                    break;

                case R.id.btn_start :
                    startActivity(new Intent(ada_Intro3.this, aea_Agreement.class));
                    break;


            }
        }
    };
}
