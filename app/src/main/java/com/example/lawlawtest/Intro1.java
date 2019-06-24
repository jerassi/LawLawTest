package com.example.lawlawtest;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class Intro1 extends AppCompatActivity {

    TextView tvNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro1);

        overridePendingTransition(R.anim.rightin_activity, R.anim.not_move_activity);


        tvNext = (TextView) findViewById(R.id.next);
        tvNext.setOnClickListener(mListener);

    }

    Button.OnClickListener mListener = new Button.OnClickListener() {

        @Override
        public void onClick(View v) {

            switch (v.getId()) {

                case R.id.next :
                    startActivity(new Intent(Intro1.this, Intro2.class));
                    break;

                case R.id.skip :
                    startActivity(new Intent(Intro1.this, Intro2.class));
                    break;


            }
        }
    };
}
