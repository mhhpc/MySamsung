package com.mhh.mysamsung.phones_detail.customize;

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
import com.mhh.mysamsung.app.DownloadImageTask;
import com.mhh.mysamsung.guide.Guide_background;
import com.mhh.mysamsung.phones_detail.check.Ph_zfold4_check;
import com.mhh.mysamsung.views.About_activity;
import com.mhh.mysamsung.views.Customize_activity;
import com.mhh.mysamsung.views.Customize_phone_activity;
import com.mhh.mysamsung.views.Ertebat_activity;
import com.mhh.mysamsung.views.Webview_activity;
import com.transitionseverywhere.Fade;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import io.github.florent37.shapeofview.shapes.RoundRectView;

public class Ph_zfold4_customize extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ph_zfold4_customize);

        //Gradient -----------
        ConstraintLayout constraintLayout = findViewById(R.id.ph_zfold4_customize);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //Animation ------------
        final ViewGroup r = findViewById(R.id.ph_zfold4_customize);
        final RelativeLayout t1 = findViewById(R.id.view);
        final TextView t2 = findViewById(R.id.titleView1);
        final TextView t3 = findViewById(R.id.titleView2);
        final TextView t4 = findViewById(R.id.ct1);
        final TextView t5 = findViewById(R.id.ctv1);
        final TextView t6 = findViewById(R.id.ctv2);
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

        //button onclick
        @SuppressLint("CutPasteId") Button b1 = (Button) findViewById(R.id.bt1);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Ph_zfold4_customize.this , Guide_background.class));
            }
        });

        @SuppressLint("CutPasteId") CardView b2 = (CardView) findViewById(R.id.cv1);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DomainName("https://drive.google.com/drive/folders/18onUtN17O4N4Goxx45f07oWVEkPiGhe2");
            }
        });

        @SuppressLint("CutPasteId") CardView b3 = (CardView) findViewById(R.id.cv2);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DomainName("https://drive.google.com/drive/folders/1kt8XJNU6Tvn6MLmP5fNaXAKTm_L6ysM9");
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
                    Toast.makeText(Ph_zfold4_customize.this, "گوشی شما از این قابلیت پشتیبانی نمی\u200Cکند. لطفا مطابق راهنما عمل کنید.", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(Ph_zfold4_customize.this, "گوشی شما از این قابلیت پشتیبانی نمی\u200Cکند. لطفا از تنظیمات گوشی تغییر دهید.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        @SuppressLint("CutPasteId") CardView b6 = (CardView) findViewById(R.id.cv3);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DomainName("https://uupload.ir/view/galaxy_32rm.mp3/");
            }
        });


        //Image links
        ImageView imageView = (ImageView) findViewById(R.id.iv1);
        new DownloadImageTask(imageView).execute("https://s2.uupload.ir/files/l-intro-1659397313_auna.jpg");

        ImageView imageView2 = (ImageView) findViewById(R.id.iv2);
        new DownloadImageTask(imageView2).execute("https://s6.uupload.ir/files/galaxy-z-fold4-share-image_ljha.jpg");

        ImageView imageView3 = (ImageView) findViewById(R.id.image1);
        new DownloadImageTask(imageView3).execute("https://s2.uupload.ir/files/samsung-galaxy-z-fold-4-wallpapers-featured_seo4.jpg");

        ImageView imageView4 = (ImageView) findViewById(R.id.image1_1);
        new DownloadImageTask(imageView4).execute("https://s2.uupload.ir/files/samsung-galaxy-z-fold-4-wallpapers-featured_seo4.jpg");

        ImageView imageView5 = (ImageView) findViewById(R.id.image2);
        new DownloadImageTask(imageView5).execute("https://s2.uupload.ir/files/samsung-music-hero_w09t.jpg");




    }
    private void DomainName(String s) {

        Intent intent = new Intent(Ph_zfold4_customize.this, Webview_activity.class);
        intent.putExtra("domin",s);
        startActivity(intent);

    }

}