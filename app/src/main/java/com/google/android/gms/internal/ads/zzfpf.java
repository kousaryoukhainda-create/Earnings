package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzfpf extends Exception {
    private final int zza;

    public zzfpf(int i, String str) {
        super(str);
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzfpf(int i, Throwable th) {
        super(th);
        this.zza = i;
    }
}
