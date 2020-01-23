package com.iniyan.videoview.NetworkClient;

import com.iniyan.videoview.model.Response;

import retrofit2.Call;
import retrofit2.http.GET;

public interface VideoDataService {
    @GET("343206745/config?autopause=1&byline=0&collections=1&context=Vimeo%5CController%5CClipController.main&default_to_hd=1&outro=nothing&portrait=0&share=1&title=0&watch_trailer=0&s=9264026dd13590bdc0849e8ca20b9adf0b05501f_1579854723")
    Call<Response> getVideoResponse45();

    @GET("365792949/config?autopause=1&byline=0&collections=1&context=Vimeo%5CController%5CClipController.main&default_to_hd=1&outro=nothing&portrait=0&share=1&title=0&watch_trailer=0&s=d082298a50012e8065087549fe043c7a37b0a2d3_1579854570")
    Call<Response> getVideoResponse49();

    @GET("343207257/config?autopause=1&byline=0&collections=1&context=Vimeo%5CController%5CClipController.main&default_to_hd=1&outro=nothing&portrait=0&share=1&title=0&watch_trailer=0&s=78484183d78e69529b4f0f7055150831a84c7dd9_1579854640")
    Call<Response> getVideoResponse57();
    @GET("348138769/config?autopause=1&byline=0&collections=1&context=Vimeo%5CController%5CClipController.main&default_to_hd=1&outro=nothing&portrait=0&share=1&title=0&watch_trailer=0&s=4f4823b954a9aa2e5ce48215948edc386c496144_1579854690")
    Call<Response> getVideoResponse69();
    @GET("348139431/config?autopause=1&byline=0&collections=1&context=Vimeo%5CController%5CClipController.main&default_to_hd=1&outro=nothing&portrait=0&share=1&title=0&watch_trailer=0&s=6f14d31cd30f812cef0618473f3f7c1b995062e2_1579854770")
    Call<Response> getVideoResponse31();

}

