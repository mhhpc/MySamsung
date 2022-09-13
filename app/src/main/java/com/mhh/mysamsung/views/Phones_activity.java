package com.mhh.mysamsung.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.mhh.mysamsung.R;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a33;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a52s;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a53;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a73;
import com.mhh.mysamsung.phones.galaxy_note.Ph_note20;
import com.mhh.mysamsung.phones.galaxy_note.Ph_note20ultra;
import com.mhh.mysamsung.phones.galaxy_s.Ph_s21fe;
import com.mhh.mysamsung.phones.galaxy_s.Ph_s22;
import com.mhh.mysamsung.phones.galaxy_s.Ph_s22plus;
import com.mhh.mysamsung.phones.galaxy_s.Ph_s22ultra;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zflip3;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zflip4;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zfold3;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zfold4;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

public class Phones_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phones);

        //Gradient -----------
        ConstraintLayout constraintLayout = findViewById(R.id.phones);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //Animation ------------
        final ViewGroup r = findViewById(R.id.phones);
        final Button t1 = findViewById(R.id.ph1);
        final Button t2 = findViewById(R.id.ph2);
        final Button t3 = findViewById(R.id.ph3);
        final Button t4 = findViewById(R.id.ph4);
        final Button t5 = findViewById(R.id.ph5);
        final Button t6 = findViewById(R.id.ph6);
        final Button t7 = findViewById(R.id.ph7);
        final Button t8 = findViewById(R.id.ph8);
        final Button t9 = findViewById(R.id.ph9);
        final Button t10 = findViewById(R.id.ph10);
        final Button t11 = findViewById(R.id.ph11);
        final Button t12 = findViewById(R.id.ph12);
        final Button t13 = findViewById(R.id.ph13);
        final Button t14 = findViewById(R.id.ph14);
        final CardView rcv = findViewById(R.id.cv1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Transition transition = new Slide();
                transition.setDuration(1200);
                TransitionManager.beginDelayedTransition(r,transition);
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t6.setVisibility(View.VISIBLE);
                t7.setVisibility(View.VISIBLE);
                t8.setVisibility(View.VISIBLE);
                t9.setVisibility(View.VISIBLE);
                t10.setVisibility(View.VISIBLE);
                t11.setVisibility(View.VISIBLE);
                t12.setVisibility(View.VISIBLE);
                t13.setVisibility(View.VISIBLE);
                t14.setVisibility(View.VISIBLE);
                rcv.setVisibility(View.VISIBLE);
            }
        },200);

        //button onclick
        @SuppressLint("CutPasteId") Button ph1 = (Button) findViewById(R.id.ph1);
        ph1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_zfold4.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph2 = (Button) findViewById(R.id.ph2);
        ph2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_zflip4.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph3 = (Button) findViewById(R.id.ph3);
        ph3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_a73.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph4 = (Button) findViewById(R.id.ph4);
        ph4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_a53.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph5 = (Button) findViewById(R.id.ph5);
        ph5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_a33.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph6 = (Button) findViewById(R.id.ph6);
        ph6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_s22ultra.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph7 = (Button) findViewById(R.id.ph7);
        ph7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_s22plus.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph8 = (Button) findViewById(R.id.ph8);
        ph8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_s22.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph9 = (Button) findViewById(R.id.ph9);
        ph9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_s21fe.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph10 = (Button) findViewById(R.id.ph10);
        ph10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_a52s.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph11 = (Button) findViewById(R.id.ph11);
        ph11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_note20ultra.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph12 = (Button) findViewById(R.id.ph12);
        ph12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_note20.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph13 = (Button) findViewById(R.id.ph13);
        ph13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_zfold3.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph14 = (Button) findViewById(R.id.ph14);
        ph14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_zflip3.class));
            }
        });
    }
}