package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes3.dex */
public class zzfz extends IOException {
    public final int zza;

    public zzfz(int i) {
        this.zza = i;
    }

    public zzfz(String str, int i) {
        super(str);
        this.zza = i;
    }

    public zzfz(String str, Throwable th, int i) {
        super(str, th);
        this.zza = i;
    }

    public zzfz(Throwable th, int i) {
        super(th);
        this.zza = i;
    }
}
