package com.mhh.mysamsung.app;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mhh.mysamsung.R;
import com.mhh.mysamsung.goodlock.Goodlock_activity;
import com.mhh.mysamsung.goodlock.Goodlock_guide_activity;
import com.mhh.mysamsung.hidden_tip.Fake_call_activity;
import com.mhh.mysamsung.hidden_tip.Lte_only_activity;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a33;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a52s;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a53;
import com.mhh.mysamsung.phones.galaxy_a.Ph_a73;
import com.mhh.mysamsung.phones.galaxy_f.Ph_f13;
import com.mhh.mysamsung.phones.galaxy_f.Ph_f23;
import com.mhh.mysamsung.phones.galaxy_f.Ph_f42;
import com.mhh.mysamsung.phones.galaxy_j.Ph_j4;
import com.mhh.mysamsung.phones.galaxy_j.Ph_j6;
import com.mhh.mysamsung.phones.galaxy_j.Ph_j8;
import com.mhh.mysamsung.phones.galaxy_m.Ph_m33;
import com.mhh.mysamsung.phones.galaxy_m.Ph_m53;
import com.mhh.mysamsung.phones.galaxy_m.Ph_m62;
import com.mhh.mysamsung.phones.galaxy_note.Ph_note20;
import com.mhh.mysamsung.phones.galaxy_note.Ph_note20_5g;
import com.mhh.mysamsung.phones.galaxy_note.Ph_note20ultra;
import com.mhh.mysamsung.phones.galaxy_s.Ph_s21fe;
import com.mhh.mysamsung.phones.galaxy_s.Ph_s22;
import com.mhh.mysamsung.phones.galaxy_s.Ph_s22plus;
import com.mhh.mysamsung.phones.galaxy_s.Ph_s22ultra;
import com.mhh.mysamsung.phones.galaxy_tab.Ph_tab_s8;
import com.mhh.mysamsung.phones.galaxy_tab.Ph_tab_s8plus;
import com.mhh.mysamsung.phones.galaxy_tab.Ph_tab_s8ultra;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zflip3;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zflip4;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zfold3;
import com.mhh.mysamsung.phones.galaxy_z.Ph_zfold4;
import com.mhh.mysamsung.series.Serie_a;
import com.mhh.mysamsung.series.Serie_f;
import com.mhh.mysamsung.series.Serie_j;
import com.mhh.mysamsung.series.Serie_m;
import com.mhh.mysamsung.series.Serie_note;
import com.mhh.mysamsung.series.Serie_s;
import com.mhh.mysamsung.series.Serie_tab;
import com.mhh.mysamsung.series.Serie_z;
import com.mhh.mysamsung.views.About_activity;
import com.mhh.mysamsung.views.Compare_activity;
import com.mhh.mysamsung.views.Customize_activity;
import com.mhh.mysamsung.views.Customize_goodlock_activity;
import com.mhh.mysamsung.views.Customize_samsung_activity;
import com.mhh.mysamsung.views.Device_info_activity;
import com.mhh.mysamsung.views.Hidden_tips_activity;
import com.mhh.mysamsung.views.Phones_activity;
import com.mhh.mysamsung.views.Series_activity;
import com.mhh.mysamsung.views.Tips_a_activity;
import com.mhh.mysamsung.views.Tips_activity;
import com.mhh.mysamsung.views.Tips_f_activity;
import com.mhh.mysamsung.views.Tips_m_activity;
import com.mhh.mysamsung.views.Tips_note_activity;
import com.mhh.mysamsung.views.Tips_s_activity;
import com.mhh.mysamsung.views.Tips_series_activity;
import com.mhh.mysamsung.views.Tips_software_activity;
import com.mhh.mysamsung.views.Tips_z_activity;
import com.mhh.mysamsung.views.Year_activity;
import com.mhh.mysamsung.year.Year_2018;
import com.mhh.mysamsung.year.Year_2020;
import com.mhh.mysamsung.year.Year_2021;
import com.mhh.mysamsung.year.Year_2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter{

    //variables
    Context mContext;
    LayoutInflater inflater;
    List<Model> modellist;
    ArrayList<Model> arrayList;

    //constructor
    public ListViewAdapter(Context context, List<Model> modellist) {
        mContext = context;
        this.modellist = modellist;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<Model>();
        this.arrayList.addAll(modellist);
    }

    public class ViewHolder{
        TextView mTitleTv, mDescTv;
        ImageView mIconIv;
    }

    @Override
    public int getCount() {
        return modellist.size();
    }

    @Override
    public Object getItem(int i) {
        return modellist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int postition, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.row, null);

            //locate the views in row.xml
            holder.mTitleTv = view.findViewById(R.id.mainTitle);
            holder.mDescTv = view.findViewById(R.id.mainDesc);

            view.setTag(holder);

        }
        else {
            holder = (ViewHolder)view.getTag();
        }
        //set the results into textviews
        holder.mTitleTv.setText(modellist.get(postition).getTitle());
        holder.mDescTv.setText(modellist.get(postition).getDesc());
        //set the result in imageview

        //listview item clicks
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code later
                if (modellist.get(postition).getTitle().equals("همه گوشی ها")){
                    Intent intent = new Intent(mContext, Phones_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سال ساخت")){
                    Intent intent = new Intent(mContext, Year_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سری ها")){
                    Intent intent = new Intent(mContext, Series_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("مقایسه")){
                    Intent intent = new Intent(mContext, Compare_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("شخصی سازی")){
                    Intent intent = new Intent(mContext, Customize_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("ترفندها و نکات جذاب")){
                    Intent intent = new Intent(mContext, Tips_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("برنامه GoodLock")){
                    Intent intent = new Intent(mContext, Goodlock_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("تست گوشی")){
                    Intent intent = new Intent(mContext, Device_info_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("تماس جعلی")){
                    Intent intent = new Intent(mContext, Fake_call_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("LTE Only")){
                    Intent intent = new Intent(mContext, Lte_only_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("شخصی سازی سامسونگ")){
                    Intent intent = new Intent(mContext, Customize_samsung_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("درباره ما")){
                    Intent intent = new Intent(mContext, About_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("قابلیت های مخفی")){
                    Intent intent = new Intent(mContext, Hidden_tips_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("درباره GoodLock")){
                    Intent intent = new Intent(mContext, Customize_goodlock_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("پشتیبانی نرم افزاری سامسونگ")){
                    Intent intent = new Intent(mContext, Tips_software_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("بررسی سری گوشی ها")){
                    Intent intent = new Intent(mContext, Tips_series_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سری Z")){
                    Intent intent = new Intent(mContext, Serie_z.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سری S")){
                    Intent intent = new Intent(mContext, Serie_s.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سری Note")){
                    Intent intent = new Intent(mContext, Serie_note.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سری A")){
                    Intent intent = new Intent(mContext, Serie_a.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سری M")){
                    Intent intent = new Intent(mContext, Serie_m.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سری F")){
                    Intent intent = new Intent(mContext, Serie_f.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سری Tab")){
                    Intent intent = new Intent(mContext, Serie_tab.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سری J")){
                    Intent intent = new Intent(mContext, Serie_j.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("راهنمایی GoodLock")){
                    Intent intent = new Intent(mContext, Goodlock_guide_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("بررسی سری Z")){
                    Intent intent = new Intent(mContext, Tips_z_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("بررسی سری S")){
                    Intent intent = new Intent(mContext, Tips_s_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("بررسی سری A")){
                    Intent intent = new Intent(mContext, Tips_a_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("بررسی سری Note")){
                    Intent intent = new Intent(mContext, Tips_note_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("بررسی سری M")){
                    Intent intent = new Intent(mContext, Tips_m_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("بررسی سری F")){
                    Intent intent = new Intent(mContext, Tips_f_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سال 2022")){
                    Intent intent = new Intent(mContext, Year_2022.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سال 2021")){
                    Intent intent = new Intent(mContext, Year_2021.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سال 2020")){
                    Intent intent = new Intent(mContext, Year_2020.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سال 2018")){
                    Intent intent = new Intent(mContext, Year_2018.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy Z Fold4")){
                    Intent intent = new Intent(mContext, Ph_zfold4.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy Z Flip4")){
                    Intent intent = new Intent(mContext, Ph_zflip4.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy Z Fold3")){
                    Intent intent = new Intent(mContext, Ph_zfold3.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy Z Flip3")){
                    Intent intent = new Intent(mContext, Ph_zflip3.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy A73 5G")){
                    Intent intent = new Intent(mContext, Ph_a73.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy A53 5G")){
                    Intent intent = new Intent(mContext, Ph_a53.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy A33 5G")){
                    Intent intent = new Intent(mContext, Ph_a33.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy S22 Ultra")){
                    Intent intent = new Intent(mContext, Ph_s22ultra.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy S22 Plus")){
                    Intent intent = new Intent(mContext, Ph_s22plus.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy S22")){
                    Intent intent = new Intent(mContext, Ph_s22.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy S21 FE")){
                    Intent intent = new Intent(mContext, Ph_s21fe.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy A52s 5G")){
                    Intent intent = new Intent(mContext, Ph_a52s.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy Note20 Ultra")){
                    Intent intent = new Intent(mContext, Ph_note20ultra.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy Note20 5G")){
                    Intent intent = new Intent(mContext, Ph_note20_5g.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy Note20")){
                    Intent intent = new Intent(mContext, Ph_note20.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy M62")){
                    Intent intent = new Intent(mContext, Ph_m62.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy M53")){
                    Intent intent = new Intent(mContext, Ph_m53.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy M33")){
                    Intent intent = new Intent(mContext, Ph_m33.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy F23")){
                    Intent intent = new Intent(mContext, Ph_f23.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy F42")){
                    Intent intent = new Intent(mContext, Ph_f42.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy F13")){
                    Intent intent = new Intent(mContext, Ph_f13.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy Tab S8 Ultra")){
                    Intent intent = new Intent(mContext, Ph_tab_s8ultra.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy Tab S8 Plus")){
                    Intent intent = new Intent(mContext, Ph_tab_s8plus.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy Tab S8")){
                    Intent intent = new Intent(mContext, Ph_tab_s8.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy J8")){
                    Intent intent = new Intent(mContext, Ph_j8.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy J6")){
                    Intent intent = new Intent(mContext, Ph_j6.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Galaxy J4")){
                    Intent intent = new Intent(mContext, Ph_j4.class);
                    mContext.startActivity(intent);
                }
            }
        });


        return view;
    }

    //filter
    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        modellist.clear();
        if (charText.length()==0){
            modellist.addAll(arrayList);
        }
        else {
            for (Model model : arrayList){
                if (model.getTitle().toLowerCase(Locale.getDefault())
                        .contains(charText)){
                    modellist.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }

}