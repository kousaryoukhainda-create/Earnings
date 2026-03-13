package com.google.android.gms.internal.ads;

import java.util.Set;
/* loaded from: classes3.dex */
public final class zzesb implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzesb(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3) {
        this.zza = zzhfjVar2;
        this.zzb = zzhfjVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* renamed from: zza */
    public final zzerz zzb() {
        return new zzerz(zzffh.zzc(), ((zzche) this.zza).zza(), (Set) this.zzb.zzb());
    }
}
