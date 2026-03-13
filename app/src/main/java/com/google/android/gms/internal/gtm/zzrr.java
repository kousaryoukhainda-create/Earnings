package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.Map;
/* loaded from: classes3.dex */
public final class zzrr {
    private final Map zza;
    private final zzam zzb;

    public /* synthetic */ zzrr(Map map, zzam zzamVar, zzrq zzrqVar) {
        this.zza = map;
        this.zzb = zzamVar;
    }

    public static zzrt zzb() {
        return new zzrt(null);
    }

    public final String toString() {
        return AbstractC2437ph.i("Properties: ", String.valueOf(Collections.unmodifiableMap(this.zza)), " pushAfterEvaluate: ", String.valueOf(this.zzb));
    }

    public final zzam zza() {
        return this.zzb;
    }

    public final Map zzc() {
        return Collections.unmodifiableMap(this.zza);
    }

    public final void zzd(String str, zzam zzamVar) {
        this.zza.put(str, zzamVar);
    }
}
