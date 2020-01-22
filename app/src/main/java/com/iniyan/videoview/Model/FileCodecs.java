
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FileCodecs {

    @SerializedName("av1")
    private List<Object> mAv1;
    @SerializedName("avc")
    private List<Long> mAvc;
    @SerializedName("hevc")
    private Hevc mHevc;

    public List<Object> getAv1() {
        return mAv1;
    }

    public void setAv1(List<Object> av1) {
        mAv1 = av1;
    }

    public List<Long> getAvc() {
        return mAvc;
    }

    public void setAvc(List<Long> avc) {
        mAvc = avc;
    }

    public Hevc getHevc() {
        return mHevc;
    }

    public void setHevc(Hevc hevc) {
        mHevc = hevc;
    }

}
