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
import com.mhh.mysamsung.phones.galaxy_a.Ph_a33;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a53;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a73;
import com.mhh.mysamsung.phones.galaxy_f.Ph_f13;
import com.mhh.mysamsung.phones.galaxy_f.Ph_f23;
import com.mhh.mysamsung.phones.galaxy_m.Ph_m33;
import com.mhh.mysamsung.phones.galaxy_m.Ph_m53;
import com.mhh.mysamsung.phones.galaxy_s.Ph_s21fe;
import com.mhh.mysamsung.phones.galaxy_s.Ph_s22;
import com.mhh.mysamsung.phones.galaxy_s.Ph_s22plus;
import com.mhh.mysamsung.phones.galaxy_s.Ph_s22ultra;
import com.mhh.mysamsung.phones.galaxy_tab.Ph_tab_s8;
import com.mhh.mysamsung.phones.galaxy_tab.Ph_tab_s8plus;
import com.mhh.mysamsung.phones.galaxy_tab.Ph_tab_s8ultra;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zflip4;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zfold4;
import com.mhh.mysamsung.views.Phones_activity;
import com.mhh.mysamsung.views.Search_activity;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import de.hdodenhof.circleimageview.CircleImageView;

public class Year_2022 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year2022);

        //Gradient
        NestedScrollView nestedScrollView = findViewById(R.id.year2022);
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
        final ViewGroup r = findViewById(R.id.year2022);
        final TextView t0 = findViewById(R.id.tv1);
        final LinearLayout t1 = findViewById(R.id.ll1);
        final LinearLayout t2 = findViewById(R.id.ll2);
        final LinearLayout t3 = findViewById(R.id.ll3);
        final LinearLayout t4 = findViewById(R.id.ll4);
        final LinearLayout t5 = findViewById(R.id.ll5);
        final LinearLayout t6 = findViewById(R.id.ll6);
        final LinearLayout t7 = findViewById(R.id.ll7);
        final LinearLayout t8 = findViewById(R.id.ll8);
        final LinearLayout t9 = findViewById(R.id.ll9);
        final LinearLayout t10 = findViewById(R.id.ll10);
        final LinearLayout t11 = findViewById(R.id.ll11);
        final LinearLayout t12 = findViewById(R.id.ll12);
        final LinearLayout t13 = findViewById(R.id.ll13);
        final LinearLayout t14 = findViewById(R.id.ll14);
        final LinearLayout t15 = findViewById(R.id.ll15);
        final LinearLayout t16 = findViewById(R.id.ll16);

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
                t10.setVisibility(View.VISIBLE);
                t11.setVisibility(View.VISIBLE);
                t12.setVisibility(View.VISIBLE);
                t13.setVisibility(View.VISIBLE);
                t14.setVisibility(View.VISIBLE);
                t15.setVisibility(View.VISIBLE);
                t16.setVisibility(View.VISIBLE);
            }
        },200);

        //button onclick
        @SuppressLint("CutPasteId") TextView tx1 = (TextView) findViewById(R.id.tv1);
        tx1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2022.this , Search_activity.class));
            }
        });

        //Image links

        CircleImageView circleImageView = (CircleImageView) findViewById(R.id.fciv1);
        Picasso.get().load("https://s6.uupload.ir/files/galaxy-z-fold4-share-image_ljha.jpg").placeholder(R.drawable.phone).into(circleImageView);

        CircleImageView circleImageView2 = (CircleImageView) findViewById(R.id.fciv2);
        Picasso.get().load("https://s6.uupload.ir/files/042f6098-82f6-439e-8d61-176a99ddcaff_qb74.jpg").placeholder(R.drawable.phone).into(circleImageView2);

        CircleImageView circleImageView3 = (CircleImageView) findViewById(R.id.fciv3);
        Picasso.get().load("https://s6.uupload.ir/files/182753_2020_nio9.jpg").placeholder(R.drawable.phone).into(circleImageView3);

        CircleImageView circleImageView4 = (CircleImageView) findViewById(R.id.fciv4);
        Picasso.get().load("https://s6.uupload.ir/files/182332_2020_7zu6.jpg").placeholder(R.drawable.phone).into(circleImageView4);

        CircleImageView circleImageView5 = (CircleImageView) findViewById(R.id.fciv5);
        Picasso.get().load("https://s6.uupload.ir/files/4182117_5uiw.jpg").placeholder(R.drawable.phone).into(circleImageView5);

        CircleImageView circleImageView6 = (CircleImageView) findViewById(R.id.fciv6);
        Picasso.get().load("https://s6.uupload.ir/files/csm_untitled_2_7_432bb95979(1)_0m0d.jpg").placeholder(R.drawable.phone).into(circleImageView6);

        CircleImageView circleImageView7 = (CircleImageView) findViewById(R.id.fciv7);
        Picasso.get().load("https://s6.uupload.ir/files/s22_5w1i.jpg").placeholder(R.drawable.phone).into(circleImageView7);

        CircleImageView circleImageView8 = (CircleImageView) findViewById(R.id.fciv8);
        Picasso.get().load("https://s6.uupload.ir/files/311440-469190-medium_dcmu.jpg").placeholder(R.drawable.phone).into(circleImageView8);

        CircleImageView circleImageView9 = (CircleImageView) findViewById(R.id.fciv9);
        Picasso.get().load("https://s6.uupload.ir/files/celular-smartphone-samsung-galaxy-s21fe-tela-6-128gb-e-5g_660422_1_9r36.jpg").placeholder(R.drawable.phone).into(circleImageView9);

        CircleImageView circleImageView10 = (CircleImageView) findViewById(R.id.fciv10);
        Picasso.get().load("https://s6.uupload.ir/files/840_560_23ls.jpg").placeholder(R.drawable.phone).into(circleImageView10);

        CircleImageView circleImageView11 = (CircleImageView) findViewById(R.id.fciv11);
        Picasso.get().load("https://s6.uupload.ir/files/619293036__0wt2.jpg").placeholder(R.drawable.phone).into(circleImageView11);

        CircleImageView circleImageView12 = (CircleImageView) findViewById(R.id.fciv12);
        Picasso.get().load("https://s6.uupload.ir/files/samsung-galaxy-f23-aqua-green_y27t.jpg").placeholder(R.drawable.phone).into(circleImageView12);

        CircleImageView circleImageView13 = (CircleImageView) findViewById(R.id.fciv13);
        Picasso.get().load("https://s6.uupload.ir/files/samsung-galaxy-f13-1_sk5q.jpg").placeholder(R.drawable.phone).into(circleImageView13);

        CircleImageView circleImageView14 = (CircleImageView) findViewById(R.id.fciv14);
        Picasso.get().load("https://s6.uupload.ir/files/tab_s8_ultra_-_brothers_(3)-800x800(1)_shd5.jpg").placeholder(R.drawable.phone).into(circleImageView14);

        CircleImageView circleImageView15 = (CircleImageView) findViewById(R.id.fciv15);
        Picasso.get().load("https://s6.uupload.ir/files/tab_s8+_brothers_(3)-800x800_rau6.jpg").placeholder(R.drawable.phone).into(circleImageView15);

        CircleImageView circleImageView16 = (CircleImageView) findViewById(R.id.fciv16);
        Picasso.get().load("https://s6.uupload.ir/files/92068379032934_6iho.jpg").placeholder(R.drawable.phone).into(circleImageView16);

        //button onclick
        @SuppressLint("CutPasteId") LinearLayout civ1 = (LinearLayout) findViewById(R.id.ll1);
        civ1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2022.this , Ph_zfold4.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ2 = (LinearLayout) findViewById(R.id.ll2);
        civ2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2022.this , Ph_zflip4.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ3 = (LinearLayout) findViewById(R.id.ll3);
        civ3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2022.this , Ph_a73.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ4 = (LinearLayout) findViewById(R.id.ll4);
        civ4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2022.this , Ph_a53.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ5 = (LinearLayout) findViewById(R.id.ll5);
        civ5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2022.this , Ph_a33.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ6 = (LinearLayout) findViewById(R.id.ll6);
        civ6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2022.this , Ph_s22ultra.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ7 = (LinearLayout) findViewById(R.id.ll7);
        civ7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2022.this , Ph_s22plus.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ8 = (LinearLayout) findViewById(R.id.ll8);
        civ8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2022.this , Ph_s22.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ9 = (LinearLayout) findViewById(R.id.ll9);
        civ9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2022.this , Ph_s21fe.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ10 = (LinearLayout) findViewById(R.id.ll10);
        civ10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2022.this , Ph_m53.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ11 = (LinearLayout) findViewById(R.id.ll11);
        civ11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2022.this , Ph_m33.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ12 = (LinearLayout) findViewById(R.id.ll12);
        civ12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2022.this , Ph_f23.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ13 = (LinearLayout) findViewById(R.id.ll13);
        civ13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2022.this , Ph_f13.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ14 = (LinearLayout) findViewById(R.id.ll14);
        civ14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2022.this , Ph_tab_s8ultra.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ15 = (LinearLayout) findViewById(R.id.ll15);
        civ15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2022.this , Ph_tab_s8plus.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ16 = (LinearLayout) findViewById(R.id.ll16);
        civ16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2022.this , Ph_tab_s8.class));
            }
        });

    }
}