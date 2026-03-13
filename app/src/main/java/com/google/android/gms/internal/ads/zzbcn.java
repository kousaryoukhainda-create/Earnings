package com.google.android.gms.internal.ads;

import android.os.StrictMode;
/* loaded from: classes3.dex */
public final class zzbcn {
    public static Object zza(zzfvf zzfvfVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return zzfvfVar.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
