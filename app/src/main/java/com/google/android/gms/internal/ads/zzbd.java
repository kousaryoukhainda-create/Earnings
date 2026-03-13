package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* loaded from: classes3.dex */
public class zzbd extends Exception {
    public final int zza;
    public final long zzb;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public zzbd(String str, Throwable th, int i, Bundle bundle, long j) {
        super(str, th);
        this.zza = i;
        this.zzb = j;
    }
}
