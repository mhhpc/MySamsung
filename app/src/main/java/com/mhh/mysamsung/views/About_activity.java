package com.mhh.mysamsung.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.mhh.mysamsung.R;
import com.mhh.mysamsung.year.Year_2022;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

public class About_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ConstraintLayout constraintLayout = findViewById(R.id.about);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //Animation ------------
        final ViewGroup r = findViewById(R.id.about);
        final LottieAnimationView t0 = findViewById(R.id.lottie);
        final ImageView t1 = findViewById(R.id.logo);
        final TextView t2 = findViewById(R.id.tx1);
        final TextView t3 = findViewById(R.id.tx2);
        final Button t4 = findViewById(R.id.bt1);
        final Button t5 = findViewById(R.id.bt2);
        final Button t6 = findViewById(R.id.bt3);
        final TextView t7 = findViewById(R.id.tx3);
        final TextView t8 = findViewById(R.id.tx4);
        final TextView t9 = findViewById(R.id.tx5);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Transition transition = new Slide();
                transition.setDuration(1200);
                TransitionManager.beginDelayedTransition(r,transition);
                t0.setVisibility(View.VISIBLE);
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t6.setVisibility(View.VISIBLE);
                t7.setVisibility(View.VISIBLE);
                t8.setVisibility(View.VISIBLE);
                t9.setVisibility(View.VISIBLE);
            }
        },200);

        //button onclick

        @SuppressLint("CutPasteId") Button b1 = (Button) findViewById(R.id.bt1);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(About_activity.this , Ertebat_activity.class));
            }
        });

        @SuppressLint("CutPasteId") Button b2 = (Button) findViewById(R.id.bt2);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://cafebazaar.ir/developer/781503171866"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") Button b3 = (Button) findViewById(R.id.bt3);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentSend = new Intent();
                intentSend.setAction(Intent.ACTION_SEND);
                intentSend.putExtra(Intent.EXTRA_TEXT, "سلام \n به راحتی میتونی اپلیکیشن سامسونگ من رو از لینک زیر دانلود کنی ;) \n https://cafebazaar.ir/developer/781503171866");
                intentSend.setType("text/plain");

                Intent share = Intent.createChooser(intentSend, null);
                startActivity(share);
            }
        });

    }
}