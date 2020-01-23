
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Progressive {

    @SerializedName("cdn")
    private String mCdn;
    @SerializedName("fps")
    private Long mFps;
    @SerializedName("height")
    private Long mHeight;
    @SerializedName("id")
    private Long mId;
    @SerializedName("mime")
    private String mMime;
    @SerializedName("origin")
    private String mOrigin;
    @SerializedName("profile")
    private Long mProfile;
    @SerializedName("quality")
    private String mQuality;
    @SerializedName("url")
    private String mUrl;
    @SerializedName("width")
    private Long mWidth;

    public String getCdn() {
        return mCdn;
    }

    public void setCdn(String cdn) {
        mCdn = cdn;
    }

    public Long getFps() {
        return mFps;
    }

    public void setFps(Long fps) {
        mFps = fps;
    }

    public Long getHeight() {
        return mHeight;
    }

    public void setHeight(Long height) {
        mHeight = height;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getMime() {
        return mMime;
    }

    public void setMime(String mime) {
        mMime = mime;
    }

    public String getOrigin() {
        return mOrigin;
    }

    public void setOrigin(String origin) {
        mOrigin = origin;
    }

    public Long getProfile() {
        return mProfile;
    }

    public void setProfile(Long profile) {
        mProfile = profile;
    }

    public String getQuality() {
        return mQuality;
    }

    public void setQuality(String quality) {
        mQuality = quality;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public Long getWidth() {
        return mWidth;
    }

    public void setWidth(Long width) {
        mWidth = width;
    }

}
