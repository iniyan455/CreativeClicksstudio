
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Urls {

    @SerializedName("barebone_js")
    private String mBareboneJs;
    @SerializedName("chromeless_css")
    private String mChromelessCss;
    @SerializedName("chromeless_js")
    private String mChromelessJs;
    @SerializedName("css")
    private String mCss;
    @SerializedName("fresnel")
    private String mFresnel;
    @SerializedName("fresnel_chunk_url")
    private String mFresnelChunkUrl;
    @SerializedName("fresnel_manifest_url")
    private String mFresnelManifestUrl;
    @SerializedName("js")
    private String mJs;
    @SerializedName("js_base")
    private String mJsBase;
    @SerializedName("mux_url")
    private String mMuxUrl;
    @SerializedName("proxy")
    private String mProxy;
    @SerializedName("sentry_url")
    private String mSentryUrl;
    @SerializedName("test_imp")
    private String mTestImp;
    @SerializedName("three_js")
    private String mThreeJs;
    @SerializedName("vuid_js")
    private String mVuidJs;

    public String getBareboneJs() {
        return mBareboneJs;
    }

    public void setBareboneJs(String bareboneJs) {
        mBareboneJs = bareboneJs;
    }

    public String getChromelessCss() {
        return mChromelessCss;
    }

    public void setChromelessCss(String chromelessCss) {
        mChromelessCss = chromelessCss;
    }

    public String getChromelessJs() {
        return mChromelessJs;
    }

    public void setChromelessJs(String chromelessJs) {
        mChromelessJs = chromelessJs;
    }

    public String getCss() {
        return mCss;
    }

    public void setCss(String css) {
        mCss = css;
    }

    public String getFresnel() {
        return mFresnel;
    }

    public void setFresnel(String fresnel) {
        mFresnel = fresnel;
    }

    public String getFresnelChunkUrl() {
        return mFresnelChunkUrl;
    }

    public void setFresnelChunkUrl(String fresnelChunkUrl) {
        mFresnelChunkUrl = fresnelChunkUrl;
    }

    public String getFresnelManifestUrl() {
        return mFresnelManifestUrl;
    }

    public void setFresnelManifestUrl(String fresnelManifestUrl) {
        mFresnelManifestUrl = fresnelManifestUrl;
    }

    public String getJs() {
        return mJs;
    }

    public void setJs(String js) {
        mJs = js;
    }

    public String getJsBase() {
        return mJsBase;
    }

    public void setJsBase(String jsBase) {
        mJsBase = jsBase;
    }

    public String getMuxUrl() {
        return mMuxUrl;
    }

    public void setMuxUrl(String muxUrl) {
        mMuxUrl = muxUrl;
    }

    public String getProxy() {
        return mProxy;
    }

    public void setProxy(String proxy) {
        mProxy = proxy;
    }

    public String getSentryUrl() {
        return mSentryUrl;
    }

    public void setSentryUrl(String sentryUrl) {
        mSentryUrl = sentryUrl;
    }

    public String getTestImp() {
        return mTestImp;
    }

    public void setTestImp(String testImp) {
        mTestImp = testImp;
    }

    public String getThreeJs() {
        return mThreeJs;
    }

    public void setThreeJs(String threeJs) {
        mThreeJs = threeJs;
    }

    public String getVuidJs() {
        return mVuidJs;
    }

    public void setVuidJs(String vuidJs) {
        mVuidJs = vuidJs;
    }

}
