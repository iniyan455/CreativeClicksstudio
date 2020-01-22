
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Available {

    @SerializedName("file_id")
    private Long mFileId;
    @SerializedName("id")
    private Long mId;
    @SerializedName("is_current")
    private Long mIsCurrent;

    public Long getFileId() {
        return mFileId;
    }

    public void setFileId(Long fileId) {
        mFileId = fileId;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Long getIsCurrent() {
        return mIsCurrent;
    }

    public void setIsCurrent(Long isCurrent) {
        mIsCurrent = isCurrent;
    }

}
