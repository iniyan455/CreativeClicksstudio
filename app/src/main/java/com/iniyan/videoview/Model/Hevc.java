
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

@SuppressWarnings("unused")
public class Hevc {

    @SerializedName("hdr")
    private List<Object> mHdr;
    @SerializedName("sdr")
    private List<Object> mSdr;

    public List<Object> getHdr() {
        return mHdr;
    }

    public void setHdr(List<Object> hdr) {
        mHdr = hdr;
    }

    public List<Object> getSdr() {
        return mSdr;
    }

    public void setSdr(List<Object> sdr) {
        mSdr = sdr;
    }

}
