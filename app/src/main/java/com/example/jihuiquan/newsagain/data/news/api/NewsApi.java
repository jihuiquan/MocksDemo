package com.example.jihuiquan.newsagain.data.news.api;


import com.example.jihuiquan.newsagain.data.news.NewsInfo;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by jihuiquan on 2016/12/27.
 */

public interface NewsApi {
    @GET("news")
    Observable<NewsInfo> getNews(@Query("type") String type);
}
