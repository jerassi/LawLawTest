package com.example.lawlawtest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class aea_Agreement extends AppCompatActivity {

//    TextView tvNext;
    ImageView ivAllUnCheck, ivUseUnCheck, ivPrivacyUnCheck;
    static boolean allFlag, useFlag, privacyFlag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aea_agreement);

        overridePendingTransition(R.anim.rightin_activity, R.anim.not_move_activity);

        ivAllUnCheck = (ImageView) findViewById(R.id.allUnCheck);
        ivUseUnCheck = (ImageView) findViewById(R.id.useUnCheck);
        ivPrivacyUnCheck = (ImageView) findViewById(R.id.privacyUnCheck);

        ivAllUnCheck.setOnClickListener(mListener);
        ivUseUnCheck.setOnClickListener(mListener);
        ivPrivacyUnCheck.setOnClickListener(mListener);

        allFlag = false;
        useFlag = false;
        privacyFlag = false;

    }
//
    Button.OnClickListener mListener = new Button.OnClickListener() {

        @Override
        public void onClick(View v) {

            switch (v.getId()) {

                case R.id.allUnCheck :
                    if(!allFlag){
                        allFlag = true;
                        ivAllUnCheck.setImageResource(R.drawable.ic_checkbox_checked_blue);
                    }else{
                        allFlag = false;
                        ivAllUnCheck.setImageResource(R.drawable.ic_checkbox_unchecked_light);
                    }
                    break;

                case R.id.useUnCheck :
                    if(!useFlag){
                        useFlag = true;
                        ivUseUnCheck.setImageResource(R.drawable.ic_checkbox_checked_blue);
                    }else{
                        useFlag = false;
                        ivUseUnCheck.setImageResource(R.drawable.ic_checkbox_unchecked_light);
                    }
                    break;
                case R.id.privacyUnCheck :
                    if(!privacyFlag){
                        privacyFlag = true;
                        ivPrivacyUnCheck.setImageResource(R.drawable.ic_checkbox_checked_blue);
                    }else{
                        privacyFlag = false;
                        ivPrivacyUnCheck.setImageResource(R.drawable.ic_checkbox_unchecked_light);
                    }
                    break;
//                case R.id.skip :
//                    startActivity(new Intent(aba_Intro1.this, aca_Intro2.class));
//                    break;


            }
        }
    };
}

