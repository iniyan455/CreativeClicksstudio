
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

@SuppressWarnings("unused")
public class Files {

    @SerializedName("dash")
    private Dash mDash;
    @SerializedName("hls")
    private Hls mHls;
    @SerializedName("progressive")
    private List<Progressive> mProgressive;

    public Dash getDash() {
        return mDash;
    }

    public void setDash(Dash dash) {
        mDash = dash;
    }

    public Hls getHls() {
        return mHls;
    }

    public void setHls(Hls hls) {
        mHls = hls;
    }

    public List<Progressive> getProgressive() {
        return mProgressive;
    }

    public void setProgressive(List<Progressive> progressive) {
        mProgressive = progressive;
    }

}
