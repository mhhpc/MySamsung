package com.mhh.mysamsung.guide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.mhh.mysamsung.R;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import io.github.muddz.styleabletoast.StyleableToast;

public class Guide_background extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide_background);

        //Gradient -----------
        NestedScrollView nestedScrollView = findViewById(R.id.guide_background);
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
        final ViewGroup r = findViewById(R.id.guide_background);
        final TextView t1 = findViewById(R.id.tv1);
        final TextView t2 = findViewById(R.id.tv2);
        final TextView t3 = findViewById(R.id.tv3);
        final TextView t4 = findViewById(R.id.tv4);
        final TextView t5 = findViewById(R.id.tv5);
        final TextView t6 = findViewById(R.id.tv6);
        final ImageView t7 = findViewById(R.id.imv1);
        final ImageView t8 = findViewById(R.id.imv2);
        final ImageView t9 = findViewById(R.id.imv3);

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

            }
        },200);

        //Image links
        ImageView ImageView = (ImageView) findViewById(R.id.imv1);
        Picasso.get().load("https://s6.uupload.ir/files/screenshot_20230917_101821_one_ui_home(1)_bhvf.jpg").placeholder(R.drawable.progress_animation).error(R.drawable.error).into(ImageView);

        ImageView ImageView2 = (ImageView) findViewById(R.id.imv2);
        Picasso.get().load("https://s6.uupload.ir/files/screenshot_20230917_101835_wallpaper_and_style(1)_t3ah.jpg").placeholder(R.drawable.progress_animation).error(R.drawable.error).into(ImageView2);

        ImageView ImageView3 = (ImageView) findViewById(R.id.imv3);
        Picasso.get().load("https://s6.uupload.ir/files/screenshot_20230917_101921_wallpaper_and_style(1)_rky8.jpg").placeholder(R.drawable.progress_animation).error(R.drawable.error).into(ImageView3);


    }
}