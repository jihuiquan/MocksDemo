package com.example.jihuiquan.newsagain.data.funny.api;

import com.example.jihuiquan.newsagain.data.funny.FunnyInfo;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by jihuiquan on 2016/12/29.
 */

public interface FunnyApi {
    @GET("funny")
    Observable<FunnyInfo> getFunny();
}
