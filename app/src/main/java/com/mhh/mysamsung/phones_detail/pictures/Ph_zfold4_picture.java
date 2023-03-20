package com.mhh.mysamsung.phones_detail.pictures;

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

import io.github.florent37.shapeofview.shapes.RoundRectView;

public class Ph_zfold4_picture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ph_zfold4_picture);

        //Gradient -----------
        ConstraintLayout constraintLayout = findViewById(R.id.ph_zfold4_picture);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //Animation ------------
        final ViewGroup r = findViewById(R.id.ph_zfold4_picture);
        final RelativeLayout t1 = findViewById(R.id.view);
        final TextView t2 = findViewById(R.id.titleView1);
        final TextView t3 = findViewById(R.id.titleView2);
        final RoundRectView t4 = findViewById(R.id.imv1);
        final RoundRectView t5 = findViewById(R.id.imv2);
        final RoundRectView t6 = findViewById(R.id.imv3);
        final RoundRectView t7 = findViewById(R.id.imv4);
        final RoundRectView t8 = findViewById(R.id.imv5);
        final TextView t9 = findViewById(R.id.more);
        final LinearLayout t10 = findViewById(R.id.ll1);
        final LinearLayout t11 = findViewById(R.id.ll2);



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

        // Onclick
        @SuppressLint("CutPasteId") CardView b1 = (CardView) findViewById(R.id.ncv1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DomainName("https://www.zoomit.ir/product/samsung-galaxy-z-fold-4/photos/");
            }
        });
        @SuppressLint("CutPasteId") CardView b2 = (CardView) findViewById(R.id.ncv2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DomainName("https://www.gsmarena.com/samsung_galaxy_z_fold4-pictures-11737.php");
            }
        });

        //Image links
        ImageView imageView = (ImageView) findViewById(R.id.iv1);
        new DownloadImageTask(imageView).execute("https://s2.uupload.ir/files/e108-smartphone-wechsel-dich-wie-oft-kaufen-nutzer-ein-neues-handy_zgzr.jpg");

        ImageView imageView2 = (ImageView) findViewById(R.id.iv2);
        new DownloadImageTask(imageView2).execute("https://s6.uupload.ir/files/galaxy-z-fold4-share-image_ljha.jpg");

        ImageView imageView3 = (ImageView) findViewById(R.id.im1);
        new DownloadImageTask(imageView3).execute("https://s2.uupload.ir/files/galaxy-z-fold4_highlights_kv_x23r.jpg");

        ImageView imageView4 = (ImageView) findViewById(R.id.im2);
        new DownloadImageTask(imageView4).execute("https://s2.uupload.ir/files/samsung-galaxy-z-fold4-5g-1(1)_ej4x.jpg");

        ImageView imageView5 = (ImageView) findViewById(R.id.im3);
        new DownloadImageTask(imageView5).execute("https://s2.uupload.ir/files/samsung-galaxy-z-fold4-5g-2_j146_5161.jpg");

        ImageView imageView6 = (ImageView) findViewById(R.id.im4);
        new DownloadImageTask(imageView6).execute("https://s2.uupload.ir/files/samsung-galaxy-z-fold4-5g-4_muht.jpg");

        ImageView imageView7 = (ImageView) findViewById(R.id.im5);
        new DownloadImageTask(imageView7).execute("https://s2.uupload.ir/files/samsung-galaxy-z-fold4-5g-3_rwc.jpg");

        ImageView ImageView8 = (ImageView) findViewById(R.id.image1);
        new DownloadImageTask(ImageView8).execute("https://s2.uupload.ir/files/2019-7-0a8eee1d-c70b-4033-95c8-ea1b2615aa64-638baac6506e38df57e9cb02_gqp9.jpg");

        ImageView ImageView9 = (ImageView) findViewById(R.id.image2);
        new DownloadImageTask(ImageView9).execute("https://s2.uupload.ir/files/gsmarena-com-logo-vector_b5sw.jpg");

    }

    private void DomainName(String s) {

        Intent intent = new Intent(Ph_zfold4_picture.this, Webview_activity.class);
        intent.putExtra("domin",s);
        startActivity(intent);

    }
}