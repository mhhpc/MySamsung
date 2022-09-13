package com.mhh.mysamsung.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.mhh.mysamsung.R;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;
import com.transitionseverywhere.extra.Scale;

public class Splash_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Gradient ------------
        ConstraintLayout constraintLayout = findViewById(R.id.splash);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(300);
        animationDrawable.setExitFadeDuration(500);
        animationDrawable.start();

        //Animation ------------
        final ViewGroup r = findViewById(R.id.splash);
        final ImageView t1 = findViewById(R.id.imageView);
        final TextView t2 = findViewById(R.id.textView);
        final TextView t3 = findViewById(R.id.textView2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Transition transition = new Scale();
                transition.setDuration(1200);
                TransitionManager.beginDelayedTransition(r,transition);
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
            }
        },200);

        //Go to Home activity -----------
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash_activity.this, Home_activity.class));
                finish();
            }
        },2500);
    }
}