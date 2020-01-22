
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Email {

    @SerializedName("allow_skip")
    private Long mAllowSkip;
    @SerializedName("custom_logo")
    private Object mCustomLogo;
    @SerializedName("position")
    private Object mPosition;
    @SerializedName("text")
    private String mText;
    @SerializedName("timecode")
    private Long mTimecode;

    public Long getAllowSkip() {
        return mAllowSkip;
    }

    public void setAllowSkip(Long allowSkip) {
        mAllowSkip = allowSkip;
    }

    public Object getCustomLogo() {
        return mCustomLogo;
    }

    public void setCustomLogo(Object customLogo) {
        mCustomLogo = customLogo;
    }

    public Object getPosition() {
        return mPosition;
    }

    public void setPosition(Object position) {
        mPosition = position;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Long getTimecode() {
        return mTimecode;
    }

    public void setTimecode(Long timecode) {
        mTimecode = timecode;
    }

}
