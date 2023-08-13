package com.mhh.mysamsung.hidden_tip;

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
import com.mhh.mysamsung.views.Home_activity;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Fade;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import io.github.florent37.shapeofview.shapes.RoundRectView;
import io.github.muddz.styleabletoast.StyleableToast;

public class Fake_call_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_call);

        //Gradient -----------
        NestedScrollView nestedScrollView = findViewById(R.id.fake_call);
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
        final ViewGroup r = findViewById(R.id.fake_call);
        final TextView t1 = findViewById(R.id.tv1);
        final TextView t2 = findViewById(R.id.tv2);
        final TextView t3 = findViewById(R.id.tv3);
        final TextView t4 = findViewById(R.id.tv4);
        final TextView t5 = findViewById(R.id.tv5);
        final TextView t6 = findViewById(R.id.tv6);
        final TextView t7 = findViewById(R.id.tv7);
        final TextView t8 = findViewById(R.id.tv8);
        final TextView t9 = findViewById(R.id.tv9);
        final TextView t10 = findViewById(R.id.tv10);
        final TextView t11 = findViewById(R.id.tv11);
        final TextView t12 = findViewById(R.id.tv12);
        final TextView t13 = findViewById(R.id.tv13);
        final TextView t14 = findViewById(R.id.tv14);
        final TextView t15 = findViewById(R.id.tv15);
        final TextView t16 = findViewById(R.id.tv16);
        final ImageView t17 = findViewById(R.id.imv1);
        final ImageView t18 = findViewById(R.id.imv2);
        final ImageView t20 = findViewById(R.id.imv3);
        final Button t19 = findViewById(R.id.bt1);



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


            }
        },200);
        //OnClick --------------------------------
        @SuppressLint("CutPasteId") Button bt1 = (Button) findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName("com.samsung.android.incallui", "com.android.incallui.labs.LabsActivity"));
                    startActivity(intent);
                } catch (Exception e) {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.phone_support), Toast.LENGTH_LONG, R.style.support_toast).show();
                }
            }
        });

        //Image links
        ImageView ImageView = (ImageView) findViewById(R.id.imv1);
        Picasso.get().load("https://s8.uupload.ir/files/screenshot_20230605_173111_call(1)_eyjd.jpg").placeholder(R.drawable.progress_animation).error(R.drawable.error).into(ImageView);

        ImageView ImageView2 = (ImageView) findViewById(R.id.imv2);
        Picasso.get().load("https://s8.uupload.ir/files/screenshot_20230605_173115_call(1)(1)_s46m.jpg").placeholder(R.drawable.progress_animation).error(R.drawable.error).into(ImageView2);

        ImageView ImageView3 = (ImageView) findViewById(R.id.imv3);
        Picasso.get().load("https://s8.uupload.ir/files/screenshot_20230608_183451_call(1)_9hik.jpg").placeholder(R.drawable.progress_animation).error(R.drawable.error).into(ImageView3);
    }
}