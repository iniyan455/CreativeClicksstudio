
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Owner {

    @SerializedName("account_type")
    private String mAccountType;
    @SerializedName("id")
    private Long mId;
    @SerializedName("img")
    private String mImg;
    @SerializedName("img_2x")
    private String mImg2X;
    @SerializedName("name")
    private String mName;
    @SerializedName("url")
    private String mUrl;

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

    public String getImg() {
        return mImg;
    }

    public void setImg(String img) {
        mImg = img;
    }

    public String getImg2X() {
        return mImg2X;
    }

    public void setImg2X(String img2X) {
        mImg2X = img2X;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

}
