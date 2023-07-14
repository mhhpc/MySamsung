package com.mhh.mysamsung.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.mhh.mysamsung.R;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a73;
import com.mhh.mysamsung.phones_detail.customize.Ph_zfold4_customize;
import com.mhh.mysamsung.series.Serie_a;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

public class Customize_phone_activity extends AppCompatActivity {

    CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_list);

        collapsingToolbarLayout = findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle(getResources().getString(R.string.customize_phone_title));

        //Gradient -----------
        NestedScrollView nestedScrollView = findViewById(R.id.phone_list);
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
        final ViewGroup r = findViewById(R.id.phone_list);
        final TextView t0 = findViewById(R.id.tv1);
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
        final Button t15 = findViewById(R.id.ph15);
        final Button t16 = findViewById(R.id.ph16);
        final Button t17 = findViewById(R.id.ph17);
        final Button t18 = findViewById(R.id.ph18);
        final Button t19 = findViewById(R.id.ph19);
        final Button t20 = findViewById(R.id.ph20);
        final Button t21 = findViewById(R.id.ph21);
        final Button t22 = findViewById(R.id.ph22);
        final Button t23 = findViewById(R.id.ph23);
        final Button t24 = findViewById(R.id.ph24);
        final Button t25 = findViewById(R.id.ph25);
        final Button t26 = findViewById(R.id.ph26);
        final Button t27 = findViewById(R.id.ph27);

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
                t17.setVisibility(View.VISIBLE);
                t18.setVisibility(View.VISIBLE);
                t19.setVisibility(View.VISIBLE);
                t20.setVisibility(View.VISIBLE);
                t21.setVisibility(View.VISIBLE);
                t22.setVisibility(View.VISIBLE);
                t23.setVisibility(View.VISIBLE);
                t24.setVisibility(View.VISIBLE);
                t25.setVisibility(View.VISIBLE);
                t26.setVisibility(View.VISIBLE);
                t27.setVisibility(View.VISIBLE);
            }
        },200);

        //onclock
        @SuppressLint("CutPasteId") TextView txt1 = (TextView) findViewById(R.id.tv1);
        txt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Customize_phone_activity.this , Search_activity.class));
            }
        });

        @SuppressLint("CutPasteId") Button bt1 = (Button) findViewById(R.id.ph1);
        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Customize_phone_activity.this , Ph_zfold4_customize.class));
            }
        });

    }
}