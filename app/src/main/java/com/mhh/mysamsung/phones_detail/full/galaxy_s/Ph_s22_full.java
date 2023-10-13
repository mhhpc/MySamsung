package com.mhh.mysamsung.phones_detail.full.galaxy_s;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mhh.mysamsung.R;
import com.mhh.mysamsung.views.Webview_activity;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Fade;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

public class Ph_s22_full extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ph_s22_full);

        //Gradient -----------
        ConstraintLayout constraintLayout = findViewById(R.id.ph_s22_full);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //Animation ------------
        final ViewGroup r = findViewById(R.id.ph_s22_full);
        final RelativeLayout t1 = findViewById(R.id.view);
        final TextView t2 = findViewById(R.id.titleView1);
        final TextView t3 = findViewById(R.id.titleView2);
        final CardView t4 = findViewById(R.id.cv1);
        final CardView t5 = findViewById(R.id.cv2);
        final CardView t6 = findViewById(R.id.cv3);
        final CardView t7 = findViewById(R.id.cv4);
        final CardView t8 = findViewById(R.id.cv5);
        final CardView t9 = findViewById(R.id.cv6);
        final CardView t10 = findViewById(R.id.cv7);
        final CardView t11 = findViewById(R.id.cv8);
        final CardView t12 = findViewById(R.id.cv9);
        final CardView t13 = findViewById(R.id.cv10);
        final CardView t14 = findViewById(R.id.cv11);
        final CardView t15 = findViewById(R.id.cv12);
        final LinearLayout t16 = findViewById(R.id.ll1);
        final LinearLayout t17 = findViewById(R.id.ll2);
        final LinearLayout t18 = findViewById(R.id.ll3);
        final TextView t19 = findViewById(R.id.more);


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
                t12.setVisibility(View.VISIBLE);
                t13.setVisibility(View.VISIBLE);
                t14.setVisibility(View.VISIBLE);
                t15.setVisibility(View.VISIBLE);
                t16.setVisibility(View.VISIBLE);
                t17.setVisibility(View.VISIBLE);
                t18.setVisibility(View.VISIBLE);
                t19.setVisibility(View.VISIBLE);
            }
        },200);

        // Onclick
        @SuppressLint("CutPasteId") CardView b1 = (CardView) findViewById(R.id.ncv1);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.samsung.com/iran/smartphones/galaxy-s22/specs/"));
                startActivity(intentRate);
            }
        });
        @SuppressLint("CutPasteId") CardView b2 = (CardView) findViewById(R.id.ncv2);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.zoomit.ir/product/samsung-galaxy-s22/"));
                startActivity(intentRate);
            }
        });
        @SuppressLint("CutPasteId") CardView b3 = (CardView) findViewById(R.id.ncv3);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.gsmarena.com/samsung_galaxy_s22_5g-11253.php"));
                startActivity(intentRate);
            }
        });

        //Image links
        ImageView imageView = (ImageView) findViewById(R.id.iv1);
        Picasso.get().load("https://s6.uupload.ir/files/infralist-com-sc1gjcninik-unsplash(1)_nuh4.jpg").into(imageView);

        ImageView imageView2 = (ImageView) findViewById(R.id.iv2);
        Picasso.get().load("https://s6.uupload.ir/files/311440-469190-medium_dcmu.jpg").into(imageView2);

        ImageView ImageView3 = (ImageView) findViewById(R.id.image1);
        Picasso.get().load("https://s2.uupload.ir/files/360_197_1_kb1.jpg").into(ImageView3);

        ImageView ImageView4 = (ImageView) findViewById(R.id.image2);
        Picasso.get().load("https://s2.uupload.ir/files/2019-7-0a8eee1d-c70b-4033-95c8-ea1b2615aa64-638baac6506e38df57e9cb02_gqp9.jpg").into(ImageView4);

        ImageView ImageView5 = (ImageView) findViewById(R.id.image3);
        Picasso.get().load("https://s2.uupload.ir/files/gsmarena-com-logo-vector_b5sw.jpg").into(ImageView5);

    }
}