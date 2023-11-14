package com.mhh.mysamsung.phones.galaxy_s;

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
import android.widget.TextView;

import com.mhh.mysamsung.R;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a34;
import com.mhh.mysamsung.phones_detail.check.galaxy_a.Ph_a34_check;
import com.mhh.mysamsung.phones_detail.check.galaxy_s.Ph_s23plus_check;
import com.mhh.mysamsung.phones_detail.compare.galaxy_a.Ph_a34_compare;
import com.mhh.mysamsung.phones_detail.compare.galaxy_s.Ph_s23plus_compare;
import com.mhh.mysamsung.phones_detail.customize.galaxy_a.Ph_a34_customize;
import com.mhh.mysamsung.phones_detail.customize.galaxy_s.Ph_s23plus_customize;
import com.mhh.mysamsung.phones_detail.full.galaxy_a.Ph_a34_full;
import com.mhh.mysamsung.phones_detail.full.galaxy_s.Ph_s23plus_full;
import com.mhh.mysamsung.phones_detail.pictures.galaxy_a.Ph_a34_picture;
import com.mhh.mysamsung.phones_detail.pictures.galaxy_s.Ph_s23plus_picture;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import de.hdodenhof.circleimageview.CircleImageView;

public class Ph_s23plus extends AppCompatActivity {

    TextView title, tv1, tvv1, tv2, tvv2, tv3, tvv3, tv4, tvv4, sg1, sg2, sg3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_main);

        //Set Text -----------
        title = findViewById(R.id.name);
        title.setText(getResources().getString(R.string.phones_s23plus));

        tv1 = findViewById(R.id.tv1);
        tv1.setText(getResources().getString(R.string.ph_s23plus_screen1));

        tvv1 = findViewById(R.id.tvv1);
        tvv1.setText(getResources().getString(R.string.ph_s23plus_screen2));

        tv2 = findViewById(R.id.tv2);
        tv2.setText(getResources().getString(R.string.ph_s23plus_hardware1));

        tvv2 = findViewById(R.id.tvv2);
        tvv2.setText(getResources().getString(R.string.ph_s23plus_hardware2));

        tv3 = findViewById(R.id.tv3);
        tv3.setText(getResources().getString(R.string.ph_s23plus_camera1));

        tvv3 = findViewById(R.id.tvv3);
        tvv3.setText(getResources().getString(R.string.ph_s23plus_camera2));

        tv4 = findViewById(R.id.tv4);
        tv4.setText(getResources().getString(R.string.ph_s23plus_battery1));

        tvv4 = findViewById(R.id.tvv4);
        tvv4.setText(getResources().getString(R.string.ph_s23plus_battery2));

        sg1 = findViewById(R.id.tx10);
        sg1.setText(getResources().getString(R.string.phones_s23ultra));

        sg2 = findViewById(R.id.tx11);
        sg2.setText(getResources().getString(R.string.phones_s23));

        sg3 = findViewById(R.id.tx12);
        sg3.setText(getResources().getString(R.string.phones_s22plus));

        //Gradient -----------
        ConstraintLayout constraintLayout = findViewById(R.id.phone_main);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //Animation ------------
        final ViewGroup r = findViewById(R.id.phone_main);
        final CircleImageView t1 = findViewById(R.id.civ1);
        final TextView t2 = findViewById(R.id.name);
        final CardView t3 = findViewById(R.id.cv1);
        final CardView t4 = findViewById(R.id.cv2);
        final CardView t5 = findViewById(R.id.cv3);
        final CardView t6 = findViewById(R.id.cv4);
        final Button t7 = findViewById(R.id.b1);
        final Button t8 = findViewById(R.id.b2);
        final Button t9 = findViewById(R.id.b3);
        final Button t10 = findViewById(R.id.b4);
        final Button t11 = findViewById(R.id.b5);
        final CardView rcv = findViewById(R.id.cv5);

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
                t7.setVisibility(View.VISIBLE);
                t8.setVisibility(View.VISIBLE);
                t9.setVisibility(View.VISIBLE);
                t10.setVisibility(View.VISIBLE);
                t11.setVisibility(View.VISIBLE);
                rcv.setVisibility(View.VISIBLE);
            }
        },200);

        //Image links
        CircleImageView circleImageView = (CircleImageView) findViewById(R.id.civ1);
        Picasso.get().load("https://s6.uupload.ir/files/sm-s911bzkcafa-1_axff.jpg").placeholder(R.drawable.phone).into(circleImageView);

        //suggest onclick
        @SuppressLint("CutPasteId") TextView sg1 = (TextView) findViewById(R.id.tx10);
        sg1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext() , Ph_s23ultra.class));
            }
        });

        @SuppressLint("CutPasteId") TextView sg2 = (TextView) findViewById(R.id.tx11);
        sg2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext() , Ph_s23.class));
            }
        });

        @SuppressLint("CutPasteId") TextView sg3 = (TextView) findViewById(R.id.tx12);
        sg3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext() , Ph_s22plus.class));
            }
        });

        //button onclick
        @SuppressLint("CutPasteId") Button ph1 = (Button) findViewById(R.id.b1);
        ph1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext() , Ph_s23plus_full.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph2 = (Button) findViewById(R.id.b2);
        ph2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext() , Ph_s23plus_check.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph3 = (Button) findViewById(R.id.b3);
        ph3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext() , Ph_s23plus_picture.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph4 = (Button) findViewById(R.id.b4);
        ph4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext() , Ph_s23plus_customize.class));
            }
        });

        @SuppressLint("CutPasteId") Button ph5 = (Button) findViewById(R.id.b5);
        ph5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext() , Ph_s23plus_compare.class));
            }
        });

    }
}