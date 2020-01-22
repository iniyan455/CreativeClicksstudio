
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Data {

    @SerializedName("city")
    private String mCity;
    @SerializedName("country_code")
    private String mCountryCode;
    @SerializedName("dash_pref_found")
    private Boolean mDashPrefFound;
    @SerializedName("hls_pref_found")
    private Boolean mHlsPrefFound;

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    public String getCountryCode() {
        return mCountryCode;
    }

    public void setCountryCode(String countryCode) {
        mCountryCode = countryCode;
    }

    public Boolean getDashPrefFound() {
        return mDashPrefFound;
    }

    public void setDashPrefFound(Boolean dashPrefFound) {
        mDashPrefFound = dashPrefFound;
    }

    public Boolean getHlsPrefFound() {
        return mHlsPrefFound;
    }

    public void setHlsPrefFound(Boolean hlsPrefFound) {
        mHlsPrefFound = hlsPrefFound;
    }

}
