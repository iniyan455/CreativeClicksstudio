
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Sentry {

    @SerializedName("debug_enabled")
    private Boolean mDebugEnabled;
    @SerializedName("debug_intent")
    private Long mDebugIntent;
    @SerializedName("enabled")
    private Boolean mEnabled;
    @SerializedName("url")
    private String mUrl;

    public Boolean getDebugEnabled() {
        return mDebugEnabled;
    }

    public void setDebugEnabled(Boolean debugEnabled) {
        mDebugEnabled = debugEnabled;
    }

    public Long getDebugIntent() {
        return mDebugIntent;
    }

    public void setDebugIntent(Long debugIntent) {
        mDebugIntent = debugIntent;
    }

    public Boolean getEnabled() {
        return mEnabled;
    }

    public void setEnabled(Boolean enabled) {
        mEnabled = enabled;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

}
