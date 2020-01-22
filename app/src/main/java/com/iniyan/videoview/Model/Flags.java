
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Flags {

    @SerializedName("autohide_controls")
    private Long mAutohideControls;
    @SerializedName("dnt")
    private Long mDnt;
    @SerializedName("partials")
    private Long mPartials;
    @SerializedName("plays")
    private Long mPlays;
    @SerializedName("preload_video")
    private String mPreloadVideo;

    public Long getAutohideControls() {
        return mAutohideControls;
    }

    public void setAutohideControls(Long autohideControls) {
        mAutohideControls = autohideControls;
    }

    public Long getDnt() {
        return mDnt;
    }

    public void setDnt(Long dnt) {
        mDnt = dnt;
    }

    public Long getPartials() {
        return mPartials;
    }

    public void setPartials(Long partials) {
        mPartials = partials;
    }

    public Long getPlays() {
        return mPlays;
    }

    public void setPlays(Long plays) {
        mPlays = plays;
    }

    public String getPreloadVideo() {
        return mPreloadVideo;
    }

    public void setPreloadVideo(String preloadVideo) {
        mPreloadVideo = preloadVideo;
    }

}
