package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzdic {
    private zzbft zza;

    public zzdic(zzdhn zzdhnVar) {
        this.zza = zzdhnVar;
    }

    public final synchronized zzbft zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbft zzbftVar) {
        this.zza = zzbftVar;
    }
}
