package com.mhh.mysamsung.phones_detail.customize.galaxy_s;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.mhh.mysamsung.R;
import com.mhh.mysamsung.guide.Guide_background;
import com.mhh.mysamsung.views.Webview_activity;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Fade;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

public class Ph_s21fe_customize extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ph_s21fe_customize);

        //Gradient -----------
        ConstraintLayout constraintLayout = findViewById(R.id.ph_s21fe_customize);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //Animation ------------
        final ViewGroup r = findViewById(R.id.ph_s21fe_customize);
        final RelativeLayout t1 = findViewById(R.id.view);
        final TextView t2 = findViewById(R.id.titleView1);
        final TextView t3 = findViewById(R.id.titleView2);
        final TextView t4 = findViewById(R.id.ct1);
        final LinearLayout t7 = findViewById(R.id.ll1);
        final Button t8 = findViewById(R.id.bt1);
        final Button t9 = findViewById(R.id.bt2);
        final TextView t10 = findViewById(R.id.ct2);
        final LinearLayout t11 = findViewById(R.id.ll2);
        final Button t12 = findViewById(R.id.bt3);


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
                t7.setVisibility(View.VISIBLE);
                t8.setVisibility(View.VISIBLE);
                t9.setVisibility(View.VISIBLE);
                t10.setVisibility(View.VISIBLE);
                t11.setVisibility(View.VISIBLE);
                t12.setVisibility(View.VISIBLE);

            }
        },200);

        //button onclick
        @SuppressLint("CutPasteId") Button b1 = (Button) findViewById(R.id.bt1);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Ph_s21fe_customize.this , Guide_background.class));
            }
        });

        @SuppressLint("CutPasteId") CardView b2 = (CardView) findViewById(R.id.cv1);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://drive.google.com/drive/folders/16kOEw2mMgW7XwfMJd7l8W6w3ACl-hjIj"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") Button b4 = (Button) findViewById(R.id.bt2);
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.android.app.dressroom";
                    String mClass = ".presentation.settings.WallpaperSettingActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    Toast.makeText(Ph_s21fe_customize.this, "گوشی شما از این قابلیت پشتیبانی نمی\u200Cکند. لطفا مطابق راهنما عمل کنید.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        @SuppressLint("CutPasteId") Button b5 = (Button) findViewById(R.id.bt3);
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.android.settings";
                    String mClass = ".SoundSettings";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    Toast.makeText(Ph_s21fe_customize.this, "گوشی شما از این قابلیت پشتیبانی نمی\u200Cکند. لطفا از تنظیمات گوشی تغییر دهید.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        @SuppressLint("CutPasteId") CardView b6 = (CardView) findViewById(R.id.cv3);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DomainName("https://uupload.ir/view/over-the-horizon-2022_q529.mp3/");
            }
        });


        //Image links
        ImageView imageView = (ImageView) findViewById(R.id.iv1);
        Picasso.get().load("https://s2.uupload.ir/files/l-intro-1659397313_auna.jpg").into(imageView);

        ImageView imageView2 = (ImageView) findViewById(R.id.iv2);
        Picasso.get().load("https://s6.uupload.ir/files/celular-smartphone-samsung-galaxy-s21fe-tela-6-128gb-e-5g_660422_1_9r36.jpg").into(imageView2);

        ImageView imageView3 = (ImageView) findViewById(R.id.image1);
        Picasso.get().load("https://s2.uupload.ir/files/samsung-galaxy-z-fold-4-wallpapers-featured_seo4.jpg").into(imageView3);

        ImageView imageView5 = (ImageView) findViewById(R.id.image2);
        Picasso.get().load("https://s2.uupload.ir/files/samsung-music-hero_w09t.jpg").into(imageView5);




    }
    private void DomainName(String s) {

        Intent intent = new Intent(Ph_s21fe_customize.this, Webview_activity.class);
        intent.putExtra("domin",s);
        startActivity(intent);

    }
}