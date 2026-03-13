package com.google.android.gms.internal.ads;

import java.util.HashMap;
/* loaded from: classes3.dex */
public final class zzavj extends zzatq {
    public long zza;
    public long zzb;

    public zzavj() {
        this.zza = -1L;
        this.zzb = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzatq
    public final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Long.valueOf(this.zza));
        hashMap.put(1, Long.valueOf(this.zzb));
        return hashMap;
    }

    public zzavj(String str) {
        this.zza = -1L;
        this.zzb = -1L;
        HashMap zza = zzatq.zza(str);
        if (zza != null) {
            this.zza = ((Long) zza.get(0)).longValue();
            this.zzb = ((Long) zza.get(1)).longValue();
        }
    }
}
