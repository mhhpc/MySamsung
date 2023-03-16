package com.mhh.mysamsung.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.mhh.mysamsung.R;
import com.mhh.mysamsung.app.DownloadImageTask;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zfold4;
import com.mhh.mysamsung.year.Year_2021;
import com.mhh.mysamsung.year.Year_2022;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

public class Year_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year);

        //Gradient -----------
        ConstraintLayout constraintLayout = findViewById(R.id.year);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //Animation ------------
        final ViewGroup r = findViewById(R.id.year);
        final LinearLayout t1 = findViewById(R.id.ll1);
        final LinearLayout t2 = findViewById(R.id.ll2);
        final LinearLayout t3 = findViewById(R.id.ll3);
        final CardView tc = findViewById(R.id.cv);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Transition transition = new Slide();
                transition.setDuration(1200);
                TransitionManager.beginDelayedTransition(r,transition);
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                tc.setVisibility(View.VISIBLE);
            }
        },200);

        ImageView ImageView = (ImageView) findViewById(R.id.iv1);
        new DownloadImageTask(ImageView).execute("https://s2.uupload.ir/files/2023_3im.jpg");

        ImageView ImageView2 = (ImageView) findViewById(R.id.iv2);
        new DownloadImageTask(ImageView2).execute("https://s2.uupload.ir/files/golden-2022-happy-new-year-card-with-swirl-lines_1017-34605_wekf.jpg");

        ImageView ImageView3 = (ImageView) findViewById(R.id.iv3);
        new DownloadImageTask(ImageView3).execute("https://s2.uupload.ir/files/golden-numbers-2021-happy-new-year_134830-708_syf.jpg");

        //button onclick


    }
}