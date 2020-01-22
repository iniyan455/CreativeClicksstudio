
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

@SuppressWarnings("unused")
public class Version {

    @SerializedName("available")
    private List<Available> mAvailable;
    @SerializedName("current")
    private Object mCurrent;

    public List<Available> getAvailable() {
        return mAvailable;
    }

    public void setAvailable(List<Available> available) {
        mAvailable = available;
    }

    public Object getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Object current) {
        mCurrent = current;
    }

}
