package com.mhh.mysamsung.phones_detail.pictures.galaxy_z;

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

public class Ph_zflip3_picture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ph_zflip3_picture);

        //Gradient -----------
        ConstraintLayout constraintLayout = findViewById(R.id.ph_zflip3_picture);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //Animation ------------
        final ViewGroup r = findViewById(R.id.ph_zflip3_picture);
        final RelativeLayout t1 = findViewById(R.id.view);
        final TextView t2 = findViewById(R.id.titleView1);
        final TextView t3 = findViewById(R.id.titleView2);
        final ImageView t4 = findViewById(R.id.imv1);
        final ImageView t5 = findViewById(R.id.imv2);
        final ImageView t6 = findViewById(R.id.imv3);
        final ImageView t7 = findViewById(R.id.imv4);
        final ImageView t8 = findViewById(R.id.imv5);
        final TextView t9 = findViewById(R.id.more);
        final LinearLayout t10 = findViewById(R.id.ll1);
        final LinearLayout t11 = findViewById(R.id.ll2);
        final LinearLayout t12 = findViewById(R.id.ll3);



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


            }
        },200);

        // Onclick
        @SuppressLint("CutPasteId") CardView b1 = (CardView) findViewById(R.id.ncv1);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.samsung.com/iran/smartphones/galaxy-z-fold4/showroom/#see-in-360"));
                startActivity(intentRate);
            }
        });
        @SuppressLint("CutPasteId") CardView b2 = (CardView) findViewById(R.id.ncv2);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.gsmarena.com/samsung_galaxy_z_fold4-pictures-11737.php"));
                startActivity(intentRate);
            }
        });
        @SuppressLint("CutPasteId") CardView b3 = (CardView) findViewById(R.id.ncv3);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.zoomit.ir/product/samsung-galaxy-z-fold-4/photos/"));
                startActivity(intentRate);
            }
        });

        //Image links
        ImageView imageView = (ImageView) findViewById(R.id.iv1);
        Picasso.get().load("https://s2.uupload.ir/files/e108-smartphone-wechsel-dich-wie-oft-kaufen-nutzer-ein-neues-handy_zgzr.jpg").into(imageView);

        ImageView imageView2 = (ImageView) findViewById(R.id.iv2);
        Picasso.get().load("https://s6.uupload.ir/files/zflip3_carousel_foldunfoldcombo_phantomblack_mo_tugg.jpg").into(imageView2);

        ImageView imageView3 = (ImageView) findViewById(R.id.imv1);
        Picasso.get().load("https://s8.uupload.ir/files/galaxy-z-flip3-2_6mp1.jpg").placeholder(R.drawable.progress_animation).error(R.drawable.error).into(imageView3);

        ImageView imageView4 = (ImageView) findViewById(R.id.imv2);
        Picasso.get().load("https://s8.uupload.ir/files/galaxy-z-flip3-1_swwr.jpg").placeholder(R.drawable.progress_animation).error(R.drawable.error).into(imageView4);

        ImageView imageView5 = (ImageView) findViewById(R.id.imv3);
        Picasso.get().load("https://s8.uupload.ir/files/5a7105e09ac8bcc837f1839bf3f020d5696b98ce_w9hg.jpg").placeholder(R.drawable.progress_animation).error(R.drawable.error).into(imageView5);

        ImageView imageView6 = (ImageView) findViewById(R.id.imv4);
        Picasso.get().load("https://s8.uupload.ir/files/zflip3_carousel_colorcombokv_mo_qcrl.jpg").placeholder(R.drawable.progress_animation).error(R.drawable.error).into(imageView6);

        ImageView imageView7 = (ImageView) findViewById(R.id.imv5);
        Picasso.get().load("https://s8.uupload.ir/files/samsung-galaxy-z-flip-3-smartphone-491997493-i-1-1200wx1200h_xyvk.jpg").placeholder(R.drawable.progress_animation).error(R.drawable.error).into(imageView7);

        ImageView imageView8 = (ImageView) findViewById(R.id.image1);
        Picasso.get().load("https://s2.uupload.ir/files/360_197_1_kb1.jpg").into(imageView8);

        ImageView imageView9 = (ImageView) findViewById(R.id.image2);
        Picasso.get().load("https://s2.uupload.ir/files/gsmarena-com-logo-vector_b5sw.jpg").into(imageView9);

        ImageView imageView10 = (ImageView) findViewById(R.id.image3);
        Picasso.get().load("https://s2.uupload.ir/files/2019-7-0a8eee1d-c70b-4033-95c8-ea1b2615aa64-638baac6506e38df57e9cb02_gqp9.jpg").into(imageView10);

    }
}