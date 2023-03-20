package com.mhh.mysamsung.phones.galaxy_z;

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
import com.mhh.mysamsung.app.DownloadImageTask;
import com.mhh.mysamsung.phones_detail.check.Ph_zfold4_check;
import com.mhh.mysamsung.phones_detail.customize.Ph_zfold4_customize;
import com.mhh.mysamsung.phones_detail.full.galaxy_z.Ph_zfold4_full;
import com.mhh.mysamsung.phones_detail.pictures.Ph_zfold4_picture;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import de.hdodenhof.circleimageview.CircleImageView;

public class Ph_zfold4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ph_zfold4);

        //Gradient -----------
        ConstraintLayout constraintLayout = findViewById(R.id.ph_zfold4);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //Animation ------------
        final ViewGroup r = findViewById(R.id.ph_zfold4);
        final CircleImageView t1 = findViewById(R.id.civ1);
        final TextView t2 = findViewById(R.id.name);
        final CardView t3 = findViewById(R.id.cv1);
        final CardView t4 = findViewById(R.id.cv2);
        final CardView t5 = findViewById(R.id.cv3);
        final CardView t6 = findViewById(R.id.cv4);
        final Button t7 = findViewById(R.id.b1);
        final Button t8 = findViewById(R.id.b2);
        final Button t9 = findViewById(R.id.b3);
        final Button t10 = findViewById(R.id.b4);
        final Button t11 = findViewById(R.id.b5);
        final CardView rcv = findViewById(R.id.cv5);

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
                rcv.setVisibility(View.VISIBLE);
            }
        },200);

        //Image links
        CircleImageView circleImageView = (CircleImageView) findViewById(R.id.civ1);
        new DownloadImageTask(circleImageView).execute("https://s6.uupload.ir/files/galaxy-z-fold4-share-image_ljha.jpg");

        //button onclick
        @SuppressLint("CutPasteId") Button ph1 = (Button) findViewById(R.id.b1);
        ph1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Ph_zfold4.this , Ph_zfold4_full.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph2 = (Button) findViewById(R.id.b2);
        ph2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Ph_zfold4.this , Ph_zfold4_check.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph3 = (Button) findViewById(R.id.b3);
        ph3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Ph_zfold4.this , Ph_zfold4_picture.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph4 = (Button) findViewById(R.id.b4);
        ph4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Ph_zfold4.this , Ph_zfold4_customize.class));
            }
        });

    }
}