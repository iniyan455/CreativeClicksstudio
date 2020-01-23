
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class User {

    @SerializedName("account_type")
    private String mAccountType;
    @SerializedName("id")
    private Long mId;
    @SerializedName("liked")
    private Long mLiked;
    @SerializedName("logged_in")
    private Long mLoggedIn;
    @SerializedName("mod")
    private Long mMod;
    @SerializedName("owner")
    private Long mOwner;
    @SerializedName("team_id")
    private Long mTeamId;
    @SerializedName("team_origin_user_id")
    private Long mTeamOriginUserId;
    @SerializedName("vimeo_api_client_token")
    private Object mVimeoApiClientToken;
    @SerializedName("vimeo_api_interaction_tokens")
    private Object mVimeoApiInteractionTokens;
    @SerializedName("watch_later")
    private Long mWatchLater;

    public String getAccountType() {
        return mAccountType;
    }

    public void setAccountType(String accountType) {
        mAccountType = accountType;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Long getLiked() {
        return mLiked;
    }

    public void setLiked(Long liked) {
        mLiked = liked;
    }

    public Long getLoggedIn() {
        return mLoggedIn;
    }

    public void setLoggedIn(Long loggedIn) {
        mLoggedIn = loggedIn;
    }

    public Long getMod() {
        return mMod;
    }

    public void setMod(Long mod) {
        mMod = mod;
    }

    public Long getOwner() {
        return mOwner;
    }

    public void setOwner(Long owner) {
        mOwner = owner;
    }

    public Long getTeamId() {
        return mTeamId;
    }

    public void setTeamId(Long teamId) {
        mTeamId = teamId;
    }

    public Long getTeamOriginUserId() {
        return mTeamOriginUserId;
    }

    public void setTeamOriginUserId(Long teamOriginUserId) {
        mTeamOriginUserId = teamOriginUserId;
    }

    public Object getVimeoApiClientToken() {
        return mVimeoApiClientToken;
    }

    public void setVimeoApiClientToken(Object vimeoApiClientToken) {
        mVimeoApiClientToken = vimeoApiClientToken;
    }

    public Object getVimeoApiInteractionTokens() {
        return mVimeoApiInteractionTokens;
    }

    public void setVimeoApiInteractionTokens(Object vimeoApiInteractionTokens) {
        mVimeoApiInteractionTokens = vimeoApiInteractionTokens;
    }

    public Long getWatchLater() {
        return mWatchLater;
    }

    public void setWatchLater(Long watchLater) {
        mWatchLater = watchLater;
    }

}
