package com.iniyan.videoview.NetworkClient;

import com.iniyan.videoview.model.Response;

import retrofit2.Call;
import retrofit2.http.GET;

public interface VideoDataService {
    @GET("/config?autopause=1&byline=0&collections=1&context=Vimeo%5CController%5CClipController.main&default_to_hd=1&outro=nothing&portrait=0&share=1&title=0&watch_trailer=0&s=856fdc50fb560c42e3b383d4de7fbac6c4a5e4f0_1579811076")
    Call<Response> getAllResponse();


}
