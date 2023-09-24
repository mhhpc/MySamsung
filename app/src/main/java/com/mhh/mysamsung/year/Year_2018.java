package com.mhh.mysamsung.year;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.mhh.mysamsung.R;
import com.mhh.mysamsung.phones.galaxy_j.Ph_j4;
import com.mhh.mysamsung.phones.galaxy_j.Ph_j6;
import com.mhh.mysamsung.phones.galaxy_j.Ph_j8;
import com.mhh.mysamsung.phones.galaxy_note.Ph_note20;
import com.mhh.mysamsung.phones.galaxy_note.Ph_note20_5g;
import com.mhh.mysamsung.phones.galaxy_note.Ph_note20ultra;
import com.mhh.mysamsung.views.Search_activity;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import de.hdodenhof.circleimageview.CircleImageView;

public class Year_2018 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year2018);

        //Gradient
        NestedScrollView nestedScrollView = findViewById(R.id.year2018);
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
        final ViewGroup r = findViewById(R.id.year2018);
        final TextView t0 = findViewById(R.id.tv1);
        final LinearLayout t1 = findViewById(R.id.ll1);
        final LinearLayout t2 = findViewById(R.id.ll2);
        final LinearLayout t3 = findViewById(R.id.ll3);

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
            }
        },200);

        //Image links

        CircleImageView circleImageView = (CircleImageView) findViewById(R.id.fciv1);
        Picasso.get().load("https://s6.uupload.ir/files/گوشی-samsung-galaxy-j8-سامسونگ_zsof.jpg").placeholder(R.drawable.phone).into(circleImageView);

        CircleImageView circleImageView2 = (CircleImageView) findViewById(R.id.fciv2);
        Picasso.get().load("https://s6.uupload.ir/files/گوشی-موبایل-سامسونگ-مدل-galaxy-j6-دو-سیم-کارت-ظرفیت-32-گیگابایت_hfqq.jpg").placeholder(R.drawable.phone).into(circleImageView2);

        CircleImageView circleImageView3 = (CircleImageView) findViewById(R.id.fciv3);
        Picasso.get().load("https://s6.uupload.ir/files/samsung-galaxy-j4_0h1f.jpg").placeholder(R.drawable.phone).into(circleImageView3);

        //button onclick
        @SuppressLint("CutPasteId") TextView tx1 = (TextView) findViewById(R.id.tv1);
        tx1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2018.this , Search_activity.class));
            }
        });

        //button onclick
        @SuppressLint("CutPasteId") LinearLayout civ1 = (LinearLayout) findViewById(R.id.ll1);
        civ1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2018.this , Ph_j8.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ2 = (LinearLayout) findViewById(R.id.ll2);
        civ2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2018.this , Ph_j6.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ3 = (LinearLayout) findViewById(R.id.ll3);
        civ3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2018.this , Ph_j4.class));
            }
        });

    }
}