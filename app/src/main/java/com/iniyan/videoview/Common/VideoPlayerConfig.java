package com.iniyan.videoview.common;

import android.content.Context;
import android.net.ConnectivityManager;

public class VideoPlayerConfig {
    //Minimum Video you want to buffer while Playing
    public static final int MIN_BUFFER_DURATION = 3000;
    //Max Video you want to buffer during PlayBack
    public static final int MAX_BUFFER_DURATION = 5000;
    //Min Video you want to buffer before start Playing it
    public static final int MIN_PLAYBACK_START_BUFFER = 1500;
    //Min video You want to buffer when user resumes video
    public static final int MIN_PLAYBACK_RESUME_BUFFER = 5000;
    public static final String DEFAULT_VIDEO_URL =
            "https://vod-progressive.akamaized.net/exp=1579718455~acl=%2A%2F1374049858.mp4%2A~hmac=6eb3bed04ec2e7f672d9102a5c01f8539cc766768a72e854b207daf6c00780fe/vimeo-prod-skyfire-std-us/01/3641/13/343207257/1374049858.mp4";

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }
}