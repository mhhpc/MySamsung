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
import com.mhh.mysamsung.hidden_tip.Fake_call_activity;
import com.mhh.mysamsung.hidden_tip.Lte_only_activity;
import com.mhh.mysamsung.views.About_activity;
import com.mhh.mysamsung.views.Compare_activity;
import com.mhh.mysamsung.views.Customize_activity;
import com.mhh.mysamsung.views.Device_info_activity;
import com.mhh.mysamsung.views.Ertebat_activity;
import com.mhh.mysamsung.views.Phones_activity;
import com.mhh.mysamsung.views.Series_activity;
import com.mhh.mysamsung.views.Tips_activity;
import com.mhh.mysamsung.views.Year_activity;

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
                if (modellist.get(postition).getTitle().equals("ارتباط با ما")){
                    Intent intent = new Intent(mContext, Ertebat_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("شخصی سازی سامسونگ")){
                    Intent intent = new Intent(mContext, Phones_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("درباره ما")){
                    Intent intent = new Intent(mContext, Year_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("قابلیت های مخفی")){
                    Intent intent = new Intent(mContext, Series_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("درباره GoodLock")){
                    Intent intent = new Intent(mContext, Compare_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("پشتیبانی نرم افزاری سامسونگ")){
                    Intent intent = new Intent(mContext, Customize_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("بررسی سری گوشی ها")){
                    Intent intent = new Intent(mContext, Tips_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سری Z")){
                    Intent intent = new Intent(mContext, Goodlock_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سری S")){
                    Intent intent = new Intent(mContext, Device_info_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سری Note")){
                    Intent intent = new Intent(mContext, Fake_call_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سری A")){
                    Intent intent = new Intent(mContext, Lte_only_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سری M")){
                    Intent intent = new Intent(mContext, About_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سری F")){
                    Intent intent = new Intent(mContext, Fake_call_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سری Tab")){
                    Intent intent = new Intent(mContext, Lte_only_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سری J")){
                    Intent intent = new Intent(mContext, About_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("راهنمایی GoodLock")){
                    Intent intent = new Intent(mContext, Phones_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("بررسی سری Z")){
                    Intent intent = new Intent(mContext, Year_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("بررسی سری S")){
                    Intent intent = new Intent(mContext, Series_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("بررسی سری A")){
                    Intent intent = new Intent(mContext, Compare_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("بررسی سری Note")){
                    Intent intent = new Intent(mContext, Customize_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("بررسی سری M")){
                    Intent intent = new Intent(mContext, Tips_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("بررسی سری F")){
                    Intent intent = new Intent(mContext, Goodlock_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("بررسی سری J")){
                    Intent intent = new Intent(mContext, Device_info_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("بررسی سری Tab")){
                    Intent intent = new Intent(mContext, Fake_call_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سال 2022")){
                    Intent intent = new Intent(mContext, Tips_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سال 2021")){
                    Intent intent = new Intent(mContext, Goodlock_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سال 2020")){
                    Intent intent = new Intent(mContext, Device_info_activity.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("سال 2018")){
                    Intent intent = new Intent(mContext, Fake_call_activity.class);
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