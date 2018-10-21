package com.example.android.newsapp;

import java.util.Date;

/*
 * The News Object
 * */
public class News {
    //Title of the article
    private String mTitle;
    //Section to which it belongs
    private String mSection;
    //The date the article it was published
    private String mDate;
    //Url to direct to the page with the full article
    private String mUrl;

    /* The Constructor*/
    public News(String title, String section, String date, String url) {
        mTitle = title;
        mSection = section;
        mDate = date;
        mUrl = url;
    }

    /*Returns the title of the article*/
    public String getArticleTitle() {
        return mTitle;
    }

    /*Returns the section of the article*/
    public String getArticleSection() {
        return mSection;
    }

    /*Returns the date and time of the article*/
    public String getArticleDate() {
        return mDate;
    }

    /*Returns the website URL to find more information about the article*/
    public String getArticleUrl() {
        return mUrl;
    }
}
