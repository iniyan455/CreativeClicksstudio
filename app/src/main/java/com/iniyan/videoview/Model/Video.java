
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Video {

    @SerializedName("allow_hd")
    private Long mAllowHd;
    @SerializedName("bypass_token")
    private String mBypassToken;
    @SerializedName("default_to_hd")
    private Long mDefaultToHd;
    @SerializedName("duration")
    private Long mDuration;
    @SerializedName("embed_code")
    private String mEmbedCode;
    @SerializedName("embed_permission")
    private String mEmbedPermission;
    @SerializedName("fps")
    private Double mFps;
    @SerializedName("hd")
    private Long mHd;
    @SerializedName("height")
    private Long mHeight;
    @SerializedName("id")
    private Long mId;
    @SerializedName("lang")
    private Object mLang;
    @SerializedName("live_event")
    private Object mLiveEvent;
    @SerializedName("owner")
    private Owner mOwner;
    @SerializedName("privacy")
    private String mPrivacy;
    @SerializedName("share_url")
    private String mShareUrl;
    @SerializedName("spatial")
    private Long mSpatial;
    @SerializedName("thumbs")
    private Thumbs mThumbs;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("unlisted_hash")
    private Object mUnlistedHash;
    @SerializedName("url")
    private String mUrl;
    @SerializedName("version")
    private Version mVersion;
    @SerializedName("width")
    private Long mWidth;

    public Long getAllowHd() {
        return mAllowHd;
    }

    public void setAllowHd(Long allowHd) {
        mAllowHd = allowHd;
    }

    public String getBypassToken() {
        return mBypassToken;
    }

    public void setBypassToken(String bypassToken) {
        mBypassToken = bypassToken;
    }

    public Long getDefaultToHd() {
        return mDefaultToHd;
    }

    public void setDefaultToHd(Long defaultToHd) {
        mDefaultToHd = defaultToHd;
    }

    public Long getDuration() {
        return mDuration;
    }

    public void setDuration(Long duration) {
        mDuration = duration;
    }

    public String getEmbedCode() {
        return mEmbedCode;
    }

    public void setEmbedCode(String embedCode) {
        mEmbedCode = embedCode;
    }

    public String getEmbedPermission() {
        return mEmbedPermission;
    }

    public void setEmbedPermission(String embedPermission) {
        mEmbedPermission = embedPermission;
    }

    public Double getFps() {
        return mFps;
    }

    public void setFps(Double fps) {
        mFps = fps;
    }

    public Long getHd() {
        return mHd;
    }

    public void setHd(Long hd) {
        mHd = hd;
    }

    public Long getHeight() {
        return mHeight;
    }

    public void setHeight(Long height) {
        mHeight = height;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Object getLang() {
        return mLang;
    }

    public void setLang(Object lang) {
        mLang = lang;
    }

    public Object getLiveEvent() {
        return mLiveEvent;
    }

    public void setLiveEvent(Object liveEvent) {
        mLiveEvent = liveEvent;
    }

    public Owner getOwner() {
        return mOwner;
    }

    public void setOwner(Owner owner) {
        mOwner = owner;
    }

    public String getPrivacy() {
        return mPrivacy;
    }

    public void setPrivacy(String privacy) {
        mPrivacy = privacy;
    }

    public String getShareUrl() {
        return mShareUrl;
    }

    public void setShareUrl(String shareUrl) {
        mShareUrl = shareUrl;
    }

    public Long getSpatial() {
        return mSpatial;
    }

    public void setSpatial(Long spatial) {
        mSpatial = spatial;
    }

    public Thumbs getThumbs() {
        return mThumbs;
    }

    public void setThumbs(Thumbs thumbs) {
        mThumbs = thumbs;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Object getUnlistedHash() {
        return mUnlistedHash;
    }

    public void setUnlistedHash(Object unlistedHash) {
        mUnlistedHash = unlistedHash;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public Version getVersion() {
        return mVersion;
    }

    public void setVersion(Version version) {
        mVersion = version;
    }

    public Long getWidth() {
        return mWidth;
    }

    public void setWidth(Long width) {
        mWidth = width;
    }

}
