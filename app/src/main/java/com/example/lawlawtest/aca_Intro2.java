package com.example.lawlawtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class aca_Intro2 extends AppCompatActivity {
    TextView tvNext, tvSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aca_intro2);

        overridePendingTransition(R.anim.rightin_activity, R.anim.not_move_activity);


        tvNext = (TextView) findViewById(R.id.next);
        tvSkip = (TextView) findViewById(R.id.skip);

        tvNext.setOnClickListener(mListener);
        tvSkip.setOnClickListener(mListener);


    }

    Button.OnClickListener mListener = new Button.OnClickListener() {

        @Override
        public void onClick(View v) {

            switch (v.getId()) {

                case R.id.next :
//                    startActivity(new Intent(aca_Intro2.this, aca_Intro2.class));
                    break;

                case R.id.skip :
                    startActivity(new Intent(aca_Intro2.this, aea_Agreement.class));
                    break;


            }
        }
    };
}
