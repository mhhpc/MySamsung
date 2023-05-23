package com.mhh.mysamsung.goodlock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.mhh.mysamsung.R;
import com.mhh.mysamsung.app.DownloadImageTask;
import com.mhh.mysamsung.guide.Goodlock_guide_activity;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

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
        new DownloadImageTask(imageView0).execute("https://s8.uupload.ir/files/64534068e0433_d0zg.png");

        ImageView imageView01 = (ImageView) findViewById(R.id.image1);
        new DownloadImageTask(imageView01).execute("https://s8.uupload.ir/files/samsung-good-lock-1581898262_euti.jpg");

        ImageView imageView02 = (ImageView) findViewById(R.id.image2);
        new DownloadImageTask(imageView02).execute("https://s8.uupload.ir/files/good-lock-feature_a67.jpg");

        ImageView imageView = (ImageView) findViewById(R.id.iv1);
        new DownloadImageTask(imageView).execute("https://s8.uupload.ir/files/640730fda4d57-384x384_rbg4.png");

        ImageView imageView2 = (ImageView) findViewById(R.id.iv2);
        new DownloadImageTask(imageView2).execute("https://s8.uupload.ir/files/645365d58d80c-384x384_1hzh.png");

        ImageView imageView3 = (ImageView) findViewById(R.id.iv3);
        new DownloadImageTask(imageView3).execute("https://s8.uupload.ir/files/608d2d18994be-384x384_660o.png");

        ImageView imageView4 = (ImageView) findViewById(R.id.iv4);
        new DownloadImageTask(imageView4).execute("https://s8.uupload.ir/files/6012ae750a497_mb8b.png");

        ImageView imageView5 = (ImageView) findViewById(R.id.iv5);
        new DownloadImageTask(imageView5).execute("https://s8.uupload.ir/files/643ea63e856e9_r033.png");

        ImageView imageView6 = (ImageView) findViewById(R.id.iv6);
        new DownloadImageTask(imageView6).execute("https://s8.uupload.ir/files/643ea679c12ce-384x384_cw1n.png");

        ImageView imageView7 = (ImageView) findViewById(R.id.iv7);
        new DownloadImageTask(imageView7).execute("https://s8.uupload.ir/files/635ad4f21231f-384x384_q76g.png");

        ImageView imageView8 = (ImageView) findViewById(R.id.iv8);
        new DownloadImageTask(imageView8).execute("https://s8.uupload.ir/files/642684ba180f4_o1rw.png");

        ImageView imageView9 = (ImageView) findViewById(R.id.iv9);
        new DownloadImageTask(imageView9).execute("https://s8.uupload.ir/files/63d747e96d5d0_1loz.png");

        ImageView imageView10 = (ImageView) findViewById(R.id.iv10);
        new DownloadImageTask(imageView10).execute("https://s8.uupload.ir/files/645c5470b3527-384x384_eyl8.png");

        ImageView imageView11 = (ImageView) findViewById(R.id.iv11);
        new DownloadImageTask(imageView11).execute("https://s8.uupload.ir/files/6449ec451244f_hrsj.png");

        ImageView imageView12 = (ImageView) findViewById(R.id.iv12);
        new DownloadImageTask(imageView12).execute("https://s8.uupload.ir/files/63f2fe7f1680d_4hqz.png");

        ImageView imageView13 = (ImageView) findViewById(R.id.iv13);
        new DownloadImageTask(imageView13).execute("https://s8.uupload.ir/files/62a19c45e090e_1j3.png");

        ImageView imageView14 = (ImageView) findViewById(R.id.iv14);
        new DownloadImageTask(imageView14).execute("https://s8.uupload.ir/files/64212badef7d7-384x384_j3e.png");

        ImageView imageView15 = (ImageView) findViewById(R.id.iv15);
        new DownloadImageTask(imageView15).execute("https://s8.uupload.ir/files/6355ff30e588e_yq7s.png");

        ImageView imageView16 = (ImageView) findViewById(R.id.iv16);
        new DownloadImageTask(imageView16).execute("https://s8.uupload.ir/files/644bb492ee2ed_0vfc.png");

        ImageView imageView17 = (ImageView) findViewById(R.id.iv17);
        new DownloadImageTask(imageView17).execute("https://s8.uupload.ir/files/63564289d9bbd-384x384_iq33.png");

        ImageView imageView18 = (ImageView) findViewById(R.id.iv18);
        new DownloadImageTask(imageView18).execute("https://s8.uupload.ir/files/64534068e0433_d0zg.png");

        ImageView imageView19 = (ImageView) findViewById(R.id.iv19);
        new DownloadImageTask(imageView19).execute("https://s8.uupload.ir/files/6356f7eca936c_uc3g.png");

        ImageView imageView20 = (ImageView) findViewById(R.id.iv20);
        new DownloadImageTask(imageView20).execute("https://s8.uupload.ir/files/6368dd04933be_uju2.png");

        ImageView imageView21 = (ImageView) findViewById(R.id.iv21);
        new DownloadImageTask(imageView21).execute("https://s8.uupload.ir/files/63c6c6b04da62_6hyr.png");

        ImageView imageView22 = (ImageView) findViewById(R.id.iv22);
        new DownloadImageTask(imageView22).execute("https://s8.uupload.ir/files/63c6c6cba7c10_tqoy.png");

        ImageView imageView23 = (ImageView) findViewById(R.id.iv23);
        new DownloadImageTask(imageView23).execute("https://s8.uupload.ir/files/63c6c60c9dfc7-384x384_ai5x.png");

        ImageView imageView24 = (ImageView) findViewById(R.id.iv24);
        new DownloadImageTask(imageView24).execute("https://s8.uupload.ir/files/63c6c5efe7889_pkta.png");

        ImageView imageView25 = (ImageView) findViewById(R.id.iv25);
        new DownloadImageTask(imageView25).execute("https://s8.uupload.ir/files/63c6c6ed92dbc_wn1r.png");

        ImageView imageView26 = (ImageView) findViewById(R.id.iv26);
        new DownloadImageTask(imageView26).execute("https://s8.uupload.ir/files/64162f5f3c148-384x384_bgs8.png");

        ImageView imageView27 = (ImageView) findViewById(R.id.iv27);
        new DownloadImageTask(imageView27).execute("https://s8.uupload.ir/files/63c6c629db296_bqb.png");

        ImageView imageView28 = (ImageView) findViewById(R.id.iv28);
        new DownloadImageTask(imageView28).execute("https://s8.uupload.ir/files/63c6c629db296_bqb.png");

        //Onclick

        @SuppressLint("CutPasteId") CardView bu1 = (CardView) findViewById(R.id.cv02);
        bu1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));
            }
        });

        @SuppressLint("CutPasteId") CardView bu2 = (CardView) findViewById(R.id.cv01);
        bu2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Goodlock_activity.this , Goodlock_guide_activity.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b1 = (LinearLayout) findViewById(R.id.ll1);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه LockStar را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b2 = (LinearLayout) findViewById(R.id.ll2);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه QuickStar را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b3 = (LinearLayout) findViewById(R.id.ll3);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه Routine+ را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b4 = (LinearLayout) findViewById(R.id.ll4);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه ClockFace را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b5 = (LinearLayout) findViewById(R.id.ll5);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه MultiStar را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b6 = (LinearLayout) findViewById(R.id.ll6);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه NavStar را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b7 = (LinearLayout) findViewById(R.id.ll7);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه NiceShot را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b8 = (LinearLayout) findViewById(R.id.ll8);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه Home Up را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b9 = (LinearLayout) findViewById(R.id.ll9);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه NotiStar را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b10 = (LinearLayout) findViewById(R.id.ll10);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه RegiStar را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b11 = (LinearLayout) findViewById(R.id.ll11);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه Theme Park را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b12 = (LinearLayout) findViewById(R.id.ll12);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه Nice Catch را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b13 = (LinearLayout) findViewById(R.id.ll13);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه One Hand Operation + را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b14 = (LinearLayout) findViewById(R.id.ll14);
        b14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent intent=new Intent();
                    intent.setComponent(new ComponentName("com.samsung.android.soundassistant", "com.sec.android.soundassistant.activities.MainActivity"));
                    startActivity(intent);
                }catch (Exception e)
                {
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه Sound Assistant را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b15 = (LinearLayout) findViewById(R.id.ll15);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه Wonderland را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b16 = (LinearLayout) findViewById(R.id.ll16);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه Keys Cafe را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b17 = (LinearLayout) findViewById(R.id.ll17);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه Camera Assistant را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b18 = (LinearLayout) findViewById(R.id.ll18);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه Good Lock را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b19 = (LinearLayout) findViewById(R.id.ll19);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه Edge Touch را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b20 = (LinearLayout) findViewById(R.id.ll20);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه Pentastic را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b21 = (LinearLayout) findViewById(R.id.ll21);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه Battery Tracker را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b22 = (LinearLayout) findViewById(R.id.ll22);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه Battery Guardian را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b23 = (LinearLayout) findViewById(R.id.ll23);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه Galaxy App Booster را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b24 = (LinearLayout) findViewById(R.id.ll24);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه Thermal Guardian را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b25 = (LinearLayout) findViewById(R.id.ll25);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه Memory Guardian را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b26 = (LinearLayout) findViewById(R.id.ll26);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه Media File Guardian را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b27 = (LinearLayout) findViewById(R.id.ll27);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه Good Guardians را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

        @SuppressLint("CutPasteId") LinearLayout b28 = (LinearLayout) findViewById(R.id.ll28);
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
                    Toast.makeText(Goodlock_activity.this, "خطا! ابتدا آخرین نسخه Good Guardians Agent را دانلود، و دوباره امتحان کنید.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Goodlock_activity.this , Goodlock_download_activity.class));

                }
            }
        });

    }
}