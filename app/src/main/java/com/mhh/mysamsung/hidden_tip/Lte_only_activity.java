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
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Fade;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import io.github.florent37.shapeofview.shapes.RoundRectView;

public class Lte_only_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lte_only);

        //Gradient -----------
        NestedScrollView nestedScrollView = findViewById(R.id.lte_only);
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
        final ViewGroup r = findViewById(R.id.lte_only);
        final TextView t1 = findViewById(R.id.tv1);
        final TextView t2 = findViewById(R.id.tv2);
        final TextView t3 = findViewById(R.id.tv3);
        final TextView t4 = findViewById(R.id.tv4);
        final TextView t5 = findViewById(R.id.tv5);
        final TextView t6 = findViewById(R.id.tv6);
        final TextView t7 = findViewById(R.id.tv7);
        final TextView t8 = findViewById(R.id.tv8);
        final TextView t9 = findViewById(R.id.tv9);
        final RoundRectView t10 = findViewById(R.id.imv1);
        final Button t11 = findViewById(R.id.bt1);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Transition transition = new Fade();
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

            }
        },200);

        //OnClick --------------------------------
        @SuppressLint("CutPasteId") Button bt1 = (Button) findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    try {
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName("com.android.phone", "com.android.phone.settings.RadioInfo"));
                        startActivity(intent);
                    } catch (Exception e) {
                        Intent intent2 = new Intent();
                        intent2.setComponent(new ComponentName("com.android.settings", "com.android.settings.RadioInfo"));
                        startActivity(intent2);
                    }
                } catch (Exception e) {
                    Toast.makeText(Lte_only_activity.this, "گوشی شما از این قابلیت پشتیبانی نمی\u200Cکند", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Image links
        ImageView ImageView = (ImageView) findViewById(R.id.iv1);
        Picasso.get().load("https://s8.uupload.ir/files/screenshot_20230605_183712_phone_services(2)_qqmp.jpg").placeholder(R.drawable.loading).into(ImageView);

    }
}