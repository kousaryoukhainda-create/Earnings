package com.google.android.gms.internal.ads;

import com.fyber.fairbid.internal.Framework;
/* loaded from: classes3.dex */
public enum zzfks {
    HTML("html"),
    NATIVE(Framework.NATIVE),
    JAVASCRIPT("javascript");
    
    private final String zze;

    zzfks(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
