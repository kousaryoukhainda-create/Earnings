package com.google.android.gms.internal.gtm;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzyu {
    private static final zzyu zza = new zzyq(null);
    private static final zzyu zzb = new zzys(null);

    public /* synthetic */ zzyu(zzyt zzytVar) {
    }

    public static zzyu zzd() {
        return zza;
    }

    public static zzyu zze() {
        return zzb;
    }

    public abstract List zza(Object obj, long j);

    public abstract void zzb(Object obj, long j);

    public abstract void zzc(Object obj, Object obj2, long j);
}
