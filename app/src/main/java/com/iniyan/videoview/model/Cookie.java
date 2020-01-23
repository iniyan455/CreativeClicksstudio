
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Cookie {

    @SerializedName("captions")
    private Object mCaptions;
    @SerializedName("hd")
    private Long mHd;
    @SerializedName("quality")
    private Object mQuality;
    @SerializedName("scaling")
    private Long mScaling;
    @SerializedName("volume")
    private Double mVolume;

    public Object getCaptions() {
        return mCaptions;
    }

    public void setCaptions(Object captions) {
        mCaptions = captions;
    }

    public Long getHd() {
        return mHd;
    }

    public void setHd(Long hd) {
        mHd = hd;
    }

    public Object getQuality() {
        return mQuality;
    }

    public void setQuality(Object quality) {
        mQuality = quality;
    }

    public Long getScaling() {
        return mScaling;
    }

    public void setScaling(Long scaling) {
        mScaling = scaling;
    }

    public Double getVolume() {
        return mVolume;
    }

    public void setVolume(Double volume) {
        mVolume = volume;
    }

}
