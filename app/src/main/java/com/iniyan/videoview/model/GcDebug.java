
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class GcDebug {

    @SerializedName("bucket")
    private String mBucket;

    public String getBucket() {
        return mBucket;
    }

    public void setBucket(String bucket) {
        mBucket = bucket;
    }

}
