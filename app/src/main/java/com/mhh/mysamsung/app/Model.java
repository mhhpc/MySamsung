package com.mhh.mysamsung.app;

public class Model {
    String title;
    String desc;

    //constructor
    public Model(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    //getters


    public String getTitle() {
        return this.title;
    }

    public String getDesc() {
        return this.desc;
    }
}