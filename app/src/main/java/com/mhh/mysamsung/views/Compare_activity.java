package com.mhh.mysamsung.views;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.mhh.mysamsung.R;
import com.mhh.mysamsung.app.DownloadImageTask;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

public class Compare_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare);

        //Animation ------------
        final ViewGroup r = findViewById(R.id.compare);
        final TextView t1 = findViewById(R.id.tv1);
        final LinearLayout t3= findViewById(R.id.ll1);
        final LinearLayout t4 = findViewById(R.id.ll2);
        final LinearLayout t5 = findViewById(R.id.ll3);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Transition transition = new Slide();
                transition.setDuration(1200);
                TransitionManager.beginDelayedTransition(r, transition);
                t1.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
            }
        }, 200);

        //onclick
        @SuppressLint("CutPasteId") CardView ph1 = (CardView) findViewById(R.id.cv1);
        ph1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Compare_activity.this , Compare_phone_activity.class));
            }
        });

        //image_link
        ImageView ImageView = (ImageView) findViewById(R.id.iv1);
        new DownloadImageTask(ImageView).execute("https://s2.uupload.ir/files/e8f9c0a830e73ba0caf375611fabd1fe_cx1d.jpg");

        ImageView ImageView2 = (ImageView) findViewById(R.id.iv2);
        new DownloadImageTask(ImageView2).execute("https://s2.uupload.ir/files/2022-one-ui-17-1-own-your-privacy-for-peace-of-mind-mo_vkep.jpg");

        ImageView ImageView3 = (ImageView) findViewById(R.id.iv3);
        new DownloadImageTask(ImageView3).execute("https://s2.uupload.ir/files/hero-image.fill.size_1248x702.v1619019535_clhr.jpg");

    }
}