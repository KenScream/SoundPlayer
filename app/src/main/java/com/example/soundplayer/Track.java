package com.example.soundplayer;

import com.google.gson.annotations.SerializedName;

public class Track {
    @SerializedName("title")
    private String mTitle;

    @SerializedName("id")
    private String mID;

    @SerializedName("stream_url")
    private String mStreamURL;

    @SerializedName("artwork_url")
    private String mArtworkURL;

    public String getTitle(){
        return mTitle;
    }
    public String getID(){
        return mID;
    }
    public String getStreamURL(){
        return mStreamURL;
    }
    public String getArtworkURL(){
        return mArtworkURL;
    }
}
