package com.mhh.mysamsung.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.mhh.mysamsung.R;
import com.mhh.mysamsung.year.Year_2018;
import com.mhh.mysamsung.year.Year_2020;
import com.mhh.mysamsung.year.Year_2021;
import com.mhh.mysamsung.year.Year_2022;
import com.mhh.mysamsung.year.Year_2023;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import io.github.muddz.styleabletoast.StyleableToast;

public class Year_activity extends AppCompatActivity {

    CardView cardView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year);

        //Gradient
        NestedScrollView nestedScrollView = findViewById(R.id.year);
        AnimationDrawable animationDrawable = (AnimationDrawable) nestedScrollView.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsing_toolbar);
        AnimationDrawable animationDrawable2 = (AnimationDrawable) collapsingToolbarLayout.getBackground();
        animationDrawable2.setEnterFadeDuration(2000);
        animationDrawable2.setExitFadeDuration(4000);
        animationDrawable2.start();

        //Animation ------------
        final ViewGroup r = findViewById(R.id.year);
        final LinearLayout t1 = findViewById(R.id.ll1);
        final LinearLayout t2 = findViewById(R.id.ll2);
        final LinearLayout t3 = findViewById(R.id.ll3);
        final LinearLayout t4 = findViewById(R.id.ll4);
        final LinearLayout t5 = findViewById(R.id.ll5);
        final CardView tc = findViewById(R.id.cv);

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
                tc.setVisibility(View.VISIBLE);
            }
        },200);

        ImageView ImageView = (ImageView) findViewById(R.id.iv1);
        Picasso.get().load("https://s2.uupload.ir/files/2023_3im.jpg").into(ImageView);

        ImageView ImageView2 = (ImageView) findViewById(R.id.iv2);
        Picasso.get().load("https://s2.uupload.ir/files/golden-2022-happy-new-year-card-with-swirl-lines_1017-34605_wekf.jpg").into(ImageView2);

        ImageView ImageView3 = (ImageView) findViewById(R.id.iv3);
        Picasso.get().load("https://s2.uupload.ir/files/golden-numbers-2021-happy-new-year_134830-708_syf.jpg").into(ImageView3);

        ImageView ImageView4 = (ImageView) findViewById(R.id.iv4);
        Picasso.get().load("https://s6.uupload.ir/files/5513449_ri4o.jpg").into(ImageView4);

        ImageView ImageView5 = (ImageView) findViewById(R.id.iv5);
        Picasso.get().load("https://s6.uupload.ir/files/new-year-2018_8gul.jpg").into(ImageView5);

        //Toast ------------
        cardView1 = findViewById(R.id.cv1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StyleableToast.makeText(getApplicationContext(), getString(R.string.coming_soon), Toast.LENGTH_LONG, R.style.soon_toast).show();
            }
        });

        //onclick suggest
        @SuppressLint("CutPasteId") TextView sg = (TextView) findViewById(R.id.tx2);
        sg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_activity.this , Tips_software_activity.class));
            }
        });

        //onclick
        @SuppressLint("CutPasteId") CardView crd2 = (CardView) findViewById(R.id.cv2);
        crd2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_activity.this , Year_2022.class));
            }
        });

        @SuppressLint("CutPasteId") CardView crd3 = (CardView) findViewById(R.id.cv3);
        crd3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_activity.this , Year_2021.class));
            }
        });

        @SuppressLint("CutPasteId") CardView crd4 = (CardView) findViewById(R.id.cv4);
        crd4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_activity.this , Year_2020.class));
            }
        });

        @SuppressLint("CutPasteId") CardView crd5 = (CardView) findViewById(R.id.cv5);
        crd5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_activity.this , Year_2018.class));
            }
        });


    }
}