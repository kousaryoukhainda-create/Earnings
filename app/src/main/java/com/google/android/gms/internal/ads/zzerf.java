package com.google.android.gms.internal.ads;

import android.content.Context;
/* loaded from: classes3.dex */
public final class zzerf implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzerf(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4) {
        this.zza = zzhfjVar2;
        this.zzb = zzhfjVar3;
        this.zzc = zzhfjVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* renamed from: zza */
    public final zzerd zzb() {
        return new zzerd(zzffh.zzc(), ((zzcok) this.zza).zza(), (Context) this.zzb.zzb(), ((zzhff) this.zzc).zzb());
    }
}
