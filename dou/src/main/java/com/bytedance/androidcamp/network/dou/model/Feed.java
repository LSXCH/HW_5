package com.bytedance.androidcamp.network.dou.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Feed {
    @SerializedName("feeds")
    private List<Video> feeds;
    @SerializedName("state")
    public List<Video> getFeeds (){
        return feeds;
    }

}
