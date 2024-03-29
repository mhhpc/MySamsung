package com.mhh.mysamsung.views;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;
import com.mhh.mysamsung.R;
import com.mhh.mysamsung.goodlock.Goodlock_activity;
import com.mhh.mysamsung.hidden_tip.Fake_call_activity;
import com.mhh.mysamsung.hidden_tip.Lte_only_activity;
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
        final LinearLayout t1 = findViewById(R.id.f1);
        final LinearLayout t2 = findViewById(R.id.f2);
        final LinearLayout t3 = findViewById(R.id.f3);
        final LinearLayout t4 = findViewById(R.id.f4);
        final LinearLayout t5 = findViewById(R.id.main);
        final LinearLayout t6 = findViewById(R.id.main2);
        final LinearLayout t7 = findViewById(R.id.ll1);

        //first run dialog --------------
        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        boolean firstStart = prefs.getBoolean("firstStart", true);
        if (firstStart) {
            showStartDialog();
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Transition transition = new Scale();
                transition.setDuration(600);
                TransitionManager.beginDelayedTransition(r, transition);
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t6.setVisibility(View.VISIBLE);
                t7.setVisibility(View.VISIBLE);
            }
        }, 200);


        //text onclick
        @SuppressLint("CutPasteId") TextView txt1 = (TextView) findViewById(R.id.t2);
        txt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this, Series_activity.class));
            }
        });

        @SuppressLint("CutPasteId") TextView txt2 = (TextView) findViewById(R.id.t3);
        txt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this, Year_activity.class));
            }
        });

        @SuppressLint("CutPasteId") TextView txt3 = (TextView) findViewById(R.id.t1);
        txt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this, Phones_activity.class));
            }
        });

        @SuppressLint("CutPasteId") TextView tv1 = (TextView) findViewById(R.id.text1);
        tv1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this, Compare_activity.class));
            }
        });

        @SuppressLint("CutPasteId") TextView tv2 = (TextView) findViewById(R.id.text2);
        tv2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this, Customize_activity.class));
            }
        });

        @SuppressLint("CutPasteId") TextView tv3 = (TextView) findViewById(R.id.text3);
        tv3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this, Tips_activity.class));
            }
        });

        @SuppressLint("CutPasteId") TextView tv4 = (TextView) findViewById(R.id.text4);
        tv4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this, Goodlock_activity.class));
            }
        });

        @SuppressLint("CutPasteId") TextView tv6 = (TextView) findViewById(R.id.text6);
        tv6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this, Device_info_activity.class));
            }
        });

        @SuppressLint("CutPasteId") TextView tv7 = (TextView) findViewById(R.id.text7);
        tv7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this, Fake_call_activity.class));
            }
        });

        @SuppressLint("CutPasteId") TextView tv8 = (TextView) findViewById(R.id.text8);
        tv8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this, Lte_only_activity.class));
            }
        });

        //Image buttons onclick
        @SuppressLint("CutPasteId") ImageView btn1 = (ImageView) findViewById(R.id.b2);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this, Series_activity.class));
            }
        });

        @SuppressLint("CutPasteId") ImageView btn2 = (ImageView) findViewById(R.id.b3);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this, Year_activity.class));
            }
        });

        @SuppressLint("CutPasteId") ImageView btn3 = (ImageView) findViewById(R.id.b1);
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this, Phones_activity.class));
            }
        });

        //Buttons onclick
        @SuppressLint("CutPasteId") LinearLayout rbtn1 = (LinearLayout) findViewById(R.id.ll1);
        rbtn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this, About_activity.class));
            }
        });

        @SuppressLint("CutPasteId") ImageView rbtn2 = (ImageView) findViewById(R.id.image3);
        rbtn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this, Tips_activity.class));
            }
        });

        @SuppressLint("CutPasteId") ImageView rbtn3 = (ImageView) findViewById(R.id.image2);
        rbtn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this, Customize_activity.class));
            }
        });

        @SuppressLint("CutPasteId") ImageView rbtn4 = (ImageView) findViewById(R.id.image1);
        rbtn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this, Compare_activity.class));
            }
        });

        @SuppressLint("CutPasteId") ImageView rbtn5 = (ImageView) findViewById(R.id.image4);
        rbtn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this, Goodlock_activity.class));
            }
        });

        @SuppressLint("CutPasteId") ImageView rbtn6 = (ImageView) findViewById(R.id.image6);
        rbtn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this, Device_info_activity.class));
            }
        });

        @SuppressLint("CutPasteId") ImageView rbtn7 = (ImageView) findViewById(R.id.image7);
        rbtn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this, Fake_call_activity.class));
            }
        });

        @SuppressLint("CutPasteId") ImageView rbtn8 = (ImageView) findViewById(R.id.image8);
        rbtn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this, Lte_only_activity.class));
            }
        });

        //-------------
        init();
        onclick();
    }

    private void init() {
        drawerLayout = findViewById(R.id.home);
        navigationView = findViewById(R.id.navigationView);
        imageView_menu = findViewById(R.id.imageView_menu);
        imageView_search = findViewById(R.id.imageView_search);

        navigationView.bringToFront();
    }

    private void onclick() {

        imageView_menu.setOnClickListener(this);
        imageView_search.setOnClickListener(this);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.menu_rate:
                        drawerLayout.closeDrawers();
                        Intent intentRate = new Intent(Intent.ACTION_VIEW);
                        intentRate.setData(Uri.parse("https://cafebazaar.ir/developer/781503171866"));
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
                        intentSend.putExtra(Intent.EXTRA_TEXT, "سلام \n به راحتی میتونی اپلیکیشن سامسونگ من رو از لینک زیر دانلود کنی ;) \n https://cafebazaar.ir/developer/781503171866");
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

        if (v == imageView_menu) {
            drawerLayout.openDrawer(Gravity.RIGHT);
        }

        if (v == imageView_search) {
            Intent intent = new Intent(this, Search_activity.class);
            startActivity(intent);
        }

    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(Gravity.RIGHT)) {
            drawerLayout.closeDrawers();
        } else {
            super.onBackPressed();
        }
    }

    //first run dialog ----------------------
    private void showStartDialog() {
        new AlertDialog.Builder(this)
                .setTitle("توجه")
                .setMessage("هنگام ورود به هر قسمت از برنامه برای اولین بار، اینترنت خود را روشن نگه دارید تا بهترین تجربه را از سامسونگ من داشته باشید (:")
                .setPositiveButton("تایید", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create().show();

        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("firstStart", false);
        editor.apply();
    }
}