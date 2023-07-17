package com.mhh.mysamsung.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.mhh.mysamsung.R;
import com.squareup.picasso.Picasso;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

public class Tips_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        //Gradient -----------
        NestedScrollView nestedScrollView = findViewById(R.id.tips);
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
        final ViewGroup r = findViewById(R.id.tips);
        final TextView t1 = findViewById(R.id.tv1);
        final LinearLayout t2 = findViewById(R.id.ll1);
        final LinearLayout t3 = findViewById(R.id.ll2);
        final LinearLayout t4 = findViewById(R.id.ll3);
        final LinearLayout t5 = findViewById(R.id.ll4);
        final LinearLayout t6 = findViewById(R.id.ll5);
        final LinearLayout t7 = findViewById(R.id.ll6);
        
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
            }
        },200);

        //Image links
        ImageView ImageView = (ImageView) findViewById(R.id.iv1);
        Picasso.get().load("https://s6.uupload.ir/files/07_cross-device-experience_no_asset_mo_7cqz.jpg").into(ImageView);

        ImageView ImageView2 = (ImageView) findViewById(R.id.iv2);
        Picasso.get().load("https://s6.uupload.ir/files/samsung-one-ui-3-with-android-11_main_2f_mjsp.jpg").into(ImageView2);

        ImageView ImageView3 = (ImageView) findViewById(R.id.iv3);
        Picasso.get().load("https://s6.uupload.ir/files/1_ba3h.jpg").into(ImageView3);

        ImageView ImageView4 = (ImageView) findViewById(R.id.iv4);
        Picasso.get().load("https://s6.uupload.ir/files/flip4_carousel_productkv_borapurple_mo_fku.jpg").into(ImageView4);

        ImageView ImageView5 = (ImageView) findViewById(R.id.iv5);
        Picasso.get().load("https://s6.uupload.ir/files/001-note20series-productimage_z1vw.jpg").into(ImageView5);

        ImageView ImageView6 = (ImageView) findViewById(R.id.iv6);
        Picasso.get().load("https://s6.uupload.ir/files/jze6zmkeb4zycmndqg8wvb-1200-80_pcgb.jpg").into(ImageView6);

        ImageView ImageView7 = (ImageView) findViewById(R.id.iv7);
        Picasso.get().load("https://s6.uupload.ir/files/gadgetmatch-20220317-samsung-galaxy-a23-a13-01-1000x600_sjgr.jpg").into(ImageView7);

        ImageView ImageView8 = (ImageView) findViewById(R.id.iv8);
        Picasso.get().load("https://s6.uupload.ir/files/samsung_galaxy_m22_black_128gb-1_1(1)_309l.jpg").into(ImageView8);

        ImageView ImageView9 = (ImageView) findViewById(R.id.iv9);
        Picasso.get().load("https://s6.uupload.ir/files/1bca7c83b535efe01398b720121599f8(1)_nty.jpg").into(ImageView9);

        ImageView ImageView10 = (ImageView) findViewById(R.id.iv10);
        Picasso.get().load("https://s6.uupload.ir/files/za-feature-the-tablet-that-goes-where-you-go-172164262_yeba.jpg").into(ImageView10);

        ImageView ImageView11 = (ImageView) findViewById(R.id.iv11);
        Picasso.get().load("https://s6.uupload.ir/files/samsung-galaxy-j4plus-j6plus-price-philippines-1000x563_ckrd.jpg").into(ImageView11);

        ImageView ImageView12 = (ImageView) findViewById(R.id.iv12);
        Picasso.get().load("https://s6.uupload.ir/files/20170729_snapdragon_835_vs_exynos_8895_1b3.jpg").into(ImageView12);

    }
}