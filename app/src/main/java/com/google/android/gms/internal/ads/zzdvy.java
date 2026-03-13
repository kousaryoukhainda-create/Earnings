package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public class zzdvy extends Exception {
    private final int zza;

    public zzdvy(int i) {
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzdvy(int i, String str) {
        super(str);
        this.zza = i;
    }

    public zzdvy(int i, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
