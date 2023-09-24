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
import com.mhh.mysamsung.phones.galaxy_a.Ph_a52s;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a53;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a73;
import com.mhh.mysamsung.phones.galaxy_f.Ph_f42;
import com.mhh.mysamsung.phones.galaxy_m.Ph_m62;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zflip3;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zflip4;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zfold3;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zfold4;
import com.mhh.mysamsung.views.Search_activity;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import de.hdodenhof.circleimageview.CircleImageView;

public class Year_2021 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year2021);

        //Gradient
        NestedScrollView nestedScrollView = findViewById(R.id.year2021);
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
        final ViewGroup r = findViewById(R.id.year2021);
        final TextView t0 = findViewById(R.id.tv1);
        final LinearLayout t1 = findViewById(R.id.ll1);
        final LinearLayout t2 = findViewById(R.id.ll2);
        final LinearLayout t3 = findViewById(R.id.ll3);
        final LinearLayout t4 = findViewById(R.id.ll4);
        final LinearLayout t5 = findViewById(R.id.ll5);

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
            }
        },200);

        //button onclick
        @SuppressLint("CutPasteId") TextView tx1 = (TextView) findViewById(R.id.tv1);
        tx1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2021.this , Search_activity.class));
            }
        });

        //Image links

        CircleImageView circleImageView = (CircleImageView) findViewById(R.id.fciv1);
        Picasso.get().load("https://s6.uupload.ir/files/4_zu_3_samsung_galaxy_a52s_8zjy.jpg").placeholder(R.drawable.phone).into(circleImageView);

        CircleImageView circleImageView2 = (CircleImageView) findViewById(R.id.fciv2);
        Picasso.get().load("https://s6.uupload.ir/files/samsung-galaxy-z-fold-3-s-pen_38vd.jpg").placeholder(R.drawable.phone).into(circleImageView2);

        CircleImageView circleImageView3 = (CircleImageView) findViewById(R.id.fciv3);
        Picasso.get().load("https://s6.uupload.ir/files/zflip3_carousel_foldunfoldcombo_phantomblack_mo_tugg.jpg").placeholder(R.drawable.phone).into(circleImageView3);

        CircleImageView circleImageView4 = (CircleImageView) findViewById(R.id.fciv4);
        Picasso.get().load("https://s6.uupload.ir/files/d619a06ecaea458e8e420bfe9a09096a7b3405dd_1630841890_f6ly.jpg").placeholder(R.drawable.phone).into(circleImageView4);

        CircleImageView circleImageView5 = (CircleImageView) findViewById(R.id.fciv5);
        Picasso.get().load("https://s6.uupload.ir/files/samsunggalaxyf42_0bfy.jpg").placeholder(R.drawable.phone).into(circleImageView5);

        //button onclick
        @SuppressLint("CutPasteId") LinearLayout civ1 = (LinearLayout) findViewById(R.id.ll1);
        civ1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2021.this , Ph_a52s.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ2 = (LinearLayout) findViewById(R.id.ll2);
        civ2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2021.this , Ph_zfold3.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ3 = (LinearLayout) findViewById(R.id.ll3);
        civ3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2021.this , Ph_zflip3.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ4 = (LinearLayout) findViewById(R.id.ll4);
        civ4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2021.this , Ph_m62.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ5 = (LinearLayout) findViewById(R.id.ll5);
        civ5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Year_2021.this , Ph_f42.class));
            }
        });

    }
}