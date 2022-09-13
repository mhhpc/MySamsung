package com.mhh.mysamsung.series;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.mhh.mysamsung.R;
import com.mhh.mysamsung.app.DownloadImageTask;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import de.hdodenhof.circleimageview.CircleImageView;

public class Serie_m extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serie_m);

        //Gradient -----------
        ConstraintLayout constraintLayout = findViewById(R.id.serie_m);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //Animation ------------
        final ViewGroup r = findViewById(R.id.serie_m);
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
        new DownloadImageTask(circleImageView).execute("https://s6.uupload.ir/files/840_560_23ls.jpg");

        CircleImageView circleImageView2 = (CircleImageView) findViewById(R.id.civ2);
        new DownloadImageTask(circleImageView2).execute("https://s6.uupload.ir/files/d619a06ecaea458e8e420bfe9a09096a7b3405dd_1630841890_f6ly.jpg");

        CircleImageView circleImageView3 = (CircleImageView) findViewById(R.id.civ3);
        new DownloadImageTask(circleImageView3).execute("https://s6.uupload.ir/files/619293036__0wt2.jpg");

    }
}