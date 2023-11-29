package com.mhh.mysamsung.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.mhh.mysamsung.R;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a33;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a34;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a52s;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a53;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a54;
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
import com.mhh.mysamsung.phones.galaxy_s.Ph_s23;
import com.mhh.mysamsung.phones.galaxy_s.Ph_s23plus;
import com.mhh.mysamsung.phones.galaxy_s.Ph_s23ultra;
import com.mhh.mysamsung.phones.galaxy_tab.Ph_tab_s8;
import com.mhh.mysamsung.phones.galaxy_tab.Ph_tab_s8plus;
import com.mhh.mysamsung.phones.galaxy_tab.Ph_tab_s8ultra;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zflip3;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zflip4;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zflip5;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zfold3;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zfold4;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zfold5;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import de.hdodenhof.circleimageview.CircleImageView;

public class Phones_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phones);

        //Gradient
        NestedScrollView nestedScrollView = findViewById(R.id.phones);
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
        final ViewGroup r = findViewById(R.id.phones);
        final TextView t0 = findViewById(R.id.tv1);
        final LinearLayout t106 = findViewById(R.id.ll106);
        final LinearLayout t105 = findViewById(R.id.ll105);
        final LinearLayout t104 = findViewById(R.id.ll104);
        final LinearLayout t103 = findViewById(R.id.ll103);
        final LinearLayout t102 = findViewById(R.id.ll102);
        final LinearLayout t101 = findViewById(R.id.ll101);
        final LinearLayout t100 = findViewById(R.id.ll100);
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

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Transition transition = new Slide();
                transition.setDuration(1200);
                TransitionManager.beginDelayedTransition(r,transition);
                t0.setVisibility(View.VISIBLE);
                t106.setVisibility(View.VISIBLE);
                t105.setVisibility(View.VISIBLE);
                t104.setVisibility(View.VISIBLE);
                t103.setVisibility(View.VISIBLE);
                t102.setVisibility(View.VISIBLE);
                t101.setVisibility(View.VISIBLE);
                t100.setVisibility(View.VISIBLE);
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
            }
        },200);

        //Image links
        //zfold5
        CircleImageView circleImageView106 = (CircleImageView) findViewById(R.id.fciv106);
        Picasso.get().load("https://s6.uupload.ir/files/sm-f946bzkdafa-2_4cvq.jpg").placeholder(R.drawable.phone).into(circleImageView106);

        //zflip5
        CircleImageView circleImageView105 = (CircleImageView) findViewById(R.id.fciv105);
        Picasso.get().load("https://s6.uupload.ir/files/sm-f731blgaafa-2_fbap.jpg").placeholder(R.drawable.phone).into(circleImageView105);

        //a54
        CircleImageView circleImageView104 = (CircleImageView) findViewById(R.id.fciv104);
        Picasso.get().load("https://s6.uupload.ir/files/sm-a546ezkaafa-2_3oqc.jpg").placeholder(R.drawable.phone).into(circleImageView104);

        //a34
        CircleImageView circleImageView103 = (CircleImageView) findViewById(R.id.fciv103);
        Picasso.get().load("https://s6.uupload.ir/files/sm-a346ezsaafa-2_yu5k.jpg").placeholder(R.drawable.phone).into(circleImageView103);

        //s23ultra
        CircleImageView circleImageView102 = (CircleImageView) findViewById(R.id.fciv102);
        Picasso.get().load("https://s6.uupload.ir/files/sm-s918bzgcafa-2_avwv.jpg").placeholder(R.drawable.phone).into(circleImageView102);

        //s23plus
        CircleImageView circleImageView101 = (CircleImageView) findViewById(R.id.fciv101);
        Picasso.get().load("https://s6.uupload.ir/files/sm-s911bzkcafa-1_axff.jpg").placeholder(R.drawable.phone).into(circleImageView101);

        //s23
        CircleImageView circleImageView100 = (CircleImageView) findViewById(R.id.fciv100);
        Picasso.get().load("https://s6.uupload.ir/files/s23-cotton-600x600_tax8.jpg").placeholder(R.drawable.phone).into(circleImageView100);

        //zfold4
        CircleImageView circleImageView = (CircleImageView) findViewById(R.id.fciv1);
        Picasso.get().load("https://s6.uupload.ir/files/galaxy-z-fold4-share-image_ljha.jpg").placeholder(R.drawable.phone).into(circleImageView);

        //zflip4
        CircleImageView circleImageView2 = (CircleImageView) findViewById(R.id.fciv2);
        Picasso.get().load("https://s6.uupload.ir/files/042f6098-82f6-439e-8d61-176a99ddcaff_qb74.jpg").placeholder(R.drawable.phone).into(circleImageView2);

        //a73
        CircleImageView circleImageView3 = (CircleImageView) findViewById(R.id.fciv3);
        Picasso.get().load("https://s6.uupload.ir/files/182753_2020_nio9.jpg").placeholder(R.drawable.phone).into(circleImageView3);

        //a53
        CircleImageView circleImageView4 = (CircleImageView) findViewById(R.id.fciv4);
        Picasso.get().load("https://s6.uupload.ir/files/182332_2020_7zu6.jpg").placeholder(R.drawable.phone).into(circleImageView4);

        //a33
        CircleImageView circleImageView5 = (CircleImageView) findViewById(R.id.fciv5);
        Picasso.get().load("https://s6.uupload.ir/files/4182117_5uiw.jpg").placeholder(R.drawable.phone).into(circleImageView5);

        //s22ultra
        CircleImageView circleImageView6 = (CircleImageView) findViewById(R.id.fciv6);
        Picasso.get().load("https://s6.uupload.ir/files/csm_untitled_2_7_432bb95979(1)_0m0d.jpg").placeholder(R.drawable.phone).into(circleImageView6);

        //s22plus
        CircleImageView circleImageView7 = (CircleImageView) findViewById(R.id.fciv7);
        Picasso.get().load("https://s6.uupload.ir/files/s22_5w1i.jpg").placeholder(R.drawable.phone).into(circleImageView7);

        //s22
        CircleImageView circleImageView8 = (CircleImageView) findViewById(R.id.fciv8);
        Picasso.get().load("https://s6.uupload.ir/files/311440-469190-medium_dcmu.jpg").placeholder(R.drawable.phone).into(circleImageView8);

        //s21fe
        CircleImageView circleImageView9 = (CircleImageView) findViewById(R.id.fciv9);
        Picasso.get().load("https://s6.uupload.ir/files/celular-smartphone-samsung-galaxy-s21fe-tela-6-128gb-e-5g_660422_1_9r36.jpg").placeholder(R.drawable.phone).into(circleImageView9);

        //s52s
        CircleImageView circleImageView10 = (CircleImageView) findViewById(R.id.fciv10);
        Picasso.get().load("https://s6.uupload.ir/files/4_zu_3_samsung_galaxy_a52s_8zjy.jpg").placeholder(R.drawable.phone).into(circleImageView10);

        //note20ultra
        CircleImageView circleImageView11 = (CircleImageView) findViewById(R.id.fciv11);
        Picasso.get().load("https://s6.uupload.ir/files/1_ip3a.jpg").placeholder(R.drawable.phone).into(circleImageView11);

        //note205g
        CircleImageView circleImageView11_5 = (CircleImageView) findViewById(R.id.fciv12);
        Picasso.get().load("https://s6.uupload.ir/files/galaxy-note-20-5g-256gb-moi-99-like-new-han-quoc-chip-snapdragon-865_5pon.jpg").placeholder(R.drawable.phone).into(circleImageView11_5);

        //note20
        CircleImageView circleImageView12 = (CircleImageView) findViewById(R.id.fciv13);
        Picasso.get().load("https://s6.uupload.ir/files/003_galaxynote20_mysticbronze_front_with_pen_5vj3.jpg").placeholder(R.drawable.phone).into(circleImageView12);

        //zfold3
        CircleImageView circleImageView13 = (CircleImageView) findViewById(R.id.fciv14);
        Picasso.get().load("https://s6.uupload.ir/files/samsung-galaxy-z-fold-3-s-pen_38vd.jpg").placeholder(R.drawable.phone).into(circleImageView13);

        //zflip3
        CircleImageView circleImageView14 = (CircleImageView) findViewById(R.id.fciv15);
        Picasso.get().load("https://s6.uupload.ir/files/zflip3_carousel_foldunfoldcombo_phantomblack_mo_tugg.jpg").placeholder(R.drawable.phone).into(circleImageView14);

        //m53
        CircleImageView circleImageView15 = (CircleImageView) findViewById(R.id.fciv16);
        Picasso.get().load("https://s6.uupload.ir/files/840_560_23ls.jpg").placeholder(R.drawable.phone).into(circleImageView15);

        //m62
        CircleImageView circleImageView16 = (CircleImageView) findViewById(R.id.fciv17);
        Picasso.get().load("https://s6.uupload.ir/files/d619a06ecaea458e8e420bfe9a09096a7b3405dd_1630841890_f6ly.jpg").placeholder(R.drawable.phone).into(circleImageView16);

        //m33
        CircleImageView circleImageView17 = (CircleImageView) findViewById(R.id.fciv18);
        Picasso.get().load("https://s6.uupload.ir/files/619293036__0wt2.jpg").placeholder(R.drawable.phone).into(circleImageView17);

        //f23
        CircleImageView circleImageView18 = (CircleImageView) findViewById(R.id.fciv19);
        Picasso.get().load("https://s6.uupload.ir/files/samsung-galaxy-f23-aqua-green_y27t.jpg").placeholder(R.drawable.phone).into(circleImageView18);

        //f42
        CircleImageView circleImageView19 = (CircleImageView) findViewById(R.id.fciv20);
        Picasso.get().load("https://s6.uupload.ir/files/samsunggalaxyf42_0bfy.jpg").placeholder(R.drawable.phone).into(circleImageView19);

        //f13
        CircleImageView circleImageView20 = (CircleImageView) findViewById(R.id.fciv21);
        Picasso.get().load("https://s6.uupload.ir/files/samsung-galaxy-f13-1_sk5q.jpg").placeholder(R.drawable.phone).into(circleImageView20);

        //tabs8ultra
        CircleImageView circleImageView21 = (CircleImageView) findViewById(R.id.fciv22);
        Picasso.get().load("https://s6.uupload.ir/files/tab_s8_ultra_-_brothers_(3)-800x800(1)_shd5.jpg").placeholder(R.drawable.phone).into(circleImageView21);

        //tabs8plus
        CircleImageView circleImageView22 = (CircleImageView) findViewById(R.id.fciv23);
        Picasso.get().load("https://s6.uupload.ir/files/tab_s8+_brothers_(3)-800x800_rau6.jpg").placeholder(R.drawable.phone).into(circleImageView22);

        //tabs8
        CircleImageView circleImageView23 = (CircleImageView) findViewById(R.id.fciv24);
        Picasso.get().load("https://s6.uupload.ir/files/92068379032934_6iho.jpg").placeholder(R.drawable.phone).into(circleImageView23);

        //j8
        CircleImageView circleImageView24 = (CircleImageView) findViewById(R.id.fciv25);
        Picasso.get().load("https://s6.uupload.ir/files/گوشی-samsung-galaxy-j8-سامسونگ_zsof.jpg").placeholder(R.drawable.phone).into(circleImageView24);

        //j6
        CircleImageView circleImageView25 = (CircleImageView) findViewById(R.id.fciv26);
        Picasso.get().load("https://s6.uupload.ir/files/گوشی-موبایل-سامسونگ-مدل-galaxy-j6-دو-سیم-کارت-ظرفیت-32-گیگابایت_hfqq.jpg").placeholder(R.drawable.phone).into(circleImageView25);

        //j4
        CircleImageView circleImageView26 = (CircleImageView) findViewById(R.id.fciv27);
        Picasso.get().load("https://s6.uupload.ir/files/samsung-galaxy-j4_0h1f.jpg").placeholder(R.drawable.phone).into(circleImageView26);



        //ll onclick =========================================

        //button onclick

        @SuppressLint("CutPasteId") TextView tv1 = (TextView) findViewById(R.id.tv1);
        tv1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Search_activity.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ106 = (LinearLayout) findViewById(R.id.ll106);
        civ106.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_zfold5.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ105 = (LinearLayout) findViewById(R.id.ll105);
        civ105.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_zflip5.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ104 = (LinearLayout) findViewById(R.id.ll104);
        civ104.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_a54.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ103 = (LinearLayout) findViewById(R.id.ll103);
        civ103.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_a34.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ102 = (LinearLayout) findViewById(R.id.ll102);
        civ102.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_s23ultra.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ101 = (LinearLayout) findViewById(R.id.ll101);
        civ101.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_s23plus.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ100 = (LinearLayout) findViewById(R.id.ll100);
        civ100.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_s23.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ1 = (LinearLayout) findViewById(R.id.ll1);
        civ1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_zfold4.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ2 = (LinearLayout) findViewById(R.id.ll2);
        civ2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_zflip4.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ3 = (LinearLayout) findViewById(R.id.ll3);
        civ3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_a73.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ4 = (LinearLayout) findViewById(R.id.ll4);
        civ4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_a53.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ5 = (LinearLayout) findViewById(R.id.ll5);
        civ5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_a33.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ6 = (LinearLayout) findViewById(R.id.ll6);
        civ6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_s22ultra.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ7 = (LinearLayout) findViewById(R.id.ll7);
        civ7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_s22plus.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ8 = (LinearLayout) findViewById(R.id.ll8);
        civ8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_s22.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ9 = (LinearLayout) findViewById(R.id.ll9);
        civ9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_s21fe.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ10 = (LinearLayout) findViewById(R.id.ll10);
        civ10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_a52s.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ11 = (LinearLayout) findViewById(R.id.ll11);
        civ11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_note20ultra.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ11_5 = (LinearLayout) findViewById(R.id.ll12);
        civ11_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_note20_5g.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ12 = (LinearLayout) findViewById(R.id.ll13);
        civ12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_note20.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ13 = (LinearLayout) findViewById(R.id.ll14);
        civ13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_zfold3.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ14 = (LinearLayout) findViewById(R.id.ll15);
        civ14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_zflip3.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ15 = (LinearLayout) findViewById(R.id.ll16);
        civ15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_m53.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ16 = (LinearLayout) findViewById(R.id.ll17);
        civ16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_m62.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ17 = (LinearLayout) findViewById(R.id.ll18);
        civ17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_m33.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ18 = (LinearLayout) findViewById(R.id.ll19);
        civ18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_f23.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ19 = (LinearLayout) findViewById(R.id.ll20);
        civ19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_f42.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ20 = (LinearLayout) findViewById(R.id.ll21);
        civ20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_f13.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ21 = (LinearLayout) findViewById(R.id.ll22);
        civ21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_tab_s8ultra.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ22 = (LinearLayout) findViewById(R.id.ll23);
        civ22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_tab_s8plus.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ23 = (LinearLayout) findViewById(R.id.ll24);
        civ23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_tab_s8.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ24 = (LinearLayout) findViewById(R.id.ll25);
        civ24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_j8.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ25 = (LinearLayout) findViewById(R.id.ll26);
        civ25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_j6.class));
            }
        });

        @SuppressLint("CutPasteId") LinearLayout civ26 = (LinearLayout) findViewById(R.id.ll27);
        civ26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Phones_activity.this , Ph_j4.class));
            }
        });
    }
}