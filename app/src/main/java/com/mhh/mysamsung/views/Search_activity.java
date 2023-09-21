package com.mhh.mysamsung.views;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;

import com.mhh.mysamsung.R;
import com.mhh.mysamsung.app.ListViewAdapter;
import com.mhh.mysamsung.app.Model;
import com.transitionseverywhere.Fade;
import com.transitionseverywhere.Slide;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionManager;

import java.util.ArrayList;

public class Search_activity extends AppCompatActivity {

    ListView listView;
    ListViewAdapter adapter;
    String[] title;
    String[] description;
    ArrayList<Model> arrayList = new ArrayList<Model>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //Gradient -----------
        LinearLayout linearLayout = findViewById(R.id.search);
        AnimationDrawable animationDrawable = (AnimationDrawable) linearLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //Animation ------------
        final ViewGroup r = findViewById(R.id.search);
        final ListView t1 = findViewById(R.id.listView);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Transition transition = new Fade();
                transition.setDuration(1200);
                TransitionManager.beginDelayedTransition(r,transition);
                t1.setVisibility(View.VISIBLE);
            }
        },200);



        //------------------------------------------------------------------------

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("");

        title = new String[]{"همه گوشی ها", "سال ساخت", "سری ها", "مقایسه", "شخصی سازی"
                             , "ترفندها و نکات جذاب", "برنامه GoodLock", "تست گوشی", "تماس جعلی", "LTE Only"
                             , "ارتباط با ما", "شخصی سازی سامسونگ", "درباره ما", "قابلیت های مخفی", "درباره GoodLock"
                             , "پشتیبانی نرم افزاری سامسونگ", "بررسی سری گوشی ها", "سری Z", "سری S", "سری Note"
                             , "سری A", "سری M", "سری F", "سری Tab", "سری J"
                             , "راهنمایی GoodLock", "بررسی سری Z", "بررسی سری S", "بررسی سری A", "بررسی سری Note"
                             , "بررسی سری M", "بررسی سری F", "بررسی سری J", "بررسی سری Tab"
                             , "سال 2022", "سال 2021", "سال 2020", "سال 2018", "Galaxy Z Fold4"
                             , "Galaxy Z Flip4", "Galaxy Z Fold3", "Galaxy Z Flip3", "Galaxy A73 5G", "Galaxy A53 5G"
                             , "Galaxy A33 5G", "Galaxy S22 Ultra", "Galaxy S22 Plus", "Galaxy S22", "Galaxy S21 FE"
                             , "Galaxy A52s 5G", "Galaxy Note20 Ultra", "Galaxy Note20 5G", "Galaxy Note20", "Galaxy M62"
                             , "Galaxy M53", "Galaxy M33", "Galaxy F23", "Galaxy F42", "Galaxy F13"
                             , "Galaxy Tab S8 Ultra", "Galaxy Tab S8 Plus", "Galaxy Tab S8", "Galaxy J8", "Galaxy J6"
                             , "Galaxy J4"};

        description = new String[]{"گوشی که دنبالشی اینجاست", "دسته بندی گوشی\u200Cها بر اساس سال ساخت", "همه سری گوشی های سامسونگ", "همه چی رو باهم مقایسه کن", "بر اساس سلیقه شما"
                                   , "یادگیری", "شخصی سازی به سبک رسمی", "تست به روش پیشمهادی سامسونگ", "همه رو غافلگیر کن !", "آنتن دهی بهتر گوشی"
                                   , "سازندگان برنامه سامسونگ من", "روش های شخصی سازی", "سازندگان برنامه سامسونگ من", "چیزهایی که نمیدونستی!", "برنامه GoodLock"
                                   , "آپدیت اندروید و امنیتی", "سری های مختلف سامسونگ", "گوشی های تاشو", "گوشی های پرجمدار", "درحد پرچمدار"
                                   , "میانرده قدرتمند", "اقتصادی", "به صرفه", "تبلت", "میانرده قدیمی"
                                   , "روش استفاده از افزونه های GoodLock", "بررسی تخصصی سری ها", "بررسی تخصصی سری ها", "بررسی تخصصی سری ها", "بررسی تخصصی سری ها"
                                   , "بررسی تخصصی سری ها", "بررسی تخصصی سری ها", "بررسی تخصصی سری ها", "بررسی تخصصی سری ها"
                                   , "گوشی های سال 2022", "گوشی های سال 2021", "گوشی های سال 2020", "گوشی های سال 2018", "Galaxy Z"
                                   , "Galaxy Z", "Galaxy Z", "Galaxy Z", "Galaxy A", "Galaxy A"
                                   , "Galaxy A", "Galaxy S", "Galaxy S", "Galaxy S", "Galaxy S"
                                   , "Galaxy A", "Galaxy NOTE", "Galaxy NOTE", "Galaxy NOTE", "Galaxy M"
                                   , "Galaxy M", "Galaxy M", "Galaxy F", "Galaxy F", "Galaxy F"
                                   , "Galaxy TAB", "Galaxy TAB", "Galaxy TAB", "Galaxy J", "Galaxy J"
                                   , "Galaxy J"};


        listView = findViewById(R.id.listView);

        for (int i = 0; i < title.length; i++) {
            Model model = new Model(title[i], description[i]);
            //bind all strings in an array
            arrayList.add(model);
        }

        //pass results to listViewAdapter class
        adapter = new ListViewAdapter(this, arrayList);

        //bind the adapter to the listview
        listView.setAdapter(adapter);
    }

    //=============================================
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (TextUtils.isEmpty(s)) {
                    adapter.filter("");
                    listView.clearTextFilter();
                } else {
                    adapter.filter(s);
                }
                return true;
            }
        });
        return true;
    }
    //=======================

}