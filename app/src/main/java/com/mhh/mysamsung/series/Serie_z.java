package com.mhh.mysamsung.series;

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
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.mhh.mysamsung.R;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a33;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a52s;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a53;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zflip3;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zflip4;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zflip5;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zfold3;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zfold4;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zfold5;
import com.mhh.mysamsung.views.Tips_a_activity;
import com.mhh.mysamsung.views.Tips_z_activity;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import de.hdodenhof.circleimageview.CircleImageView;

public class Serie_z extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serie_z);

        //Gradient -----------
        NestedScrollView nestedScrollView = findViewById(R.id.serie_z);
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
        final ViewGroup r = findViewById(R.id.serie_z);
        final CircleImageView t1 = findViewById(R.id.civ1);
        final TextView t2 = findViewById(R.id.tv1);
        final CircleImageView t3 = findViewById(R.id.civ2);
        final TextView t4 = findViewById(R.id.tv2);
        final CircleImageView t5 = findViewById(R.id.civ3);
        final TextView t6 = findViewById(R.id.tv3);
        final LinearLayout t7 = findViewById(R.id.ll1);
        final LinearLayout t8 = findViewById(R.id.ll2);
        final LinearLayout t9 = findViewById(R.id.ll3);
        final CardView tcv = findViewById(R.id.cv1);

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
                tcv.setVisibility(View.VISIBLE);
            }
        },200);

        //Image links
        CircleImageView circleImageView = (CircleImageView) findViewById(R.id.civ1);
        Picasso.get().load("https://s6.uupload.ir/files/sm-f946bzkdafa-2_4cvq.jpg").placeholder(R.drawable.phone).into(circleImageView);

        CircleImageView circleImageView2 = (CircleImageView) findViewById(R.id.civ2);
        Picasso.get().load("https://s6.uupload.ir/files/sm-f731blgaafa-2_fbap.jpg").placeholder(R.drawable.phone).into(circleImageView2);

        CircleImageView circleImageView3 = (CircleImageView) findViewById(R.id.civ3);
        Picasso.get().load("https://s6.uupload.ir/files/galaxy-z-fold4-share-image_ljha.jpg").placeholder(R.drawable.phone).into(circleImageView3);

        CircleImageView circleImageView4 = (CircleImageView) findViewById(R.id.fciv1);
        Picasso.get().load("https://s6.uupload.ir/files/042f6098-82f6-439e-8d61-176a99ddcaff_qb74.jpg").placeholder(R.drawable.phone).into(circleImageView4);

        CircleImageView circleImageView5 = (CircleImageView) findViewById(R.id.fciv2);
        Picasso.get().load("https://s6.uupload.ir/files/samsung-galaxy-z-fold-3-s-pen_38vd.jpg").placeholder(R.drawable.phone).into(circleImageView5);

        CircleImageView circleImageView6 = (CircleImageView) findViewById(R.id.fciv3);
        Picasso.get().load("https://s6.uupload.ir/files/zflip3_carousel_foldunfoldcombo_phantomblack_mo_tugg.jpg").placeholder(R.drawable.phone).into(circleImageView6);

        //onclick suggest
        @SuppressLint("CutPasteId") TextView sg = (TextView) findViewById(R.id.tx10);
        sg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Serie_z.this , Tips_z_activity.class));
            }
        });

        //text onclick =========================================

        @SuppressLint("CutPasteId") TextView txt1 = (TextView) findViewById(R.id.tv1);
        txt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Serie_z.this , Ph_zfold5.class));
            }
        });

        @SuppressLint("CutPasteId") TextView txt2 = (TextView) findViewById(R.id.tv2);
        txt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Serie_z.this , Ph_zflip5.class));
            }
        });

        @SuppressLint("CutPasteId") TextView txt3 = (TextView) findViewById(R.id.tv3);
        txt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Serie_z.this , Ph_zfold4.class));
            }
        });


        //CIV onclick =======================================

        @SuppressLint("CutPasteId") CircleImageView btn1 = (CircleImageView) findViewById(R.id.civ1);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Serie_z.this , Ph_zfold5.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView btn2 = (CircleImageView) findViewById(R.id.civ2);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Serie_z.this , Ph_zflip5.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView btn3 = (CircleImageView) findViewById(R.id.civ3);
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Serie_z.this , Ph_zfold4.class));
            }
        });


        //Button onclick =======================================

        @SuppressLint("CutPasteId") LinearLayout b1 = (LinearLayout) findViewById(R.id.ll1);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Serie_z.this , Ph_zflip4.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b2 = (LinearLayout) findViewById(R.id.ll2);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Serie_z.this , Ph_zfold3.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b3 = (LinearLayout) findViewById(R.id.ll3);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Serie_z.this , Ph_zflip3.class));
            }
        });

    }
}