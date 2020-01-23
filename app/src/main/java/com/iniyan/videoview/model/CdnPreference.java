
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

public class CdnPreference {

    @SerializedName("data")
    private Data mData;
    @SerializedName("group")
    private Boolean mGroup;
    @SerializedName("track")
    private Boolean mTrack;

    public Data getData() {
        return mData;
    }

    public void setData(Data data) {
        mData = data;
    }

    public Boolean getGroup() {
        return mGroup;
    }

    public void setGroup(Boolean group) {
        mGroup = group;
    }

    public Boolean getTrack() {
        return mTrack;
    }

    public void setTrack(Boolean track) {
        mTrack = track;
    }

}
