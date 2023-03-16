package com.mhh.mysamsung.views;

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
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mhh.mysamsung.R;
import com.mhh.mysamsung.app.DownloadImageTask;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a33;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a52s;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a53;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a73;
import com.mhh.mysamsung.phones.galaxy_f.Ph_f13;
import com.mhh.mysamsung.phones.galaxy_f.Ph_f23;
import com.mhh.mysamsung.phones.galaxy_f.Ph_f42;
import com.mhh.mysamsung.phones.galaxy_j.Ph_j4;
import com.mhh.mysamsung.phones.galaxy_j.Ph_j6;
import com.mhh.mysamsung.phones.galaxy_j.Ph_j8;
import com.mhh.mysamsung.phones.galaxy_m.Ph_m33;
import com.mhh.mysamsung.phones.galaxy_m.Ph_m53;
import com.mhh.mysamsung.phones.galaxy_m.Ph_m62;
import com.mhh.mysamsung.phones.galaxy_note.Ph_note20;
import com.mhh.mysamsung.phones.galaxy_note.Ph_note20_5g;
import com.mhh.mysamsung.phones.galaxy_note.Ph_note20ultra;
import com.mhh.mysamsung.phones.galaxy_s.Ph_s21fe;
import com.mhh.mysamsung.phones.galaxy_s.Ph_s22;
import com.mhh.mysamsung.phones.galaxy_s.Ph_s22plus;
import com.mhh.mysamsung.phones.galaxy_s.Ph_s22ultra;
import com.mhh.mysamsung.phones.galaxy_tab.Ph_tab_s8;
import com.mhh.mysamsung.phones.galaxy_tab.Ph_tab_s8plus;
import com.mhh.mysamsung.phones.galaxy_tab.Ph_tab_s8ultra;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zflip3;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zflip4;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zfold3;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zfold4;
import com.mhh.mysamsung.series.Serie_m;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import de.hdodenhof.circleimageview.CircleImageView;

public class Phones_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phones);

        //Gradient -----------
        ConstraintLayout constraintLayout = findViewById(R.id.phones);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //Animation ------------
        final ViewGroup r = findViewById(R.id.phones);
        final TextView t0 = findViewById(R.id.tv1);
        final RelativeLayout t1 = findViewById(R.id.rl1);
        final RelativeLayout t2 = findViewById(R.id.rl2);
        final RelativeLayout t3 = findViewById(R.id.rl3);
        final RelativeLayout t4 = findViewById(R.id.rl4);
        final RelativeLayout t5 = findViewById(R.id.rl5);
        final RelativeLayout t6 = findViewById(R.id.rl6);
        final RelativeLayout t7 = findViewById(R.id.rl7);
        final RelativeLayout t8 = findViewById(R.id.rl8);
        final RelativeLayout t9 = findViewById(R.id.rl9);
        final RelativeLayout t10 = findViewById(R.id.rl10);
        final RelativeLayout t11 = findViewById(R.id.rl11);
        final RelativeLayout t11_5 = findViewById(R.id.rl11_5);
        final RelativeLayout t12 = findViewById(R.id.rl12);
        final RelativeLayout t13 = findViewById(R.id.rl13);
        final RelativeLayout t14 = findViewById(R.id.rl14);
        final RelativeLayout t15 = findViewById(R.id.rl15);
        final RelativeLayout t16 = findViewById(R.id.rl16);
        final RelativeLayout t17 = findViewById(R.id.rl17);
        final RelativeLayout t18 = findViewById(R.id.rl18);
        final RelativeLayout t19 = findViewById(R.id.rl19);
        final RelativeLayout t20 = findViewById(R.id.rl20);
        final RelativeLayout t21 = findViewById(R.id.rl21);
        final RelativeLayout t22 = findViewById(R.id.rl22);
        final RelativeLayout t23 = findViewById(R.id.rl23);
        final RelativeLayout t24 = findViewById(R.id.rl24);
        final RelativeLayout t25 = findViewById(R.id.rl25);
        final RelativeLayout t26 = findViewById(R.id.rl26);
        final CardView rcv = findViewById(R.id.cv1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Transition transition = new Slide();
                transition.setDuration(1200);
                TransitionManager.beginDelayedTransition(r,transition);
                t0.setVisibility(View.VISIBLE);
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
                t11_5.setVisibility(View.VISIBLE);
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
                rcv.setVisibility(View.VISIBLE);
            }
        },200);

        //Image links

        CircleImageView circleImageView = (CircleImageView) findViewById(R.id.civ1);
        new DownloadImageTask(circleImageView).execute("https://s6.uupload.ir/files/galaxy-z-fold4-share-image_ljha.jpg");

        CircleImageView circleImageView2 = (CircleImageView) findViewById(R.id.civ2);
        new DownloadImageTask(circleImageView2).execute("https://s6.uupload.ir/files/042f6098-82f6-439e-8d61-176a99ddcaff_qb74.jpg");

        CircleImageView circleImageView3 = (CircleImageView) findViewById(R.id.civ3);
        new DownloadImageTask(circleImageView3).execute("https://s6.uupload.ir/files/182753_2020_nio9.jpg");

        CircleImageView circleImageView4 = (CircleImageView) findViewById(R.id.civ4);
        new DownloadImageTask(circleImageView4).execute("https://s6.uupload.ir/files/182332_2020_7zu6.jpg");

        CircleImageView circleImageView5 = (CircleImageView) findViewById(R.id.civ5);
        new DownloadImageTask(circleImageView5).execute("https://s6.uupload.ir/files/4182117_5uiw.jpg");

        CircleImageView circleImageView6 = (CircleImageView) findViewById(R.id.civ6);
        new DownloadImageTask(circleImageView6).execute("https://s6.uupload.ir/files/csm_untitled_2_7_432bb95979(1)_0m0d.jpg");

        CircleImageView circleImageView7 = (CircleImageView) findViewById(R.id.civ7);
        new DownloadImageTask(circleImageView7).execute("https://s6.uupload.ir/files/s22_5w1i.jpg");

        CircleImageView circleImageView8 = (CircleImageView) findViewById(R.id.civ8);
        new DownloadImageTask(circleImageView8).execute("https://s6.uupload.ir/files/311440-469190-medium_dcmu.jpg");

        CircleImageView circleImageView9 = (CircleImageView) findViewById(R.id.civ9);
        new DownloadImageTask(circleImageView9).execute("https://s6.uupload.ir/files/celular-smartphone-samsung-galaxy-s21fe-tela-6-128gb-e-5g_660422_1_9r36.jpg");

        CircleImageView circleImageView10 = (CircleImageView) findViewById(R.id.civ10);
        new DownloadImageTask(circleImageView10).execute("https://s6.uupload.ir/files/4_zu_3_samsung_galaxy_a52s_8zjy.jpg");

        CircleImageView circleImageView11 = (CircleImageView) findViewById(R.id.civ11);
        new DownloadImageTask(circleImageView11).execute("https://s6.uupload.ir/files/1_ip3a.jpg");

        CircleImageView circleImageView11_5 = (CircleImageView) findViewById(R.id.civ11_5);
        new DownloadImageTask(circleImageView11_5).execute("https://s6.uupload.ir/files/galaxy-note-20-5g-256gb-moi-99-like-new-han-quoc-chip-snapdragon-865_5pon.jpg");

        CircleImageView circleImageView12 = (CircleImageView) findViewById(R.id.civ12);
        new DownloadImageTask(circleImageView12).execute("https://s6.uupload.ir/files/003_galaxynote20_mysticbronze_front_with_pen_5vj3.jpg");

        CircleImageView circleImageView13 = (CircleImageView) findViewById(R.id.civ13);
        new DownloadImageTask(circleImageView13).execute("https://s6.uupload.ir/files/samsung-galaxy-z-fold-3-s-pen_38vd.jpg");

        CircleImageView circleImageView14 = (CircleImageView) findViewById(R.id.civ14);
        new DownloadImageTask(circleImageView14).execute("https://s6.uupload.ir/files/zflip3_carousel_foldunfoldcombo_phantomblack_mo_tugg.jpg");

        CircleImageView circleImageView15 = (CircleImageView) findViewById(R.id.civ15);
        new DownloadImageTask(circleImageView15).execute("https://s6.uupload.ir/files/840_560_23ls.jpg");

        CircleImageView circleImageView16 = (CircleImageView) findViewById(R.id.civ16);
        new DownloadImageTask(circleImageView16).execute("https://s6.uupload.ir/files/d619a06ecaea458e8e420bfe9a09096a7b3405dd_1630841890_f6ly.jpg");

        CircleImageView circleImageView17 = (CircleImageView) findViewById(R.id.civ17);
        new DownloadImageTask(circleImageView17).execute("https://s6.uupload.ir/files/619293036__0wt2.jpg");

        CircleImageView circleImageView18 = (CircleImageView) findViewById(R.id.civ18);
        new DownloadImageTask(circleImageView18).execute("https://s6.uupload.ir/files/samsung-galaxy-f23-aqua-green_y27t.jpg");

        CircleImageView circleImageView19 = (CircleImageView) findViewById(R.id.civ19);
        new DownloadImageTask(circleImageView19).execute("https://s6.uupload.ir/files/samsunggalaxyf42_0bfy.jpg");

        CircleImageView circleImageView20 = (CircleImageView) findViewById(R.id.civ20);
        new DownloadImageTask(circleImageView20).execute("https://s6.uupload.ir/files/samsung-galaxy-f13-1_sk5q.jpg");

        CircleImageView circleImageView21 = (CircleImageView) findViewById(R.id.civ21);
        new DownloadImageTask(circleImageView21).execute("https://s6.uupload.ir/files/tab_s8_ultra_-_brothers_(3)-800x800(1)_shd5.jpg");

        CircleImageView circleImageView22 = (CircleImageView) findViewById(R.id.civ22);
        new DownloadImageTask(circleImageView22).execute("https://s6.uupload.ir/files/tab_s8+_brothers_(3)-800x800_rau6.jpg");

        CircleImageView circleImageView23 = (CircleImageView) findViewById(R.id.civ23);
        new DownloadImageTask(circleImageView23).execute("https://s6.uupload.ir/files/92068379032934_6iho.jpg");

        CircleImageView circleImageView24 = (CircleImageView) findViewById(R.id.civ24);
        new DownloadImageTask(circleImageView24).execute("https://s6.uupload.ir/files/گوشی-samsung-galaxy-j8-سامسونگ_zsof.jpg");

        CircleImageView circleImageView25 = (CircleImageView) findViewById(R.id.civ25);
        new DownloadImageTask(circleImageView25).execute("https://s6.uupload.ir/files/گوشی-موبایل-سامسونگ-مدل-galaxy-j6-دو-سیم-کارت-ظرفیت-32-گیگابایت_hfqq.jpg");

        CircleImageView circleImageView26 = (CircleImageView) findViewById(R.id.civ26);
        new DownloadImageTask(circleImageView26).execute("https://s6.uupload.ir/files/samsung-galaxy-j4_0h1f.jpg");




        //text onclick =========================================

        @SuppressLint("CutPasteId") TextView txt1 = (TextView) findViewById(R.id.tv1);
        txt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Search_activity.class));
            }
        });

        //button onclick
        @SuppressLint("CutPasteId") Button ph1 = (Button) findViewById(R.id.ph1);
        ph1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_zfold4.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph2 = (Button) findViewById(R.id.ph2);
        ph2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_zflip4.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph3 = (Button) findViewById(R.id.ph3);
        ph3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_a73.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph4 = (Button) findViewById(R.id.ph4);
        ph4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_a53.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph5 = (Button) findViewById(R.id.ph5);
        ph5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_a33.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph6 = (Button) findViewById(R.id.ph6);
        ph6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_s22ultra.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph7 = (Button) findViewById(R.id.ph7);
        ph7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_s22plus.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph8 = (Button) findViewById(R.id.ph8);
        ph8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_s22.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph9 = (Button) findViewById(R.id.ph9);
        ph9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_s21fe.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph10 = (Button) findViewById(R.id.ph10);
        ph10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_a52s.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph11 = (Button) findViewById(R.id.ph11);
        ph11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_note20ultra.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph11_5 = (Button) findViewById(R.id.ph11_5);
        ph11_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_note20_5g.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph12 = (Button) findViewById(R.id.ph12);
        ph12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_note20.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph13 = (Button) findViewById(R.id.ph13);
        ph13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_zfold3.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph14 = (Button) findViewById(R.id.ph14);
        ph14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_zflip3.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph15 = (Button) findViewById(R.id.ph15);
        ph15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_m53.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph16 = (Button) findViewById(R.id.ph16);
        ph16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_m62.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph17 = (Button) findViewById(R.id.ph17);
        ph17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_m33.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph18 = (Button) findViewById(R.id.ph18);
        ph18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_f23.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph19 = (Button) findViewById(R.id.ph19);
        ph19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_f42.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph20 = (Button) findViewById(R.id.ph20);
        ph20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_f13.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph21 = (Button) findViewById(R.id.ph21);
        ph21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_tab_s8ultra.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph22 = (Button) findViewById(R.id.ph22);
        ph22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_tab_s8plus.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph23 = (Button) findViewById(R.id.ph23);
        ph23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_tab_s8.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph24 = (Button) findViewById(R.id.ph24);
        ph24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_j8.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph25 = (Button) findViewById(R.id.ph25);
        ph25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_j6.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph26 = (Button) findViewById(R.id.ph26);
        ph26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_j4.class));
            }
        });


        //CIV onclick =========================================

        //button onclick
        @SuppressLint("CutPasteId") CircleImageView civ1 = (CircleImageView) findViewById(R.id.civ1);
        civ1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_zfold4.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ2 = (CircleImageView) findViewById(R.id.civ2);
        civ2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_zflip4.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ3 = (CircleImageView) findViewById(R.id.civ3);
        civ3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_a73.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ4 = (CircleImageView) findViewById(R.id.civ4);
        civ4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_a53.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ5 = (CircleImageView) findViewById(R.id.civ5);
        civ5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_a33.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ6 = (CircleImageView) findViewById(R.id.civ6);
        civ6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_s22ultra.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ7 = (CircleImageView) findViewById(R.id.civ7);
        civ7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_s22plus.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ8 = (CircleImageView) findViewById(R.id.civ8);
        civ8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_s22.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ9 = (CircleImageView) findViewById(R.id.civ9);
        civ9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_s21fe.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ10 = (CircleImageView) findViewById(R.id.civ10);
        civ10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_a52s.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ11 = (CircleImageView) findViewById(R.id.civ11);
        civ11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_note20ultra.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ11_5 = (CircleImageView) findViewById(R.id.civ11_5);
        civ11_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_note20_5g.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ12 = (CircleImageView) findViewById(R.id.civ12);
        civ12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_note20.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ13 = (CircleImageView) findViewById(R.id.civ13);
        civ13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_zfold3.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ14 = (CircleImageView) findViewById(R.id.civ14);
        civ14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_zflip3.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ15 = (CircleImageView) findViewById(R.id.civ15);
        civ15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_m53.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ16 = (CircleImageView) findViewById(R.id.civ16);
        civ16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_m62.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ17 = (CircleImageView) findViewById(R.id.civ17);
        civ17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_m33.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ18 = (CircleImageView) findViewById(R.id.civ18);
        civ18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_f23.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ19 = (CircleImageView) findViewById(R.id.civ19);
        civ19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_f42.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ20 = (CircleImageView) findViewById(R.id.civ20);
        civ20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_f13.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ21 = (CircleImageView) findViewById(R.id.civ21);
        civ21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_tab_s8ultra.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ22 = (CircleImageView) findViewById(R.id.civ22);
        civ22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_tab_s8plus.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ23 = (CircleImageView) findViewById(R.id.civ23);
        civ23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_tab_s8.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ24 = (CircleImageView) findViewById(R.id.civ24);
        civ24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_j8.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ25 = (CircleImageView) findViewById(R.id.civ25);
        civ25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_j6.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView civ26 = (CircleImageView) findViewById(R.id.civ26);
        civ26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_j4.class));
            }
        });
    }
}