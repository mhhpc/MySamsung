package com.mhh.mysamsung.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.mhh.mysamsung.R;
import com.mhh.mysamsung.phones_detail.compare.galaxy_a.Ph_a33_compare;
import com.mhh.mysamsung.phones_detail.compare.galaxy_a.Ph_a34_compare;
import com.mhh.mysamsung.phones_detail.compare.galaxy_a.Ph_a52s_compare;
import com.mhh.mysamsung.phones_detail.compare.galaxy_a.Ph_a53_compare;
import com.mhh.mysamsung.phones_detail.compare.galaxy_a.Ph_a54_compare;
import com.mhh.mysamsung.phones_detail.compare.galaxy_a.Ph_a73_compare;
import com.mhh.mysamsung.phones_detail.compare.galaxy_note.Ph_note20_5g_compare;
import com.mhh.mysamsung.phones_detail.compare.galaxy_note.Ph_note20_compare;
import com.mhh.mysamsung.phones_detail.compare.galaxy_note.Ph_note20ultra_compare;
import com.mhh.mysamsung.phones_detail.compare.galaxy_s.Ph_s21fe_compare;
import com.mhh.mysamsung.phones_detail.compare.galaxy_s.Ph_s22_compare;
import com.mhh.mysamsung.phones_detail.compare.galaxy_s.Ph_s22plus_compare;
import com.mhh.mysamsung.phones_detail.compare.galaxy_s.Ph_s22ultra_compare;
import com.mhh.mysamsung.phones_detail.compare.galaxy_s.Ph_s23_compare;
import com.mhh.mysamsung.phones_detail.compare.galaxy_s.Ph_s23plus_compare;
import com.mhh.mysamsung.phones_detail.compare.galaxy_s.Ph_s23ultra_compare;
import com.mhh.mysamsung.phones_detail.compare.galaxy_z.Ph_zflip3_compare;
import com.mhh.mysamsung.phones_detail.compare.galaxy_z.Ph_zflip4_compare;
import com.mhh.mysamsung.phones_detail.compare.galaxy_z.Ph_zflip5_compare;
import com.mhh.mysamsung.phones_detail.compare.galaxy_z.Ph_zfold3_compare;
import com.mhh.mysamsung.phones_detail.compare.galaxy_z.Ph_zfold4_compare;
import com.mhh.mysamsung.phones_detail.compare.galaxy_z.Ph_zfold5_compare;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import io.github.muddz.styleabletoast.StyleableToast;

public class Compare_phone_activity extends AppCompatActivity {

    CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_list);

        collapsingToolbarLayout = findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle(getResources().getString(R.string.compare_phone_title));

        //Gradient -----------
        NestedScrollView nestedScrollView = findViewById(R.id.phone_list);
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
        final ViewGroup r = findViewById(R.id.phone_list);
        final TextView t0 = findViewById(R.id.tv1);
        final Button t100 = findViewById(R.id.ph100);
        final Button t101 = findViewById(R.id.ph101);
        final Button t102 = findViewById(R.id.ph102);
        final Button t103 = findViewById(R.id.ph103);
        final Button t104 = findViewById(R.id.ph104);
        final Button t105 = findViewById(R.id.ph105);
        final Button t106 = findViewById(R.id.ph106);
        final Button t1 = findViewById(R.id.ph1);
        final Button t2 = findViewById(R.id.ph2);
        final Button t3 = findViewById(R.id.ph3);
        final Button t4 = findViewById(R.id.ph4);
        final Button t5 = findViewById(R.id.ph5);
        final Button t6 = findViewById(R.id.ph6);
        final Button t7 = findViewById(R.id.ph7);
        final Button t8 = findViewById(R.id.ph8);
        final Button t9 = findViewById(R.id.ph9);
        final Button t10 = findViewById(R.id.ph10);
        final Button t11 = findViewById(R.id.ph11);
        final Button t12 = findViewById(R.id.ph12);
        final Button t13 = findViewById(R.id.ph13);
        final Button t14 = findViewById(R.id.ph14);
        final Button t15 = findViewById(R.id.ph15);
        final Button t16 = findViewById(R.id.ph16);
        final Button t17 = findViewById(R.id.ph17);
        final Button t18 = findViewById(R.id.ph18);
        final Button t19 = findViewById(R.id.ph19);
        final Button t20 = findViewById(R.id.ph20);
        final Button t21 = findViewById(R.id.ph21);
        final Button t22 = findViewById(R.id.ph22);
        final Button t23 = findViewById(R.id.ph23);
        final Button t24 = findViewById(R.id.ph24);
        final Button t25 = findViewById(R.id.ph25);
        final Button t26 = findViewById(R.id.ph26);
        final Button t27 = findViewById(R.id.ph27);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Transition transition = new Slide();
                transition.setDuration(1200);
                TransitionManager.beginDelayedTransition(r,transition);
                t100.setVisibility(View.VISIBLE);
                t101.setVisibility(View.VISIBLE);
                t102.setVisibility(View.VISIBLE);
                t103.setVisibility(View.VISIBLE);
                t104.setVisibility(View.VISIBLE);
                t105.setVisibility(View.VISIBLE);
                t106.setVisibility(View.VISIBLE);
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

        //onclock

        @SuppressLint("CutPasteId") Button bt100 = (Button) findViewById(R.id.ph100);
        bt100.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_phone_activity.this , Ph_zfold5_compare.class));
            }
        });

        @SuppressLint("CutPasteId") Button bt101 = (Button) findViewById(R.id.ph101);
        bt101.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_phone_activity.this , Ph_zflip5_compare.class));
            }
        });

        @SuppressLint("CutPasteId") Button bt102 = (Button) findViewById(R.id.ph102);
        bt102.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_phone_activity.this , Ph_a54_compare.class));
            }
        });

        @SuppressLint("CutPasteId") Button bt103 = (Button) findViewById(R.id.ph103);
        bt103.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_phone_activity.this , Ph_a34_compare.class));
            }
        });

        @SuppressLint("CutPasteId") Button bt104 = (Button) findViewById(R.id.ph104);
        bt104.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_phone_activity.this , Ph_s23ultra_compare.class));
            }
        });

        @SuppressLint("CutPasteId") Button bt105 = (Button) findViewById(R.id.ph105);
        bt105.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_phone_activity.this , Ph_s23plus_compare.class));
            }
        });

        @SuppressLint("CutPasteId") Button bt106 = (Button) findViewById(R.id.ph106);
        bt106.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_phone_activity.this , Ph_s23_compare.class));
            }
        });

        @SuppressLint("CutPasteId") TextView txt1 = (TextView) findViewById(R.id.tv1);
        txt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_phone_activity.this , Search_activity.class));
            }
        });

        @SuppressLint("CutPasteId") Button bt1 = (Button) findViewById(R.id.ph1);
        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_phone_activity.this , Ph_zfold4_compare.class));
            }
        });

        @SuppressLint("CutPasteId") Button bt2 = (Button) findViewById(R.id.ph2);
        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_phone_activity.this , Ph_zflip4_compare.class));
            }
        });

        @SuppressLint("CutPasteId") Button bt3 = (Button) findViewById(R.id.ph3);
        bt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_phone_activity.this , Ph_a73_compare.class));
            }
        });

        @SuppressLint("CutPasteId") Button bt4 = (Button) findViewById(R.id.ph4);
        bt4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_phone_activity.this , Ph_a53_compare.class));
            }
        });

        @SuppressLint("CutPasteId") Button bt5 = (Button) findViewById(R.id.ph5);
        bt5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_phone_activity.this , Ph_a33_compare.class));
            }
        });

        @SuppressLint("CutPasteId") Button bt6 = (Button) findViewById(R.id.ph6);
        bt6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_phone_activity.this , Ph_s22ultra_compare.class));
            }
        });

        @SuppressLint("CutPasteId") Button bt7 = (Button) findViewById(R.id.ph7);
        bt7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_phone_activity.this , Ph_s22plus_compare.class));
            }
        });

        @SuppressLint("CutPasteId") Button bt8 = (Button) findViewById(R.id.ph8);
        bt8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_phone_activity.this , Ph_s22_compare.class));
            }
        });

        @SuppressLint("CutPasteId") Button bt9 = (Button) findViewById(R.id.ph9);
        bt9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_phone_activity.this , Ph_s21fe_compare.class));
            }
        });

        @SuppressLint("CutPasteId") Button bt10 = (Button) findViewById(R.id.ph10);
        bt10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_phone_activity.this , Ph_a52s_compare.class));
            }
        });

        @SuppressLint("CutPasteId") Button bt11 = (Button) findViewById(R.id.ph11);
        bt11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_phone_activity.this , Ph_note20ultra_compare.class));
            }
        });

        @SuppressLint("CutPasteId") Button bt12 = (Button) findViewById(R.id.ph12);
        bt12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_phone_activity.this , Ph_note20_5g_compare.class));
            }
        });

        @SuppressLint("CutPasteId") Button bt13 = (Button) findViewById(R.id.ph13);
        bt13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_phone_activity.this , Ph_note20_compare.class));
            }
        });

        @SuppressLint("CutPasteId") Button bt14 = (Button) findViewById(R.id.ph14);
        bt14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_phone_activity.this , Ph_zfold3_compare.class));
            }
        });

        @SuppressLint("CutPasteId") Button bt15 = (Button) findViewById(R.id.ph15);
        bt15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_phone_activity.this , Ph_zflip3_compare.class));
            }
        });

        @SuppressLint("CutPasteId") Button bt16 = (Button) findViewById(R.id.ph16);
        bt16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                StyleableToast.makeText(getApplicationContext(), getString(R.string.coming_soon), Toast.LENGTH_LONG, R.style.soon_toast).show();
            }
        });

        @SuppressLint("CutPasteId") Button bt17 = (Button) findViewById(R.id.ph17);
        bt17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                StyleableToast.makeText(getApplicationContext(), getString(R.string.coming_soon), Toast.LENGTH_LONG, R.style.soon_toast).show();
            }
        });

        @SuppressLint("CutPasteId") Button bt18 = (Button) findViewById(R.id.ph18);
        bt18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                StyleableToast.makeText(getApplicationContext(), getString(R.string.coming_soon), Toast.LENGTH_LONG, R.style.soon_toast).show();
            }
        });

        @SuppressLint("CutPasteId") Button bt19 = (Button) findViewById(R.id.ph19);
        bt19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                StyleableToast.makeText(getApplicationContext(), getString(R.string.coming_soon), Toast.LENGTH_LONG, R.style.soon_toast).show();
            }
        });

        @SuppressLint("CutPasteId") Button bt20 = (Button) findViewById(R.id.ph20);
        bt20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                StyleableToast.makeText(getApplicationContext(), getString(R.string.coming_soon), Toast.LENGTH_LONG, R.style.soon_toast).show();
            }
        });

        @SuppressLint("CutPasteId") Button bt21 = (Button) findViewById(R.id.ph21);
        bt21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                StyleableToast.makeText(getApplicationContext(), getString(R.string.coming_soon), Toast.LENGTH_LONG, R.style.soon_toast).show();
            }
        });

        @SuppressLint("CutPasteId") Button bt22 = (Button) findViewById(R.id.ph22);
        bt22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                StyleableToast.makeText(getApplicationContext(), getString(R.string.coming_soon), Toast.LENGTH_LONG, R.style.soon_toast).show();
            }
        });

        @SuppressLint("CutPasteId") Button bt23 = (Button) findViewById(R.id.ph23);
        bt23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                StyleableToast.makeText(getApplicationContext(), getString(R.string.coming_soon), Toast.LENGTH_LONG, R.style.soon_toast).show();
            }
        });

        @SuppressLint("CutPasteId") Button bt24 = (Button) findViewById(R.id.ph24);
        bt24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                StyleableToast.makeText(getApplicationContext(), getString(R.string.coming_soon), Toast.LENGTH_LONG, R.style.soon_toast).show();
            }
        });

        @SuppressLint("CutPasteId") Button bt25 = (Button) findViewById(R.id.ph25);
        bt25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                StyleableToast.makeText(getApplicationContext(), getString(R.string.coming_soon), Toast.LENGTH_LONG, R.style.soon_toast).show();
            }
        });

        @SuppressLint("CutPasteId") Button bt26 = (Button) findViewById(R.id.ph26);
        bt26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                StyleableToast.makeText(getApplicationContext(), getString(R.string.coming_soon), Toast.LENGTH_LONG, R.style.soon_toast).show();
            }
        });

        @SuppressLint("CutPasteId") Button bt27 = (Button) findViewById(R.id.ph27);
        bt27.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                StyleableToast.makeText(getApplicationContext(), getString(R.string.coming_soon), Toast.LENGTH_LONG, R.style.soon_toast).show();
            }
        });

    }
}