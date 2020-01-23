package com.iniyan.videoview.Adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.iniyan.videoview.R;
import com.iniyan.videoview.databinding.VideoListItemBinding;
import com.iniyan.videoview.model.DataList;

import java.util.List;

public class VideoDataAdapter
        extends RecyclerView.Adapter<VideoDataAdapter.VideoViewHolder> {
    private List<DataList> dataList;


    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        VideoListItemBinding videoListItemBinding =
                DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()),
                        R.layout.video_list_item, viewGroup, false);
        return new VideoViewHolder(videoListItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder videoViewHolder, int i) {
        DataList dataItem = dataList.get(i);
        videoViewHolder.videoListItemBinding.setDataList(dataItem);
    }

    @Override
    public int getItemCount() {
        if (dataList != null) {
            return dataList.size();
        } else {
            return 0;
        }
    }

    public void setVideoList(List<DataList> dataList) {
        this.dataList = dataList;
        notifyDataSetChanged();
    }


    public List<DataList> getList() {
        return dataList;

    }

    class VideoViewHolder extends RecyclerView.ViewHolder {
        private VideoListItemBinding videoListItemBinding;

        public VideoViewHolder(@NonNull VideoListItemBinding videoListItemBinding) {
            super(videoListItemBinding.getRoot());
            this.videoListItemBinding = videoListItemBinding;
        }
    }
}