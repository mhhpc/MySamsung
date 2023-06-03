package com.mhh.mysamsung.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
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
import android.widget.CalendarView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.mhh.mysamsung.R;
import com.mhh.mysamsung.app.DownloadImageTask;
import com.mhh.mysamsung.series.Serie_a;
import com.mhh.mysamsung.series.Serie_f;
import com.mhh.mysamsung.series.Serie_j;
import com.mhh.mysamsung.series.Serie_m;
import com.mhh.mysamsung.series.Serie_note;
import com.mhh.mysamsung.series.Serie_s;
import com.mhh.mysamsung.series.Serie_tab;
import com.mhh.mysamsung.series.Serie_z;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Fade;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import de.hdodenhof.circleimageview.CircleImageView;

public class Series_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);

        //Gradient
        NestedScrollView nestedScrollView = findViewById(R.id.series);
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
        final ViewGroup r = findViewById(R.id.series);
        final CardView t1 = findViewById(R.id.cv1);
        final CardView t2 = findViewById(R.id.cv2);
        final CardView t3 = findViewById(R.id.cv3);
        final CardView t4 = findViewById(R.id.cv4);
        final CardView t5 = findViewById(R.id.cv5);

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
            }
        },200);

        //text onclick =========================================
        @SuppressLint("CutPasteId") TextView txt1 = (TextView) findViewById(R.id.tx1);
        txt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Series_activity.this , Serie_s.class));
            }
        });

        @SuppressLint("CutPasteId") TextView txt2 = (TextView) findViewById(R.id.tx2);
        txt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Series_activity.this , Serie_z.class));
            }
        });

        @SuppressLint("CutPasteId") TextView txt3 = (TextView) findViewById(R.id.tx3);
        txt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Series_activity.this , Serie_note.class));
            }
        });

        @SuppressLint("CutPasteId") TextView txt4 = (TextView) findViewById(R.id.tx4);
        txt4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Series_activity.this , Serie_a.class));
            }
        });

        @SuppressLint("CutPasteId") TextView txt5 = (TextView) findViewById(R.id.tx5);
        txt5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Series_activity.this , Serie_m.class));
            }
        });

        @SuppressLint("CutPasteId") TextView txt6 = (TextView) findViewById(R.id.tx6);
        txt6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Series_activity.this , Serie_f.class));
            }
        });

        @SuppressLint("CutPasteId") TextView txt7 = (TextView) findViewById(R.id.tx7);
        txt7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Series_activity.this , Serie_tab.class));
            }
        });

        @SuppressLint("CutPasteId") TextView txt8 = (TextView) findViewById(R.id.tx8);
        txt8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Series_activity.this , Serie_j.class));
            }
        });

        //buttons onclick =======================================

        @SuppressLint("CutPasteId") CircleImageView btn1 = (CircleImageView) findViewById(R.id.s);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Series_activity.this , Serie_s.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView btn2 = (CircleImageView) findViewById(R.id.z);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Series_activity.this , Serie_z.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView btn3 = (CircleImageView) findViewById(R.id.note);
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Series_activity.this , Serie_note.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView btn4 = (CircleImageView) findViewById(R.id.a);
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Series_activity.this , Serie_a.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView btn5 = (CircleImageView) findViewById(R.id.m);
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Series_activity.this , Serie_m.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView btn6 = (CircleImageView) findViewById(R.id.f);
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Series_activity.this , Serie_f.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView btn7 = (CircleImageView) findViewById(R.id.tab);
        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Series_activity.this , Serie_tab.class));
            }
        });

        @SuppressLint("CutPasteId") CircleImageView btn8 = (CircleImageView) findViewById(R.id.j);
        btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Series_activity.this , Serie_j.class));
            }
        });

        //Image links
        CircleImageView circleImageView = (CircleImageView) findViewById(R.id.s);
        Picasso.get().load("https://s6.uupload.ir/files/hwpti4nbfc1vdvpdf9jx_wrws.jpg").placeholder(R.drawable.phone).into(circleImageView);

        CircleImageView circleImageView2 = (CircleImageView) findViewById(R.id.z);
        Picasso.get().load("https://s6.uupload.ir/files/samsung-galaxy-z-fold-4-beige-for-use-in-product-box_184625_u863.jpg").placeholder(R.drawable.phone).into(circleImageView2);

        CircleImageView circleImageView3 = (CircleImageView) findViewById(R.id.note);
        Picasso.get().load("https://s6.uupload.ir/files/note-20-ultra-5g_jnhl.jpg").placeholder(R.drawable.phone).into(circleImageView3);

        CircleImageView circleImageView4 = (CircleImageView) findViewById(R.id.a);
        Picasso.get().load("https://s6.uupload.ir/files/samsung-galaxy-a52s-5g_2w0h.jpg").placeholder(R.drawable.phone).into(circleImageView4);

        CircleImageView circleImageView5 = (CircleImageView) findViewById(R.id.m);
        Picasso.get().load("https://s6.uupload.ir/files/181_ut89.jpg").placeholder(R.drawable.phone).into(circleImageView5);

        CircleImageView circleImageView6 = (CircleImageView) findViewById(R.id.f);
        Picasso.get().load("https://s6.uupload.ir/files/samsung-galaxy-f52-5g-1_fj57.jpg").placeholder(R.drawable.phone).into(circleImageView6);

        CircleImageView circleImageView7 = (CircleImageView) findViewById(R.id.tab);
        Picasso.get().load("https://s6.uupload.ir/files/ap6t2pi9l2tkdlpcigrr_vpjn.jpg").placeholder(R.drawable.phone).into(circleImageView7);

        CircleImageView circleImageView8 = (CircleImageView) findViewById(R.id.j);
        Picasso.get().load("https://s6.uupload.ir/files/4_zu_3_teaser_farbvariante_lavendel_jdfj.jpg").placeholder(R.drawable.phone).into(circleImageView8);
    }
}