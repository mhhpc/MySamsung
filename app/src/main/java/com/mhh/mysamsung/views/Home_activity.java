package com.mhh.mysamsung.views;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;
import com.mhh.mysamsung.R;
import com.transitionseverywhere.AutoTransition;
import com.transitionseverywhere.ChangeBounds;
import com.transitionseverywhere.ChangeScroll;
import com.transitionseverywhere.Crossfade;
import com.transitionseverywhere.Explode;
import com.transitionseverywhere.Fade;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;
import com.transitionseverywhere.extra.Scale;

public class Home_activity extends AppCompatActivity implements View.OnClickListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView imageView_menu, imageView_search, imageView_settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Gradient -----------
         drawerLayout = findViewById(R.id.home);
        AnimationDrawable animationDrawable = (AnimationDrawable) drawerLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //Animation ------------
        final ViewGroup r = findViewById(R.id.home);
        final Button t1 = findViewById(R.id.compare);
        final Button t2 = findViewById(R.id.option);
        final Button t3 = findViewById(R.id.tip);
        final Button t4 = findViewById(R.id.about);

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
            }
        },200);


        //text onclick
        @SuppressLint("CutPasteId") TextView txt1 = (TextView) findViewById(R.id.t2);
        txt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this , Series_activity.class));
            }
        });

        @SuppressLint("CutPasteId") TextView txt2 = (TextView) findViewById(R.id.t3);
        txt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this , Year_activity.class));
            }
        });

        @SuppressLint("CutPasteId") TextView txt3 = (TextView) findViewById(R.id.t1);
        txt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this , Phones_activity.class));
            }
        });

        //Image buttons onclick
        @SuppressLint("CutPasteId") ImageButton btn1 = (ImageButton) findViewById(R.id.b2);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this , Series_activity.class));
            }
        });

        @SuppressLint("CutPasteId") ImageButton btn2 = (ImageButton) findViewById(R.id.b3);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this , Year_activity.class));
            }
        });

        @SuppressLint("CutPasteId") ImageButton btn3 = (ImageButton) findViewById(R.id.b1);
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this , Phones_activity.class));
            }
        });

        //Buttons onclick
        @SuppressLint("CutPasteId") Button rbtn1 = (Button) findViewById(R.id.about);
        rbtn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this , About_activity.class));
            }
        });

        //-------------
        init();
        onclick();
    }
    private void init(){
        drawerLayout = findViewById(R.id.home);
        navigationView = findViewById(R.id.navigationView);
        imageView_menu = findViewById(R.id.imageView_menu);
        imageView_search = findViewById(R.id.imageView_search);
        imageView_settings = findViewById(R.id.imageView_setting);

        navigationView.bringToFront();
    }

    private void onclick(){

        imageView_menu.setOnClickListener(this);
        imageView_search.setOnClickListener(this);
        imageView_settings.setOnClickListener(this);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menu_channel:
                        drawerLayout.closeDrawers();
                        startActivity(new Intent(Home_activity.this, Ertebat_activity.class));
                        break;

                    case R.id.menu_rate:
                        drawerLayout.closeDrawers();
                        Intent intentRate = new Intent(Intent.ACTION_VIEW);
                        intentRate.setData(Uri.parse("https://cafebazaar.ir/developer/mhhossein"));
                        startActivity(intentRate);
                        break;

                    case R.id.menu_aboutUs:
                        drawerLayout.closeDrawers();
                        startActivity(new Intent(Home_activity.this, About_activity.class));
                        break;

                    case R.id.menu_exit:
                        drawerLayout.closeDrawers();
                        finish();
                        break;

                    case R.id.menu_share:
                        Intent intentSend = new Intent();
                        intentSend.setAction(Intent.ACTION_SEND);
                        intentSend.putExtra(Intent.EXTRA_TEXT, "اپلیکیشن سامسونگ من رو از لینک زیر دانلود کن \n https://cafebazaar.ir/developer/mhhossein");
                        intentSend.setType("text/plain");

                        Intent share = Intent.createChooser(intentSend, null);
                        startActivity(share);
                }


                return true;
            }
        });

    }

    @Override
    public void onClick(View v) {

        if (v == imageView_menu){
            drawerLayout.openDrawer(Gravity.RIGHT);
        }

        if (v == imageView_search){
            Intent intent = new Intent(this, Search_activity.class);
            startActivity(intent);
        }

        if (v == imageView_settings){
            Intent intent = new Intent(this, Settings_activity.class);
            startActivity(intent);
        }

    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(Gravity.RIGHT)){
            drawerLayout.closeDrawers();
        }
        else {
            super.onBackPressed();
        }
    }
}