
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Hls {

    @SerializedName("cdns")
    private Cdns mCdns;
    @SerializedName("default_cdn")
    private String mDefaultCdn;
    @SerializedName("separate_av")
    private Boolean mSeparateAv;

    public Cdns getCdns() {
        return mCdns;
    }

    public void setCdns(Cdns cdns) {
        mCdns = cdns;
    }

    public String getDefaultCdn() {
        return mDefaultCdn;
    }

    public void setDefaultCdn(String defaultCdn) {
        mDefaultCdn = defaultCdn;
    }

    public Boolean getSeparateAv() {
        return mSeparateAv;
    }

    public void setSeparateAv(Boolean separateAv) {
        mSeparateAv = separateAv;
    }

}
