package com.mhh.mysamsung.series;

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
import android.widget.TextView;

import com.mhh.mysamsung.R;
import com.mhh.mysamsung.app.DownloadImageTask;
import com.mhh.mysamsung.phones.galaxy_m.Ph_m33;
import com.mhh.mysamsung.phones.galaxy_m.Ph_m53;
import com.mhh.mysamsung.phones.galaxy_m.Ph_m62;
import com.mhh.mysamsung.phones.galaxy_tab.Ph_tab_s8;
import com.mhh.mysamsung.phones.galaxy_tab.Ph_tab_s8plus;
import com.mhh.mysamsung.phones.galaxy_tab.Ph_tab_s8ultra;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import de.hdodenhof.circleimageview.CircleImageView;

public class Serie_tab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serie_tab);

        //Gradient -----------
        ConstraintLayout constraintLayout = findViewById(R.id.serie_tab);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //Animation ------------
        final ViewGroup r = findViewById(R.id.serie_tab);
        final CircleImageView t1 = findViewById(R.id.civ1);
        final TextView t2 = findViewById(R.id.tv1);
        final CircleImageView t3 = findViewById(R.id.civ2);
        final TextView t4 = findViewById(R.id.tv2);
        final CircleImageView t5 = findViewById(R.id.civ3);
        final TextView t6 = findViewById(R.id.tv3);
        final CardView tcv = findViewById(R.id.cv1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Transition transition = new Slide();
                transition.setDuration(1200);
                TransitionManager.beginDelayedTransition(r,transition);
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t6.setVisibility(View.VISIBLE);
                tcv.setVisibility(View.VISIBLE);
            }
        },200);

        //Image links
        CircleImageView circleImageView = (CircleImageView) findViewById(R.id.civ1);
        new DownloadImageTask(circleImageView).execute("https://s6.uupload.ir/files/tab_s8_ultra_-_brothers_(3)-800x800(1)_shd5.jpg");

        CircleImageView circleImageView2 = (CircleImageView) findViewById(R.id.civ2);
        new DownloadImageTask(circleImageView2).execute("https://s6.uupload.ir/files/tab_s8+_brothers_(3)-800x800_rau6.jpg");

        CircleImageView circleImageView3 = (CircleImageView) findViewById(R.id.civ3);
        new DownloadImageTask(circleImageView3).execute("https://s6.uupload.ir/files/92068379032934_6iho.jpg");


        //text onclick =========================================

        @SuppressLint("CutPasteId") TextView txt1 = (TextView) findViewById(R.id.tv1);
        txt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { startActivity(new Intent(Serie_tab.this , Ph_tab_s8ultra.class)); }
        });

        @SuppressLint("CutPasteId") TextView txt2 = (TextView) findViewById(R.id.tv2);
        txt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { startActivity(new Intent(Serie_tab.this , Ph_tab_s8plus.class)); }
        });

        @SuppressLint("CutPasteId") TextView txt3 = (TextView) findViewById(R.id.tv3);
        txt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { startActivity(new Intent(Serie_tab.this , Ph_tab_s8.class)); }
        });

        //CIV onclick =======================================

        @SuppressLint("CutPasteId") CircleImageView btn1 = (CircleImageView) findViewById(R.id.civ1);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { startActivity(new Intent(Serie_tab.this , Ph_tab_s8ultra.class)); }
        });

        @SuppressLint("CutPasteId") CircleImageView btn2 = (CircleImageView) findViewById(R.id.civ2);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { startActivity(new Intent(Serie_tab.this , Ph_tab_s8plus.class)); }
        });

        @SuppressLint("CutPasteId") CircleImageView btn3 = (CircleImageView) findViewById(R.id.civ3);
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { startActivity(new Intent(Serie_tab.this , Ph_tab_s8.class)); }
        });

    }
}