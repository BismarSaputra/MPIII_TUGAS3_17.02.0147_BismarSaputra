package com.example.jean.cobaretrofit.service;

import com.example.jean.cobaretrofit.model.RestResponse;

import retrofit2.Call;
import retrofit2.http.GET;


public interface HistoryApi {
//
//    @GET("player")
//    Call<RestResponse> getResults();

    @GET("history")
    Call<RestResponse> getHistory();
//
//    @GET("country/get/iso2code/{alpha2_code}")
//    Call<Data> getByAlpha2Code(@Path("alpha2_code") String alpha2Code);
}
