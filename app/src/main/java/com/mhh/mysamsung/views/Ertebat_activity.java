package com.mhh.mysamsung.views;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
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
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

public class Ertebat_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ertebat);

        NestedScrollView nestedScrollView = findViewById(R.id.ertebat);
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
        final ViewGroup r = findViewById(R.id.ertebat);
        final Button t1 = findViewById(R.id.b1);
        final Button t2 = findViewById(R.id.b2);
        final Button t3 = findViewById(R.id.b3);
        final Button t4 = findViewById(R.id.b4);
        final Button t5 = findViewById(R.id.b5);
        final Button t6 = findViewById(R.id.b6);
        final Button t7 = findViewById(R.id.b7);

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
            }
        },200);


        @SuppressLint("CutPasteId") Button b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","hamidimhhossein@email.com", null));
                startActivity(Intent.createChooser(intent, "یک گزینه را انتخاب کنید :"));
            }
        });


        @SuppressLint("CutPasteId") Button b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("http://myapk.blogfa.com/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") Button b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent telegram = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/mhhpc"));
                    telegram.setPackage("org.telegram.messenger");
                    startActivity(telegram);
                }catch (Exception e)
                {
                    Toast.makeText(Ertebat_activity.this, "تلگرام روی گوشی شما نصب نیست!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        @SuppressLint("CutPasteId") Button b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent instagram = new Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/mhhpc"));
                    instagram.setPackage("com.instagram.android");
                    startActivity(instagram);
                }catch (Exception e)
                {
                    Toast.makeText(Ertebat_activity.this, "اینستاگرام روی گوشی شما نصب نیست!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        @SuppressLint("CutPasteId") Button b5 = (Button) findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent eitaa = new Intent(Intent.ACTION_VIEW, Uri.parse("https://eitaa.com/mhhpcs"));
                    eitaa.setPackage("ir.eitaa.messenger");
                    startActivity(eitaa);
                }catch (Exception e)
                {
                    Toast.makeText(Ertebat_activity.this, "ایتا روی گوشی شما نصب نیست!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        @SuppressLint("CutPasteId") Button b6 = (Button) findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.aparat.com/mhhpc"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") Button b7 = (Button) findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://cafebazaar.ir/developer/781503171866"));
                startActivity(intentRate);
            }
        });

    }
}