
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Cdns {

    @SerializedName("akfire_interconnect_quic")
    private AkfireInterconnectQuic mAkfireInterconnectQuic;
    @SerializedName("fastly_skyfire")
    private FastlySkyfire mFastlySkyfire;

    public AkfireInterconnectQuic getAkfireInterconnectQuic() {
        return mAkfireInterconnectQuic;
    }

    public void setAkfireInterconnectQuic(AkfireInterconnectQuic akfireInterconnectQuic) {
        mAkfireInterconnectQuic = akfireInterconnectQuic;
    }

    public FastlySkyfire getFastlySkyfire() {
        return mFastlySkyfire;
    }

    public void setFastlySkyfire(FastlySkyfire fastlySkyfire) {
        mFastlySkyfire = fastlySkyfire;
    }

}
