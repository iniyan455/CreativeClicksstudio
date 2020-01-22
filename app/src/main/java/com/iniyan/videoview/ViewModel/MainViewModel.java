package com.iniyan.videoview.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.iniyan.videoview.Repository.VideoRepository;
import com.iniyan.videoview.model.DataList;

import java.util.List;

public class MainViewModel extends AndroidViewModel {
    private VideoRepository videoRepository;

    public MainViewModel(@NonNull Application application) {
        super(application);
        videoRepository = new VideoRepository();
    }

    public LiveData<List<DataList>> getAllVideos() {
        return videoRepository.getTemporaryList();
    }
}

