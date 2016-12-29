package com.example.jihuiquan.newsagain.data.joke.api;

import com.example.jihuiquan.newsagain.data.joke.JokeInfo;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by jihuiquan on 2016/12/28.
 */

public interface JokeApi {
    @GET("joke")
    Observable<JokeInfo> getNews();
}
