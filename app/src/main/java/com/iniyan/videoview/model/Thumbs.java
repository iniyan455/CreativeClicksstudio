
package com.iniyan.videoview.model;


import com.google.gson.annotations.SerializedName;

public class Thumbs {

    @SerializedName("1280")
    private String m280;
    @SerializedName("640")
    private String m40;
    @SerializedName("960")
    private String m60;
    @SerializedName("base")
    private String mBase;

    public String get280() {
        return m280;
    }


    public String get40() {
        return m40;
    }



    public String get60() {
        return m60;
    }


    public String getBase() {
        return mBase;
    }

    public void setBase(String base) {
        mBase = base;
    }

}
