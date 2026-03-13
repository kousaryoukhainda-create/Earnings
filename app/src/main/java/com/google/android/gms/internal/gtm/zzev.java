package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.ShowFirstParty;
@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzev {
    private final zzeu zza;
    private final Object zzb;
    private final Object zzc;
    private final Object zzd = new Object();

    private zzev(Object obj, Object obj2, zzeu zzeuVar) {
        this.zzb = obj;
        this.zzc = obj2;
        this.zza = zzeuVar;
    }

    public static zzev zza(Object obj, Object obj2, zzeu zzeuVar) {
        return new zzev(obj, obj2, zzeuVar);
    }

    public final Object zzb() {
        synchronized (this.zzd) {
        }
        return this.zzb;
    }
}
