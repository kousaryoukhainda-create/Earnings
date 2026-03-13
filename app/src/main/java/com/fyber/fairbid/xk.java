package com.fyber.fairbid;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.BannerErrorCode;
/* loaded from: classes.dex */
public final /* synthetic */ class xk {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[BannerErrorCode.values().length];
        try {
            iArr[BannerErrorCode.WEBVIEW_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BannerErrorCode.NATIVE_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BannerErrorCode.NO_FILL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BannerErrorCode.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[UnityAds.UnityAdsLoadError.values().length];
        try {
            iArr2[UnityAds.UnityAdsLoadError.NO_FILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[UnityAds.UnityAdsLoadError.INITIALIZE_FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[UnityAds.UnityAdsLoadError.INTERNAL_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[UnityAds.UnityAdsLoadError.INVALID_ARGUMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[UnityAds.UnityAdsLoadError.TIMEOUT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        b = iArr2;
        int[] iArr3 = new int[UnityAds.UnityAdsShowError.values().length];
        try {
            iArr3[UnityAds.UnityAdsShowError.NOT_INITIALIZED.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[UnityAds.UnityAdsShowError.NOT_READY.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[UnityAds.UnityAdsShowError.NO_CONNECTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[UnityAds.UnityAdsShowError.ALREADY_SHOWING.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[UnityAds.UnityAdsShowError.INVALID_ARGUMENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[UnityAds.UnityAdsShowError.VIDEO_PLAYER_ERROR.ordinal()] = 6;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[UnityAds.UnityAdsShowError.INTERNAL_ERROR.ordinal()] = 7;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[UnityAds.UnityAdsShowError.TIMEOUT.ordinal()] = 8;
        } catch (NoSuchFieldError unused17) {
        }
        c = iArr3;
    }
}
