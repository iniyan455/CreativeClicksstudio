
package com.iniyan.videoview.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Request {

    @SerializedName("ab_tests")
    private AbTests mAbTests;
    @SerializedName("build")
    private Build mBuild;
    @SerializedName("cookie")
    private Cookie mCookie;
    @SerializedName("cookie_domain")
    private String mCookieDomain;
    @SerializedName("country")
    private String mCountry;
    @SerializedName("currency")
    private String mCurrency;
    @SerializedName("expires")
    private Long mExpires;
    @SerializedName("file_codecs")
    private FileCodecs mFileCodecs;
    @SerializedName("files")
    private Files mFiles;
    @SerializedName("flags")
    private Flags mFlags;
    @SerializedName("gc_debug")
    private GcDebug mGcDebug;
    @SerializedName("lang")
    private String mLang;
    @SerializedName("referrer")
    private Object mReferrer;
    @SerializedName("sentry")
    private Sentry mSentry;
    @SerializedName("session")
    private String mSession;
    @SerializedName("signature")
    private String mSignature;
    @SerializedName("thumb_preview")
    private ThumbPreview mThumbPreview;
    @SerializedName("timestamp")
    private Long mTimestamp;
    @SerializedName("urls")
    private Urls mUrls;

    public AbTests getAbTests() {
        return mAbTests;
    }

    public void setAbTests(AbTests abTests) {
        mAbTests = abTests;
    }

    public Build getBuild() {
        return mBuild;
    }

    public void setBuild(Build build) {
        mBuild = build;
    }

    public Cookie getCookie() {
        return mCookie;
    }

    public void setCookie(Cookie cookie) {
        mCookie = cookie;
    }

    public String getCookieDomain() {
        return mCookieDomain;
    }

    public void setCookieDomain(String cookieDomain) {
        mCookieDomain = cookieDomain;
    }

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public String getCurrency() {
        return mCurrency;
    }

    public void setCurrency(String currency) {
        mCurrency = currency;
    }

    public Long getExpires() {
        return mExpires;
    }

    public void setExpires(Long expires) {
        mExpires = expires;
    }

    public FileCodecs getFileCodecs() {
        return mFileCodecs;
    }

    public void setFileCodecs(FileCodecs fileCodecs) {
        mFileCodecs = fileCodecs;
    }

    public Files getFiles() {
        return mFiles;
    }

    public void setFiles(Files files) {
        mFiles = files;
    }

    public Flags getFlags() {
        return mFlags;
    }

    public void setFlags(Flags flags) {
        mFlags = flags;
    }

    public GcDebug getGcDebug() {
        return mGcDebug;
    }

    public void setGcDebug(GcDebug gcDebug) {
        mGcDebug = gcDebug;
    }

    public String getLang() {
        return mLang;
    }

    public void setLang(String lang) {
        mLang = lang;
    }

    public Object getReferrer() {
        return mReferrer;
    }

    public void setReferrer(Object referrer) {
        mReferrer = referrer;
    }

    public Sentry getSentry() {
        return mSentry;
    }

    public void setSentry(Sentry sentry) {
        mSentry = sentry;
    }

    public String getSession() {
        return mSession;
    }

    public void setSession(String session) {
        mSession = session;
    }

    public String getSignature() {
        return mSignature;
    }

    public void setSignature(String signature) {
        mSignature = signature;
    }

    public ThumbPreview getThumbPreview() {
        return mThumbPreview;
    }

    public void setThumbPreview(ThumbPreview thumbPreview) {
        mThumbPreview = thumbPreview;
    }

    public Long getTimestamp() {
        return mTimestamp;
    }

    public void setTimestamp(Long timestamp) {
        mTimestamp = timestamp;
    }

    public Urls getUrls() {
        return mUrls;
    }

    public void setUrls(Urls urls) {
        mUrls = urls;
    }

}
