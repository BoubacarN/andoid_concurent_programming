package com.example.android.concurrency.services;

import com.example.android.concurrency.model.DataItem;
import com.example.android.concurrency.model.Guest;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface MyWebService {

    String BASE_URL = "http://192.168.0.18:8080/";
    String FEED = "api/reservations/guests";

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    @GET(FEED)
    Call<List<Guest>> dataItems();

}
