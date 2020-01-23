
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class ThumbPreview {

    @SerializedName("columns")
    private Double mColumns;
    @SerializedName("frame_height")
    private Long mFrameHeight;
    @SerializedName("frame_width")
    private Double mFrameWidth;
    @SerializedName("frames")
    private Long mFrames;
    @SerializedName("height")
    private Double mHeight;
    @SerializedName("url")
    private String mUrl;
    @SerializedName("width")
    private Double mWidth;

    public Double getColumns() {
        return mColumns;
    }

    public void setColumns(Double columns) {
        mColumns = columns;
    }

    public Long getFrameHeight() {
        return mFrameHeight;
    }

    public void setFrameHeight(Long frameHeight) {
        mFrameHeight = frameHeight;
    }

    public Double getFrameWidth() {
        return mFrameWidth;
    }

    public void setFrameWidth(Double frameWidth) {
        mFrameWidth = frameWidth;
    }

    public Long getFrames() {
        return mFrames;
    }

    public void setFrames(Long frames) {
        mFrames = frames;
    }

    public Double getHeight() {
        return mHeight;
    }

    public void setHeight(Double height) {
        mHeight = height;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public Double getWidth() {
        return mWidth;
    }

    public void setWidth(Double width) {
        mWidth = width;
    }

}
