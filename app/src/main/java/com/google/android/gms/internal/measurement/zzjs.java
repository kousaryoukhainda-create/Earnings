package com.google.android.gms.internal.measurement;

import android.net.Uri;
/* loaded from: classes3.dex */
public final class zzjs {
    private final Z10 zza;

    public zzjs(Z10 z10) {
        this.zza = z10;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        Z10 z10;
        if (uri != null) {
            z10 = (Z10) this.zza.getOrDefault(uri.toString(), null);
        } else {
            z10 = null;
        }
        if (z10 == null) {
            return null;
        }
        return (String) z10.getOrDefault("".concat(str3), null);
    }
}
