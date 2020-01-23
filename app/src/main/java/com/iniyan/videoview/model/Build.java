
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

public class Build {

    @SerializedName("backend")
    private String mBackend;
    @SerializedName("js")
    private String mJs;

    public String getBackend() {
        return mBackend;
    }

    public void setBackend(String backend) {
        mBackend = backend;
    }

    public String getJs() {
        return mJs;
    }

    public void setJs(String js) {
        mJs = js;
    }

}
