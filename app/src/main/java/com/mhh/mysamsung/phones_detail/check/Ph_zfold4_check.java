package com.mhh.mysamsung.phones_detail.check;

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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mhh.mysamsung.R;
import com.mhh.mysamsung.app.DownloadImageTask;
import com.mhh.mysamsung.views.Webview_activity;
import com.transitionseverywhere.Fade;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

public class Ph_zfold4_check extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ph_zfold4_check);

        //Gradient -----------
        ConstraintLayout constraintLayout = findViewById(R.id.ph_zfold4_check);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //Animation ------------
        final ViewGroup r = findViewById(R.id.ph_zfold4_check);
        final RelativeLayout t1 = findViewById(R.id.view);
        final TextView t2 = findViewById(R.id.titleView1);
        final TextView t3 = findViewById(R.id.titleView2);
        final LinearLayout t4 = findViewById(R.id.ll1);
        final LinearLayout t5 = findViewById(R.id.ll2);
        final LinearLayout t6 = findViewById(R.id.ll3);


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
            }
        },200);

        // Onclick
        @SuppressLint("CutPasteId") CardView b1 = (CardView) findViewById(R.id.ncv1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DomainName("https://www.samsung.com/iran/smartphones/galaxy-z-fold4/");
            }
        });
        @SuppressLint("CutPasteId") CardView b2 = (CardView) findViewById(R.id.ncv2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DomainName("https://www.zoomit.ir/mobile-review/385710-samsung-galaxy-z-fold-4-review/");
            }
        });
        @SuppressLint("CutPasteId") CardView b3 = (CardView) findViewById(R.id.ncv3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DomainName("https://www.gsmarena.com/samsung_galaxy_z_fold4-review-2468.php");
            }
        });

        //Image links
        ImageView imageView = (ImageView) findViewById(R.id.iv1);
        new DownloadImageTask(imageView).execute("https://s2.uupload.ir/files/1_veyt.jpg");

        ImageView imageView2 = (ImageView) findViewById(R.id.iv2);
        new DownloadImageTask(imageView2).execute("https://s6.uupload.ir/files/galaxy-z-fold4-share-image_ljha.jpg");

        ImageView ImageView3 = (ImageView) findViewById(R.id.image1);
        new DownloadImageTask(ImageView3).execute("https://s2.uupload.ir/files/360_197_1_kb1.jpg");

        ImageView ImageView4 = (ImageView) findViewById(R.id.image2);
        new DownloadImageTask(ImageView4).execute("https://s2.uupload.ir/files/2019-7-0a8eee1d-c70b-4033-95c8-ea1b2615aa64-638baac6506e38df57e9cb02_gqp9.jpg");

        ImageView ImageView5 = (ImageView) findViewById(R.id.image3);
        new DownloadImageTask(ImageView5).execute("https://s2.uupload.ir/files/gsmarena-com-logo-vector_b5sw.jpg");

    }
    private void DomainName(String s) {

        Intent intent = new Intent(Ph_zfold4_check.this, Webview_activity.class);
        intent.putExtra("domin",s);
        startActivity(intent);

    }

}