package com.example.music.musicplayer.api;

import com.example.music.musicplayer.Model.OnlineSong;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {

    @GET("/api/song")
    Call<List<OnlineSong>> getListSong();
}