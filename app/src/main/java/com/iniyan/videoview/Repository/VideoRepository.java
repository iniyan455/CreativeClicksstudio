package com.iniyan.videoview.Repository;

import androidx.lifecycle.MutableLiveData;

import com.iniyan.videoview.NetworkClient.RetrofitClient;
import com.iniyan.videoview.NetworkClient.VideoDataService;
import com.iniyan.videoview.model.DataList;
import com.iniyan.videoview.model.Response;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class VideoRepository {
    private static final String TAG = "EmployeeRepository";
    private ArrayList<Response> employees = new ArrayList<>();
    private MutableLiveData<List<DataList>> mutableLiveData = new MutableLiveData<>();

    private MutableLiveData<String> mutableLiveDataUrl = new MutableLiveData<>();

    public VideoRepository() {
    }

    public MutableLiveData<String> getMutableLiveData(int pos) {
        final VideoDataService userDataService = RetrofitClient.getService();
        Call<Response> call = null;
        switch (pos) {
            case 0:

                call = userDataService.getVideoResponse45();
                break;

            case 1:

                call = userDataService.getVideoResponse49();
                break;

            case 2:

                call = userDataService.getVideoResponse57();
                break;

            case 3:

                call = userDataService.getVideoResponse69();
                break;
            case 4:

                call = userDataService.getVideoResponse31();
                break;
        }

        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                String responseUrl = response.body().getRequest().getFiles().getProgressive().get(0).getUrl();
                if (responseUrl != null) {
                    mutableLiveDataUrl.setValue(responseUrl);
                }
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

            }
        });


        return mutableLiveDataUrl;
    }


    public MutableLiveData<List<DataList>> getTemporaryList() {

        List<DataList> data = new ArrayList<>();
        data.add(new DataList("RPA vs Traditional Automation", "https://i.vimeocdn.com/video/792292754_960.jpg", "https://vod-progressive.akamaized.net/exp=1579728136~acl=%2A%2F1374049858.mp4%2A~hmac=3f833f3332533980ee8701c1d7c4d01727527e8a22397003c20f2dd7db71e423/vimeo-prod-skyfire-std-us/01/3641/13/343207257/1374049858.mp4"));
        data.add(new DataList("ExcelPluginDemo3mn", "https://i.vimeocdn.com/video/821628595_960.jpg", "https://vod-progressive.akamaized.net/exp=1579727547~acl=%2A%2F1508719361.mp4%2A~hmac=075da7b19fed7ec7c16726d856810a092f6207d79b4011a52c7f8b0d0eea0bfc/vimeo-prod-skyfire-std-us/01/3158/14/365792949/1508719361.mp4"));
        data.add(new DataList("DYK_1_Automation_Anywhere_Enterprise_11_V2", "https://i.vimeocdn.com/video/798676733_960.jpg", "https://vod-progressive.akamaized.net/exp=1579728218~acl=%2A%2F1404599913.mp4%2A~hmac=cd3b902fe5e5580f967b92e3d4626f50877b49a7a8b2a79c953a495e3f3cd48b/vimeo-prod-skyfire-std-us/01/4627/13/348138769/1404599913.mp4"));
        data.add(new DataList("Operational Analytics through Automation Anywhere", "https://i.vimeocdn.com/video/792292015_960.jpg", "https://vod-progressive.akamaized.net/exp=1579728369~acl=%2A%2F1374046521.mp4%2A~hmac=ba5a88133dd0b7ac9ee43a4b8612b79289c366903dcbde5fbd42da773938ea98/vimeo-prod-skyfire-std-us/01/3641/13/343206745/1374046521.mp4"));
        data.add(new DataList("Operational Analytics through Automation Anywhere", "https://i.vimeocdn.com/video/792292015_960.jpg", "https://vod-progressive.akamaized.net/exp=1579728369~acl=%2A%2F1374046520.mp4%2A~hmac=6cb410b2b99f2b086494b0bf8f101c03983f88fb67127a16ed41ca5c06d21666/vimeo-prod-skyfire-std-us/01/3641/13/343206745/1374046520.mp4"));
        mutableLiveData.setValue(data);
        return mutableLiveData;
    }
}
