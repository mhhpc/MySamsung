package com.mhh.mysamsung.views;

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

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.mhh.mysamsung.R;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

public class Compare_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare);

        //Gradient -----------
        NestedScrollView nestedScrollView = findViewById(R.id.compare);
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
        final ViewGroup r = findViewById(R.id.compare);
        final TextView t1 = findViewById(R.id.tv1);
        final LinearLayout t3= findViewById(R.id.ll1);
        final LinearLayout t4 = findViewById(R.id.ll2);
        final LinearLayout t5 = findViewById(R.id.ll3);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Transition transition = new Slide();
                transition.setDuration(1200);
                TransitionManager.beginDelayedTransition(r, transition);
                t1.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
            }
        }, 200);

        //onclick
        @SuppressLint("CutPasteId") CardView ph1 = (CardView) findViewById(R.id.cv1);
        ph1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_activity.this , Compare_phone_activity.class));
            }
        });

        //image_link
        ImageView ImageView = (ImageView) findViewById(R.id.iv1);
        Picasso.get().load("https://s2.uupload.ir/files/e8f9c0a830e73ba0caf375611fabd1fe_cx1d.jpg").into(ImageView);

        ImageView ImageView2 = (ImageView) findViewById(R.id.iv2);
        Picasso.get().load("https://s2.uupload.ir/files/2022-one-ui-17-1-own-your-privacy-for-peace-of-mind-mo_vkep.jpg").into(ImageView2);

        ImageView ImageView3 = (ImageView) findViewById(R.id.iv3);
        Picasso.get().load("https://s2.uupload.ir/files/hero-image.fill.size_1248x702.v1619019535_clhr.jpg").into(ImageView3);

    }
}