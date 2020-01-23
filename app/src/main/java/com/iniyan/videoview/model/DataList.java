package com.iniyan.videoview.model;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.gson.annotations.SerializedName;
import com.iniyan.videoview.R;

public class DataList {
    public String getThumnail() {
        return thumnail;
    }

    public void setThumnail(String thumnail) {
        this.thumnail = thumnail;
    }

    public DataList(String title, String thumnail, String url) {
        this.title = title;
        this.thumnail = thumnail;
        this.url = url;

    }


    @SerializedName("thumnail")
    public String thumnail;
    // important code for loading image here
    @BindingAdapter({ "thumnail" })
    public static void loadImage(ImageView imageView, String imageURL) {
        Glide.with(imageView.getContext())
                .setDefaultRequestOptions(new RequestOptions()
                        .circleCrop())
                .load(imageURL)
                .placeholder(R.drawable.exo_edit_mode_logo)
                .into(imageView);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DataList() {
    }
    public String title;


    public String url;
    public String video_id;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVideo_id() {
        return video_id;
    }

    public void setVideo_id(String video_id) {
        this.video_id = video_id;
    }
}
