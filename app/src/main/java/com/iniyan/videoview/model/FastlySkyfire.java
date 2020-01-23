
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

public class FastlySkyfire {

    @SerializedName("avc_url")
    private String mAvcUrl;
    @SerializedName("origin")
    private String mOrigin;
    @SerializedName("url")
    private String mUrl;

    public String getAvcUrl() {
        return mAvcUrl;
    }

    public void setAvcUrl(String avcUrl) {
        mAvcUrl = avcUrl;
    }

    public String getOrigin() {
        return mOrigin;
    }

    public void setOrigin(String origin) {
        mOrigin = origin;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

}
