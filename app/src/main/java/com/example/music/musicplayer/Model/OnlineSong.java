package com.example.music.musicplayer.Model;

import com.google.gson.annotations.SerializedName;

public class OnlineSong {
    private int id;
    @SerializedName(value = "song_link")
    private String songLink;
    @SerializedName(value = "song_name")
    private String songName;
    private String singer;

    public OnlineSong(int id, String songLink, String songName, String singer) {
        this.id = id;
        this.songLink = songLink;
        this.songName = songName;
        this.singer = singer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSongLink() {
        return songLink;
    }

    public void setSongLink(String songLink) {
        this.songLink = songLink;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
