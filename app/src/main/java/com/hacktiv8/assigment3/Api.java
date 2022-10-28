package com.hacktiv8.assigment3;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface Api {
    String BASE_URL="https://disease.sh/";
    @GET("v3/covid-19/all")
    Call<com.hacktiv8.assigment3.CovidTracker> getData();
}
