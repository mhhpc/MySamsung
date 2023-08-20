package com.mhh.mysamsung.goodlock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.mhh.mysamsung.R;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

public class Goodlock_guide_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goodlock_guide);

        //Gradient -----------
        NestedScrollView nestedScrollView = findViewById(R.id.goodlock_guide);
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
        final ViewGroup r = findViewById(R.id.goodlock_guide);
        final TextView t1 = findViewById(R.id.tv1);
        final TextView t2 = findViewById(R.id.tv2);
        final TextView t3 = findViewById(R.id.tv3);
        final TextView t4 = findViewById(R.id.tv4);
        final ImageView t5 = findViewById(R.id.imv1);
        final ImageView t6 = findViewById(R.id.imv2);


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
            }
        },200);

        //Image links
        ImageView ImageView = (ImageView) findViewById(R.id.imv1);
        Picasso.get().load("https://s6.uupload.ir/files/image_c0mz.jpg").placeholder(R.drawable.progress_animation).error(R.drawable.error).into(ImageView);

        ImageView ImageView2 = (ImageView) findViewById(R.id.imv2);
        Picasso.get().load("https://s6.uupload.ir/files/samsung_one_6_release_date,_one_ui_eligible_list_(1)_8vep.jpg").placeholder(R.drawable.progress_animation).error(R.drawable.error).into(ImageView2);

    }
}