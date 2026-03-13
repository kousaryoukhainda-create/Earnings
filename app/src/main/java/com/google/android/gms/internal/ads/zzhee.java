package com.google.android.gms.internal.ads;

import android.util.Log;
/* loaded from: classes3.dex */
public final class zzhee extends zzhej {
    final String zza;

    public zzhee(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzhej
    public final void zza(String str) {
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 1);
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
