package com.mhh.mysamsung.goodlock;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;

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
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.mhh.mysamsung.R;
import com.mhh.mysamsung.views.Customize_goodlock_activity;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import io.github.muddz.styleabletoast.StyleableToast;

public class Goodlock_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goodlock);

        //Gradient -----------
        NestedScrollView nestedScrollView = findViewById(R.id.goodlock);
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
        final ViewGroup r = findViewById(R.id.goodlock);
        final LinearLayout t0 = findViewById(R.id.ll0);
        final TextView t00 = findViewById(R.id.ct);
        final TextView t02 = findViewById(R.id.ct2);
        final TextView t03 = findViewById(R.id.ct3);
        final LinearLayout t1 = findViewById(R.id.ll1);
        final LinearLayout t2 = findViewById(R.id.ll2);
        final LinearLayout t3 = findViewById(R.id.ll3);
        final LinearLayout t4 = findViewById(R.id.ll4);
        final LinearLayout t5 = findViewById(R.id.ll5);
        final LinearLayout t6 = findViewById(R.id.ll6);
        final LinearLayout t7 = findViewById(R.id.ll7);
        final LinearLayout t8 = findViewById(R.id.ll8);
        final LinearLayout t9 = findViewById(R.id.ll9);
        final LinearLayout t10 = findViewById(R.id.ll10);
        final LinearLayout t11 = findViewById(R.id.ll11);
        final LinearLayout t12 = findViewById(R.id.ll12);
        final LinearLayout t13 = findViewById(R.id.ll13);
        final LinearLayout t14 = findViewById(R.id.ll14);
        final LinearLayout t15 = findViewById(R.id.ll15);
        final LinearLayout t16 = findViewById(R.id.ll16);
        final LinearLayout t17 = findViewById(R.id.ll17);
        final LinearLayout t18 = findViewById(R.id.ll18);
        final LinearLayout t19 = findViewById(R.id.ll19);
        final LinearLayout t20 = findViewById(R.id.ll20);
        final LinearLayout t21 = findViewById(R.id.ll21);
        final LinearLayout t22 = findViewById(R.id.ll22);
        final LinearLayout t23 = findViewById(R.id.ll23);
        final LinearLayout t24 = findViewById(R.id.ll24);
        final LinearLayout t25 = findViewById(R.id.ll25);
        final LinearLayout t26 = findViewById(R.id.ll26);
        final LinearLayout t27 = findViewById(R.id.ll27);
        final LinearLayout t28 = findViewById(R.id.ll28);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Transition transition = new Slide();
                transition.setDuration(1200);
                TransitionManager.beginDelayedTransition(r,transition);
                t0.setVisibility(View.VISIBLE);
                t00.setVisibility(View.VISIBLE);
                t02.setVisibility(View.VISIBLE);
                t03.setVisibility(View.VISIBLE);
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
                t20.setVisibility(View.VISIBLE);
                t21.setVisibility(View.VISIBLE);
                t22.setVisibility(View.VISIBLE);
                t23.setVisibility(View.VISIBLE);
                t24.setVisibility(View.VISIBLE);
                t25.setVisibility(View.VISIBLE);
                t26.setVisibility(View.VISIBLE);
                t27.setVisibility(View.VISIBLE);
                t28.setVisibility(View.VISIBLE);
            }
        },200);

        //Image links
        ImageView imageView0 = (ImageView) findViewById(R.id.image);
        Picasso.get().load("https://s8.uupload.ir/files/64534068e0433_d0zg.png").placeholder(R.drawable.phone).into(imageView0);

        ImageView imageView01 = (ImageView) findViewById(R.id.image1);
        Picasso.get().load("https://s8.uupload.ir/files/samsung-good-lock-1581898262_euti.jpg").into(imageView01);

        ImageView imageView02 = (ImageView) findViewById(R.id.image2);
        Picasso.get().load("https://s8.uupload.ir/files/good-lock-feature_a67.jpg").into(imageView02);

        ImageView imageView = (ImageView) findViewById(R.id.iv1);
        Picasso.get().load("https://s8.uupload.ir/files/640730fda4d57-384x384_rbg4.png").placeholder(R.drawable.phone).into(imageView);

        ImageView imageView2 = (ImageView) findViewById(R.id.iv2);
        Picasso.get().load("https://s8.uupload.ir/files/645365d58d80c-384x384_1hzh.png").placeholder(R.drawable.phone).into(imageView2);

        ImageView imageView3 = (ImageView) findViewById(R.id.iv3);
        Picasso.get().load("https://s8.uupload.ir/files/608d2d18994be-384x384_660o.png").placeholder(R.drawable.phone).into(imageView3);

        ImageView imageView4 = (ImageView) findViewById(R.id.iv4);
        Picasso.get().load("https://s8.uupload.ir/files/6012ae750a497_mb8b.png").placeholder(R.drawable.phone).into(imageView4);

        ImageView imageView5 = (ImageView) findViewById(R.id.iv5);
        Picasso.get().load("https://s8.uupload.ir/files/643ea63e856e9_r033.png").placeholder(R.drawable.phone).into(imageView5);

        ImageView imageView6 = (ImageView) findViewById(R.id.iv6);
        Picasso.get().load("https://s8.uupload.ir/files/643ea679c12ce-384x384_cw1n.png").placeholder(R.drawable.phone).into(imageView6);

        ImageView imageView7 = (ImageView) findViewById(R.id.iv7);
        Picasso.get().load("https://s8.uupload.ir/files/635ad4f21231f-384x384_q76g.png").placeholder(R.drawable.phone).into(imageView7);

        ImageView imageView8 = (ImageView) findViewById(R.id.iv8);
        Picasso.get().load("https://s8.uupload.ir/files/642684ba180f4_o1rw.png").placeholder(R.drawable.phone).into(imageView8);

        ImageView imageView9 = (ImageView) findViewById(R.id.iv9);
        Picasso.get().load("https://s8.uupload.ir/files/63d747e96d5d0_1loz.png").placeholder(R.drawable.phone).into(imageView9);

        ImageView imageView10 = (ImageView) findViewById(R.id.iv10);
        Picasso.get().load("https://s8.uupload.ir/files/645c5470b3527-384x384_eyl8.png").placeholder(R.drawable.phone).into(imageView10);

        ImageView imageView11 = (ImageView) findViewById(R.id.iv11);
        Picasso.get().load("https://s8.uupload.ir/files/6449ec451244f_hrsj.png").placeholder(R.drawable.phone).into(imageView11);

        ImageView imageView12 = (ImageView) findViewById(R.id.iv12);
        Picasso.get().load("https://s8.uupload.ir/files/63f2fe7f1680d_4hqz.png").placeholder(R.drawable.phone).into(imageView12);

        ImageView imageView13 = (ImageView) findViewById(R.id.iv13);
        Picasso.get().load("https://s8.uupload.ir/files/62a19c45e090e_1j3.png").placeholder(R.drawable.phone).into(imageView13);

        ImageView imageView14 = (ImageView) findViewById(R.id.iv14);
        Picasso.get().load("https://s8.uupload.ir/files/64212badef7d7-384x384_j3e.png").placeholder(R.drawable.phone).into(imageView14);

        ImageView imageView15 = (ImageView) findViewById(R.id.iv15);
        Picasso.get().load("https://s8.uupload.ir/files/6355ff30e588e_yq7s.png").placeholder(R.drawable.phone).into(imageView15);

        ImageView imageView16 = (ImageView) findViewById(R.id.iv16);
        Picasso.get().load("https://s8.uupload.ir/files/644bb492ee2ed_0vfc.png").placeholder(R.drawable.phone).into(imageView16);

        ImageView imageView17 = (ImageView) findViewById(R.id.iv17);
        Picasso.get().load("https://s8.uupload.ir/files/63564289d9bbd-384x384_iq33.png").placeholder(R.drawable.phone).into(imageView17);

        ImageView imageView18 = (ImageView) findViewById(R.id.iv18);
        Picasso.get().load("https://s8.uupload.ir/files/64534068e0433_d0zg.png").placeholder(R.drawable.phone).into(imageView18);

        ImageView imageView19 = (ImageView) findViewById(R.id.iv19);
        Picasso.get().load("https://s8.uupload.ir/files/6356f7eca936c_uc3g.png").placeholder(R.drawable.phone).into(imageView19);

        ImageView imageView20 = (ImageView) findViewById(R.id.iv20);
        Picasso.get().load("https://s8.uupload.ir/files/6368dd04933be_uju2.png").placeholder(R.drawable.phone).into(imageView20);

        ImageView imageView21 = (ImageView) findViewById(R.id.iv21);
        Picasso.get().load("https://s8.uupload.ir/files/63c6c6b04da62_6hyr.png").placeholder(R.drawable.phone).into(imageView21);

        ImageView imageView22 = (ImageView) findViewById(R.id.iv22);
        Picasso.get().load("https://s8.uupload.ir/files/63c6c6cba7c10_tqoy.png").placeholder(R.drawable.phone).into(imageView22);

        ImageView imageView23 = (ImageView) findViewById(R.id.iv23);
        Picasso.get().load("https://s8.uupload.ir/files/63c6c60c9dfc7-384x384_ai5x.png").placeholder(R.drawable.phone).into(imageView23);

        ImageView imageView24 = (ImageView) findViewById(R.id.iv24);
        Picasso.get().load("https://s8.uupload.ir/files/63c6c5efe7889_pkta.png").placeholder(R.drawable.phone).into(imageView24);

        ImageView imageView25 = (ImageView) findViewById(R.id.iv25);
        Picasso.get().load("https://s8.uupload.ir/files/63c6c6ed92dbc_wn1r.png").placeholder(R.drawable.phone).into(imageView25);

        ImageView imageView26 = (ImageView) findViewById(R.id.iv26);
        Picasso.get().load("https://s8.uupload.ir/files/64162f5f3c148-384x384_bgs8.png").placeholder(R.drawable.phone).into(imageView26);

        ImageView imageView27 = (ImageView) findViewById(R.id.iv27);
        Picasso.get().load("https://s8.uupload.ir/files/63c6c629db296_bqb.png").placeholder(R.drawable.phone).into(imageView27);

        ImageView imageView28 = (ImageView) findViewById(R.id.iv28);
        Picasso.get().load("https://s8.uupload.ir/files/63c6c629db296_bqb.png").placeholder(R.drawable.phone).into(imageView28);

        //Onclick -- Base

        @SuppressLint("CutPasteId") CardView bu1 = (CardView) findViewById(R.id.cv02);
        bu1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Goodlock_activity.this , Goodlock_guide_activity.class));
            }
        });

        @SuppressLint("CutPasteId") CardView bu2 = (CardView) findViewById(R.id.cv01);
        bu2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Goodlock_activity.this , Customize_goodlock_activity.class));
            }
        });

        @SuppressLint("CutPasteId") CardView b1 = (CardView) findViewById(R.id.cv1);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.systemui.lockstar";
                    String mClass = ".presentation.settings.main.MainActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast1), Toast.LENGTH_LONG, R.style.goodlock_toast).show();
                }
            }
        });

        @SuppressLint("CutPasteId") CardView b2 = (CardView) findViewById(R.id.cv2);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.android.qstuner";
                    String mClass = ".QsTunerActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast2), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b3 = (CardView) findViewById(R.id.cv3);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.android.app.routineplus";
                    String mClass = ".main.RoutinePlusSplashActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast3), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b4 = (CardView) findViewById(R.id.cv4);
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.android.app.clockface";
                    String mClass = ".setting.ClockFaceSetting";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast4), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b5 = (CardView) findViewById(R.id.cv5);
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.android.multistar";
                    String mClass = ".view.MainActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast5), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b6 = (CardView) findViewById(R.id.cv6);
        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.systemui.navillera";
                    String mClass = ".presentation.view.MainSettingActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast6), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b7 = (CardView) findViewById(R.id.cv7);
        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.android.app.captureplugin";
                    String mClass = ".settings.ui.CapturePlugInSettingActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast7), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b8 = (CardView) findViewById(R.id.cv8);
        b8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.android.app.homestar";
                    String mClass = ".SettingActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast8), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b9 = (CardView) findViewById(R.id.cv9);
        b9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.systemui.notilus";
                    String mClass = ".NotiCenterPage";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast9), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b10 = (CardView) findViewById(R.id.cv10);
        b10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.android.app.galaxyregistry";
                    String mClass = ".main.GoodSettingsSplashActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast10), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b11 = (CardView) findViewById(R.id.cv11);
        b11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.android.themedesigner";
                    String mClass = ".SplashActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast11), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b12 = (CardView) findViewById(R.id.cv12);
        b12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.android.app.goodcatch";
                    String mClass = ".main.activity.MainActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast12), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b13 = (CardView) findViewById(R.id.cv13);
        b13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.android.sidegesturepad";
                    String mClass = ".settings.SGPSettingsActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast13), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b14 = (CardView) findViewById(R.id.cv14);
        b14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent intent=new Intent();
                    intent.setComponent(new ComponentName("com.samsung.android.soundassistant", "com.sec.android.soundassistant.activities.MainActivity"));
                    startActivity(intent);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast14), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b15 = (CardView) findViewById(R.id.cv15);
        b15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.android.wonderland.wallpaper";
                    String mClass = ".settings.StartupActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast15), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b16 = (CardView) findViewById(R.id.cv16);
        b16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.android.keyscafe";
                    String mClass = ".main.ui.KeysCafeSplashActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast16), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b17 = (CardView) findViewById(R.id.cv17);
        b17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.android.app.cameraassistant";
                    String mClass = ".MainActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast17), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b18 = (CardView) findViewById(R.id.cv18);
        b18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.android.goodlock";
                    String mClass = ".presentation.view.LaunchActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast18), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b19 = (CardView) findViewById(R.id.cv19);
        b19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.android.app.edgetouch";
                    String mClass = ".ui.activity.MainActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast19), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b20 = (CardView) findViewById(R.id.cv20);
        b20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.android.pentastic";
                    String mClass = ".settings.SettingsActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast20), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b21 = (CardView) findViewById(R.id.cv21);
        b21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.android.samsung.batteryusage";
                    String mClass = ".app.presentation.batteryhistory.BatteryHistoryActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast21), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b22 = (CardView) findViewById(R.id.cv22);
        b22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.android.statsd";
                    String mClass = ".home.HomeActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast22), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b23 = (CardView) findViewById(R.id.cv23);
        b23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.android.appbooster";
                    String mClass = ".app.presentation.home.HomeActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast23), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b24 = (CardView) findViewById(R.id.cv24);
        b24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.android.thermalguardian";
                    String mClass = ".presentation.home.HomeActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast24), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b25 = (CardView) findViewById(R.id.cv25);
        b25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.android.memoryguardian";
                    String mClass = ".presentation.home.HomeActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast25), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b26 = (CardView) findViewById(R.id.cv26);
        b26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.samsung.android.mediaguardian";
                    String mClass = ".presentation.home.HomeActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast26), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b27 = (CardView) findViewById(R.id.cv27);
        b27.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.android.samsung.utilityapp";
                    String mClass = ".app.presentation.home.UtilityHomeActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast27), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        @SuppressLint("CutPasteId") CardView b28 = (CardView) findViewById(R.id.cv28);
        b28.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent res = new Intent();
                    String mPackage = "com.android.samsung.utilityagent";
                    String mClass = ".app.presentation.home.UtilityAgentActivity";
                    res.setComponent(new ComponentName(mPackage,mPackage+mClass));
                    startActivity(res);
                }catch (Exception e)
                {
                    StyleableToast.makeText(getApplicationContext(), getString(R.string.goodlock_toast28), Toast.LENGTH_LONG, R.style.goodlock_toast).show();

                }
            }
        });

        //onclock -- detail
        @SuppressLint("CutPasteId") CardView crd18 = (CardView) findViewById(R.id.cvde18);
        crd18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Goodlock_activity.this , Customize_goodlock_activity.class));
            }
        });

        //onclick -- download galaxystore

        @SuppressLint("CutPasteId") CardView a1 = (CardView) findViewById(R.id.cvd1);
        a1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.systemui.lockstar?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a2 = (CardView) findViewById(R.id.cvd2);
        a2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.android.qstuner?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a3 = (CardView) findViewById(R.id.cvd3);
        a3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.android.app.routineplus?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a4 = (CardView) findViewById(R.id.cvd4);
        a4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.android.app.clockface?session_id=W_5b3118446179dabe887855fcd11b5940"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a5 = (CardView) findViewById(R.id.cvd5);
        a5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.android.multistar?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a6 = (CardView) findViewById(R.id.cvd6);
        a6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.systemui.navillera?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a7 = (CardView) findViewById(R.id.cvd7);
        a7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.android.app.captureplugin?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a8 = (CardView) findViewById(R.id.cvd8);
        a8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.android.app.homestar?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a9 = (CardView) findViewById(R.id.cvd9);
        a9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.systemui.notilus?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a10 = (CardView) findViewById(R.id.cvd10);
        a10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.android.app.galaxyregistry?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a11 = (CardView) findViewById(R.id.cvd11);
        a11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.android.themedesigner?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a12 = (CardView) findViewById(R.id.cvd12);
        a12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.android.app.goodcatch?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a13 = (CardView) findViewById(R.id.cvd13);
        a13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.android.sidegesturepad?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a14 = (CardView) findViewById(R.id.cvd14);
        a14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.android.soundassistant?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a15 = (CardView) findViewById(R.id.cvd15);
        a15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.android.wonderland.wallpaper?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a16 = (CardView) findViewById(R.id.cvd16);
        a16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.android.keyscafe?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a17 = (CardView) findViewById(R.id.cvd17);
        a17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.android.app.cameraassistant?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a18 = (CardView) findViewById(R.id.cvd18);
        a18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.android.goodlock?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a19 = (CardView) findViewById(R.id.cvd19);
        a19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.android.app.edgetouch?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a20 = (CardView) findViewById(R.id.cvd20);
        a20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.android.pentastic?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a21 = (CardView) findViewById(R.id.cvd21);
        a21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.android.samsung.batteryusage?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a22 = (CardView) findViewById(R.id.cvd22);
        a22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.android.statsd?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a23 = (CardView) findViewById(R.id.cvd23);
        a23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.android.appbooster?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a24 = (CardView) findViewById(R.id.cvd24);
        a24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.android.thermalguardian?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a25 = (CardView) findViewById(R.id.cvd25);
        a25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.android.memoryguardian?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a26 = (CardView) findViewById(R.id.cvd26);
        a26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.samsung.android.mediaguardian?langCd=en"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView a27 = (CardView) findViewById(R.id.cvd27);
        a27.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://galaxystore.samsung.com/detail/com.android.samsung.utilityapp"));
                startActivity(intentRate);
            }
        });

        //onclick ------------ download apkmirror

        @SuppressLint("CutPasteId") CardView p1 = (CardView) findViewById(R.id.cva1);
        p1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/lockstar/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p2 = (CardView) findViewById(R.id.cva2);
        p2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/quickstar/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p3 = (CardView) findViewById(R.id.cva3);
        p3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/good-lock-labs/samsung-routine/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p4 = (CardView) findViewById(R.id.cva4);
        p4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/samsung-clockface/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p5 = (CardView) findViewById(R.id.cva5);
        p5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/samsung-multistar/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p6 = (CardView) findViewById(R.id.cva6);
        p6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/samsung-navstar/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p7 = (CardView) findViewById(R.id.cva7);
        p7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/nice-shot/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p8 = (CardView) findViewById(R.id.cva8);
        p8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/home-up/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p9 = (CardView) findViewById(R.id.cva9);
        p9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/notistar/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p10 = (CardView) findViewById(R.id.cva10);
        p10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/good-lock-labs/registar/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p11 = (CardView) findViewById(R.id.cva11);
        p11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/samsung-theme-park/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p12 = (CardView) findViewById(R.id.cva12);
        p12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/nice-catch/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p13 = (CardView) findViewById(R.id.cva13);
        p13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/one-hand-operation/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p14 = (CardView) findViewById(R.id.cva14);
        p14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/soundassistant/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p15 = (CardView) findViewById(R.id.cva15);
        p15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/wonderland/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p16 = (CardView) findViewById(R.id.cva16);
        p16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/good-lock-labs/keys-cafe/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p17 = (CardView) findViewById(R.id.cva17);
        p17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/good-lock-labs/camera-assistant/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p18 = (CardView) findViewById(R.id.cva18);
        p18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/good-lock-2018/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p19 = (CardView) findViewById(R.id.cva19);
        p19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/edge-touch/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p20 = (CardView) findViewById(R.id.cva20);
        p20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/pentastic/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p21 = (CardView) findViewById(R.id.cva21);
        p21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/battery-tracker/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p22 = (CardView) findViewById(R.id.cva22);
        p22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/battery-guardian/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p23 = (CardView) findViewById(R.id.cva23);
        p23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/app-booster/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p24 = (CardView) findViewById(R.id.cva24);
        p24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/samsung-thermal-guardian/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p25 = (CardView) findViewById(R.id.cva25);
        p25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/samsung-memory-guardian/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p26 = (CardView) findViewById(R.id.cva26);
        p26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/media-file-guardian/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p27 = (CardView) findViewById(R.id.cva27);
        p27.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/pentastic/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView p28 = (CardView) findViewById(R.id.cva28);
        p28.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/galaxy-labs/"));
                startActivity(intentRate);
            }
        });

        //onclick ------------ download dailymobile

        @SuppressLint("CutPasteId") CardView d1 = (CardView) findViewById(R.id.cvi1);
        d1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.apkmirror.com/apk/samsung-electronics-co-ltd/galaxy-labs-agent/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView d2 = (CardView) findViewById(R.id.cvi2);
        d2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.dailymobile.ir/54517/samsung-quickstar/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView d4 = (CardView) findViewById(R.id.cvi4);
        d4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.dailymobile.ir/71227/samsung-clockface/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView d5 = (CardView) findViewById(R.id.cvi5);
        d5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.dailymobile.ir/85134/samsung-multistar/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView d6 = (CardView) findViewById(R.id.cvi6);
        d6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.dailymobile.ir/81479/samsung-navstar/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView d8 = (CardView) findViewById(R.id.cvi8);
        d8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.dailymobile.ir/81467/samsung-home-up/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView d10 = (CardView) findViewById(R.id.cvi10);
        d10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.dailymobile.ir/84485/samsung-registar/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView d11 = (CardView) findViewById(R.id.cvi11);
        d11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.dailymobile.ir/56568/samsung-theme-park/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView d12 = (CardView) findViewById(R.id.cvi12);
        d12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.dailymobile.ir/78663/samsung-nice-catch/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView d13 = (CardView) findViewById(R.id.cvi13);
        d13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.dailymobile.ir/56278/samsung-one-hand-operation/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView d14 = (CardView) findViewById(R.id.cvi14);
        d14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.dailymobile.ir/77772/soundassistant/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView d15 = (CardView) findViewById(R.id.cvi15);
        d15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.dailymobile.ir/78672/samsung-wonderland/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView d16 = (CardView) findViewById(R.id.cvi16);
        d16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.dailymobile.ir/77748/keys-cafe-samsung/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView d18 = (CardView) findViewById(R.id.cvi18);
        d18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.dailymobile.ir/71147/samsung-good-lock/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView d20 = (CardView) findViewById(R.id.cvi20);
        d20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.dailymobile.ir/78681/samsung-pentastic/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView d21 = (CardView) findViewById(R.id.cvi21);
        d21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.dailymobile.ir/57172/samsung-galaxy-labs/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView d22 = (CardView) findViewById(R.id.cvi22);
        d22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.dailymobile.ir/57172/samsung-galaxy-labs/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView d23 = (CardView) findViewById(R.id.cvi23);
        d23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.dailymobile.ir/57172/samsung-galaxy-labs/"));
                startActivity(intentRate);
            }
        });

        @SuppressLint("CutPasteId") CardView d27 = (CardView) findViewById(R.id.cvi27);
        d27.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRate = new Intent(Intent.ACTION_VIEW);
                intentRate.setData(Uri.parse("https://www.dailymobile.ir/57172/samsung-galaxy-labs/"));
                startActivity(intentRate);
            }
        });

    }
}