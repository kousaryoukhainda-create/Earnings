package com.google.android.gms.internal.gtm;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class zzrt {
    private final Map zza = new HashMap();
    private zzam zzb;

    private zzrt() {
    }

    public final zzrr zza() {
        return new zzrr(this.zza, this.zzb, null);
    }

    public final zzrt zzb(String str, zzam zzamVar) {
        this.zza.put(str, zzamVar);
        return this;
    }

    public final zzrt zzc(zzam zzamVar) {
        this.zzb = zzamVar;
        return this;
    }

    public /* synthetic */ zzrt(zzrs zzrsVar) {
    }
}
