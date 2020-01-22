
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Response {

    @SerializedName("cdn_url")
    private String mCdnUrl;
    @SerializedName("embed")
    private Embed mEmbed;
    @SerializedName("player_url")
    private String mPlayerUrl;
    @SerializedName("request")
    private Request mRequest;
    @SerializedName("user")
    private User mUser;
    @SerializedName("video")
    private Video mVideo;
    @SerializedName("view")
    private Long mView;
    @SerializedName("vimeo_api_url")
    private String mVimeoApiUrl;
    @SerializedName("vimeo_url")
    private String mVimeoUrl;

    public String getCdnUrl() {
        return mCdnUrl;
    }

    public void setCdnUrl(String cdnUrl) {
        mCdnUrl = cdnUrl;
    }

    public Embed getEmbed() {
        return mEmbed;
    }

    public void setEmbed(Embed embed) {
        mEmbed = embed;
    }

    public String getPlayerUrl() {
        return mPlayerUrl;
    }

    public void setPlayerUrl(String playerUrl) {
        mPlayerUrl = playerUrl;
    }

    public Request getRequest() {
        return mRequest;
    }

    public void setRequest(Request request) {
        mRequest = request;
    }

    public User getUser() {
        return mUser;
    }

    public void setUser(User user) {
        mUser = user;
    }

    public Video getVideo() {
        return mVideo;
    }

    public void setVideo(Video video) {
        mVideo = video;
    }

    public Long getView() {
        return mView;
    }

    public void setView(Long view) {
        mView = view;
    }

    public String getVimeoApiUrl() {
        return mVimeoApiUrl;
    }

    public void setVimeoApiUrl(String vimeoApiUrl) {
        mVimeoApiUrl = vimeoApiUrl;
    }

    public String getVimeoUrl() {
        return mVimeoUrl;
    }

    public void setVimeoUrl(String vimeoUrl) {
        mVimeoUrl = vimeoUrl;
    }

}
