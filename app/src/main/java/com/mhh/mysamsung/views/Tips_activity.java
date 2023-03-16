package com.mhh.mysamsung.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mhh.mysamsung.R;
import com.mhh.mysamsung.app.DownloadImageTask;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import de.hdodenhof.circleimageview.CircleImageView;

public class Tips_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

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
        new DownloadImageTask(ImageView).execute("https://s6.uupload.ir/files/07_cross-device-experience_no_asset_mo_7cqz.jpg");

        ImageView ImageView2 = (ImageView) findViewById(R.id.iv2);
        new DownloadImageTask(ImageView2).execute("https://s6.uupload.ir/files/samsung-one-ui-3-with-android-11_main_2f_mjsp.jpg");

        ImageView ImageView3 = (ImageView) findViewById(R.id.iv3);
        new DownloadImageTask(ImageView3).execute("https://s6.uupload.ir/files/1_ba3h.jpg");

        ImageView ImageView4 = (ImageView) findViewById(R.id.iv4);
        new DownloadImageTask(ImageView4).execute("https://s6.uupload.ir/files/flip4_carousel_productkv_borapurple_mo_fku.jpg");

        ImageView ImageView5 = (ImageView) findViewById(R.id.iv5);
        new DownloadImageTask(ImageView5).execute("https://s6.uupload.ir/files/001-note20series-productimage_z1vw.jpg");

        ImageView ImageView6 = (ImageView) findViewById(R.id.iv6);
        new DownloadImageTask(ImageView6).execute("https://s6.uupload.ir/files/jze6zmkeb4zycmndqg8wvb-1200-80_pcgb.jpg");

        ImageView ImageView7 = (ImageView) findViewById(R.id.iv7);
        new DownloadImageTask(ImageView7).execute("https://s6.uupload.ir/files/gadgetmatch-20220317-samsung-galaxy-a23-a13-01-1000x600_sjgr.jpg");

        ImageView ImageView8 = (ImageView) findViewById(R.id.iv8);
        new DownloadImageTask(ImageView8).execute("https://s6.uupload.ir/files/samsung_galaxy_m22_black_128gb-1_1(1)_309l.jpg");

        ImageView ImageView9 = (ImageView) findViewById(R.id.iv9);
        new DownloadImageTask(ImageView9).execute("https://s6.uupload.ir/files/1bca7c83b535efe01398b720121599f8(1)_nty.jpg");

        ImageView ImageView10 = (ImageView) findViewById(R.id.iv10);
        new DownloadImageTask(ImageView10).execute("https://s6.uupload.ir/files/za-feature-the-tablet-that-goes-where-you-go-172164262_yeba.jpg");

        ImageView ImageView11 = (ImageView) findViewById(R.id.iv11);
        new DownloadImageTask(ImageView11).execute("https://s6.uupload.ir/files/samsung-galaxy-j4plus-j6plus-price-philippines-1000x563_ckrd.jpg");

        ImageView ImageView12 = (ImageView) findViewById(R.id.iv12);
        new DownloadImageTask(ImageView12).execute("https://s6.uupload.ir/files/20170729_snapdragon_835_vs_exynos_8895_1b3.jpg");

    }
}