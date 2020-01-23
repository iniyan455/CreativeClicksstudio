
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

@SuppressWarnings("unused")
public class Dash {

    @SerializedName("cdns")
    private Cdns mCdns;
    @SerializedName("default_cdn")
    private String mDefaultCdn;
    @SerializedName("separate_av")
    private Boolean mSeparateAv;
    @SerializedName("streams")
    private List<Stream> mStreams;
    @SerializedName("streams_avc")
    private List<StreamsAvc> mStreamsAvc;

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

    public List<Stream> getStreams() {
        return mStreams;
    }

    public void setStreams(List<Stream> streams) {
        mStreams = streams;
    }

    public List<StreamsAvc> getStreamsAvc() {
        return mStreamsAvc;
    }

    public void setStreamsAvc(List<StreamsAvc> streamsAvc) {
        mStreamsAvc = streamsAvc;
    }

}
