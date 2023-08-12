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

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.mhh.mysamsung.R;
import com.mhh.mysamsung.hidden_tip.Fake_call_activity;
import com.mhh.mysamsung.hidden_tip.Lte_only_activity;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

public class Hidden_tips_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hidden_tips);

        //Gradient -----------
        NestedScrollView nestedScrollView = findViewById(R.id.hidden_tips);
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
        final ViewGroup r = findViewById(R.id.hidden_tips);
        final LinearLayout t1 = findViewById(R.id.ll1);
        final LinearLayout t2 = findViewById(R.id.ll2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Transition transition = new Slide();
                transition.setDuration(1200);
                TransitionManager.beginDelayedTransition(r,transition);
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
            }
        },200);

        //Image links
        ImageView imageView1 = (ImageView) findViewById(R.id.iv1);
        Picasso.get().load("https://s8.uupload.ir/files/5g-4g-phone-altered_eoe3.jpg").into(imageView1);

        ImageView imageView2 = (ImageView) findViewById(R.id.iv2);
        Picasso.get().load("https://s8.uupload.ir/files/screenshot_20230608_183451_call(1)_9hik.jpg").into(imageView2);

        ImageView imageView3 = (ImageView) findViewById(R.id.iv3);
        Picasso.get().load("https://s8.uupload.ir/files/samsung-test-hardware_pymj.jpg").into(imageView3);

        //onclock
        @SuppressLint("CutPasteId") CardView crd1 = (CardView) findViewById(R.id.cv1);
        crd1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Hidden_tips_activity.this , Lte_only_activity.class));
            }
        });

        @SuppressLint("CutPasteId") CardView crd2 = (CardView) findViewById(R.id.cv2);
        crd2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Hidden_tips_activity.this , Fake_call_activity.class));
            }
        });

        @SuppressLint("CutPasteId") CardView crd3 = (CardView) findViewById(R.id.cv3);
        crd3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Hidden_tips_activity.this , Device_info_activity.class));
            }
        });

    }
}