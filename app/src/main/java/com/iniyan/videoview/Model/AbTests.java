
package com.iniyan.videoview.model;


import com.google.gson.annotations.SerializedName;

public class AbTests {

    @SerializedName("cdn_preference")
    private CdnPreference mCdnPreference;
    @SerializedName("chromecast")
    private Chromecast mChromecast;

    public CdnPreference getCdnPreference() {
        return mCdnPreference;
    }

    public void setCdnPreference(CdnPreference cdnPreference) {
        mCdnPreference = cdnPreference;
    }

    public Chromecast getChromecast() {
        return mChromecast;
    }

    public void setChromecast(Chromecast chromecast) {
        mChromecast = chromecast;
    }

}
