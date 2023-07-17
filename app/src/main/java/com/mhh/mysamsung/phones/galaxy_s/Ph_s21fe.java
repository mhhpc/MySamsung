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
import com.mhh.mysamsung.phones_detail.full.galaxy_s.Ph_s21fe_full;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import de.hdodenhof.circleimageview.CircleImageView;

public class Ph_s21fe extends AppCompatActivity {
    TextView title, tv1, tvv1, tv2, tvv2, tv3, tvv3, tv4, tvv4, sg1, sg2, sg3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_main);

        //Set Text -----------
        title = findViewById(R.id.name);
        title.setText(getResources().getString(R.string.phones_s21fe));

        tv1 = findViewById(R.id.tv1);
        tv1.setText(getResources().getString(R.string.ph_s21fe_screen1));

        tvv1 = findViewById(R.id.tvv1);
        tvv1.setText(getResources().getString(R.string.ph_s21fe_screen2));

        tv2 = findViewById(R.id.tv2);
        tv2.setText(getResources().getString(R.string.ph_s21fe_hardware1));

        tvv2 = findViewById(R.id.tvv2);
        tvv2.setText(getResources().getString(R.string.ph_s21fe_hardware2));

        tv3 = findViewById(R.id.tv3);
        tv3.setText(getResources().getString(R.string.ph_s21fe_camera1));

        tvv3 = findViewById(R.id.tvv3);
        tvv3.setText(getResources().getString(R.string.ph_s21fe_camera2));

        tv4 = findViewById(R.id.tv4);
        tv4.setText(getResources().getString(R.string.ph_s21fe_battery1));

        tvv4 = findViewById(R.id.tvv4);
        tvv4.setText(getResources().getString(R.string.ph_s21fe_battery2));

        sg1 = findViewById(R.id.tx10);
        sg1.setText(getResources().getString(R.string.phones_zflip4));

        sg2 = findViewById(R.id.tx11);
        sg2.setText(getResources().getString(R.string.phones_s22plus));

        sg3 = findViewById(R.id.tx12);
        sg3.setText(getResources().getString(R.string.phones_s22ultra));

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
        Picasso.get().load("https://s6.uupload.ir/files/celular-smartphone-samsung-galaxy-s21fe-tela-6-128gb-e-5g_660422_1_9r36.jpg").placeholder(R.drawable.phone).into(circleImageView);

        //button onclick
        @SuppressLint("CutPasteId") Button ph1 = (Button) findViewById(R.id.b1);
        ph1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Ph_s21fe.this , Ph_s21fe_full.class));
            }
        });

    }
}