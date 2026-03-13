package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes3.dex */
final class zzaog {
    public final int zza;
    public final long zzb;

    private zzaog(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public static zzaog zza(zzaco zzacoVar, zzdy zzdyVar) throws IOException {
        zzacoVar.zzh(zzdyVar.zzN(), 0, 8);
        zzdyVar.zzL(0);
        return new zzaog(zzdyVar.zzg(), zzdyVar.zzs());
    }
}
