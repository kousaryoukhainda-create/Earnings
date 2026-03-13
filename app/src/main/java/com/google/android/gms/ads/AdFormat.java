package com.google.android.gms.ads;
/* loaded from: classes3.dex */
public enum AdFormat {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);
    
    private final int zzb;

    AdFormat(int i) {
        this.zzb = i;
    }

    public static AdFormat getAdFormat(int i) {
        AdFormat[] values;
        for (AdFormat adFormat : values()) {
            if (adFormat.getValue() == i) {
                return adFormat;
            }
        }
        return null;
    }

    public int getValue() {
        return this.zzb;
    }
}
