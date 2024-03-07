package com.example.myapplication;

import com.example.myapplication.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener {

        void onFetchData(List<NewsHeadlines> list, String message);
        void onError(String message);


}
