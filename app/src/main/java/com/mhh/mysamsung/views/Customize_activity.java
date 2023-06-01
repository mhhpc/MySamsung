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
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.mhh.mysamsung.R;
import com.mhh.mysamsung.app.DownloadImageTask;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a73;
import com.mhh.mysamsung.series.Serie_a;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Fade;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

public class Customize_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize);

        //Gradient -----------
        NestedScrollView nestedScrollView = findViewById(R.id.customize);
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
        final ViewGroup r = findViewById(R.id.customize);
        final TextView t1 = findViewById(R.id.tv1);
        final LinearLayout t2 = findViewById(R.id.ll1);
        final LinearLayout t3 = findViewById(R.id.ll2);
        final LinearLayout t4 = findViewById(R.id.ll3);

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
            }
        },200);

        //onclock
        @SuppressLint("CutPasteId") CardView crd1 = (CardView) findViewById(R.id.cv1);
        crd1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Customize_activity.this , Customize_phone_activity.class));
            }
        });

        //Image links
        ImageView ImageView = (ImageView) findViewById(R.id.iv1);
        Picasso.get().load("https://s6.uupload.ir/files/original-eeb1737899376345315b264b25fbd995_i3.jpg").into(ImageView);

        ImageView ImageView2 = (ImageView) findViewById(R.id.iv2);
        Picasso.get().load("https://s6.uupload.ir/files/f85e3828a42112b58c2ebc1ddc57aece_8qn9.jpg").into(ImageView2);

        ImageView ImageView3 = (ImageView) findViewById(R.id.iv3);
        Picasso.get().load("https://s6.uupload.ir/files/original-b501a5f12e64ccfd7343d6de10fb17e7_5lsx.jpg").into(ImageView3);

        ImageView ImageView4 = (ImageView) findViewById(R.id.iv4);
        Picasso.get().load("https://s6.uupload.ir/files/samsung-galaxy-note-8-second-hand_91kj.jpg").into(ImageView4);

    }
}