
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Embed {

    @SerializedName("api")
    private Object mApi;
    @SerializedName("app_id")
    private String mAppId;
    @SerializedName("autopause")
    private Long mAutopause;
    @SerializedName("autoplay")
    private Long mAutoplay;
    @SerializedName("color")
    private String mColor;
    @SerializedName("context")
    private String mContext;
    @SerializedName("dnt")
    private Long mDnt;
    @SerializedName("editor")
    private Boolean mEditor;
    @SerializedName("email")
    private Email mEmail;
    @SerializedName("log_plays")
    private Long mLogPlays;
    @SerializedName("loop")
    private Long mLoop;
    @SerializedName("muted")
    private Long mMuted;
    @SerializedName("on_site")
    private Long mOnSite;
    @SerializedName("outro")
    private String mOutro;
    @SerializedName("player_id")
    private String mPlayerId;
    @SerializedName("playsinline")
    private Long mPlaysinline;
    @SerializedName("quality")
    private Object mQuality;
    @SerializedName("settings")
    private Settings mSettings;
    @SerializedName("texttrack")
    private String mTexttrack;
    @SerializedName("time")
    private Long mTime;
    @SerializedName("transparent")
    private Long mTransparent;

    public Object getApi() {
        return mApi;
    }

    public void setApi(Object api) {
        mApi = api;
    }

    public String getAppId() {
        return mAppId;
    }

    public void setAppId(String appId) {
        mAppId = appId;
    }

    public Long getAutopause() {
        return mAutopause;
    }

    public void setAutopause(Long autopause) {
        mAutopause = autopause;
    }

    public Long getAutoplay() {
        return mAutoplay;
    }

    public void setAutoplay(Long autoplay) {
        mAutoplay = autoplay;
    }

    public String getColor() {
        return mColor;
    }

    public void setColor(String color) {
        mColor = color;
    }

    public String getContext() {
        return mContext;
    }

    public void setContext(String context) {
        mContext = context;
    }

    public Long getDnt() {
        return mDnt;
    }

    public void setDnt(Long dnt) {
        mDnt = dnt;
    }

    public Boolean getEditor() {
        return mEditor;
    }

    public void setEditor(Boolean editor) {
        mEditor = editor;
    }

    public Email getEmail() {
        return mEmail;
    }

    public void setEmail(Email email) {
        mEmail = email;
    }

    public Long getLogPlays() {
        return mLogPlays;
    }

    public void setLogPlays(Long logPlays) {
        mLogPlays = logPlays;
    }

    public Long getLoop() {
        return mLoop;
    }

    public void setLoop(Long loop) {
        mLoop = loop;
    }

    public Long getMuted() {
        return mMuted;
    }

    public void setMuted(Long muted) {
        mMuted = muted;
    }

    public Long getOnSite() {
        return mOnSite;
    }

    public void setOnSite(Long onSite) {
        mOnSite = onSite;
    }

    public String getOutro() {
        return mOutro;
    }

    public void setOutro(String outro) {
        mOutro = outro;
    }

    public String getPlayerId() {
        return mPlayerId;
    }

    public void setPlayerId(String playerId) {
        mPlayerId = playerId;
    }

    public Long getPlaysinline() {
        return mPlaysinline;
    }

    public void setPlaysinline(Long playsinline) {
        mPlaysinline = playsinline;
    }

    public Object getQuality() {
        return mQuality;
    }

    public void setQuality(Object quality) {
        mQuality = quality;
    }

    public Settings getSettings() {
        return mSettings;
    }

    public void setSettings(Settings settings) {
        mSettings = settings;
    }

    public String getTexttrack() {
        return mTexttrack;
    }

    public void setTexttrack(String texttrack) {
        mTexttrack = texttrack;
    }

    public Long getTime() {
        return mTime;
    }

    public void setTime(Long time) {
        mTime = time;
    }

    public Long getTransparent() {
        return mTransparent;
    }

    public void setTransparent(Long transparent) {
        mTransparent = transparent;
    }

}
