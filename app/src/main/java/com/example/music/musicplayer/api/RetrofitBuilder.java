package com.example.music.musicplayer.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBuilder {
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://dev2.caeruxlab.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }

}
