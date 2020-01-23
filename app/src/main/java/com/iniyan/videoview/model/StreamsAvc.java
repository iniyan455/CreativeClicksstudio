
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class StreamsAvc {

    @SerializedName("fps")
    private Long mFps;
    @SerializedName("id")
    private Long mId;
    @SerializedName("profile")
    private Long mProfile;
    @SerializedName("quality")
    private String mQuality;

    public Long getFps() {
        return mFps;
    }

    public void setFps(Long fps) {
        mFps = fps;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
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

}
