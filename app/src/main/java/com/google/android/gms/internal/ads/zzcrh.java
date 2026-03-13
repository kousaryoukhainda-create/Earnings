package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public final class zzcrh implements zzegr {
    public final List zza;

    public zzcrh(List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzegr
    public final void zzr() {
        for (InterfaceFutureC2490qH interfaceFutureC2490qH : this.zza) {
            zzgch.zzr(interfaceFutureC2490qH, new zzcrg(this), zzgcz.zzc());
        }
    }

    public zzcrh(zzcqz zzcqzVar) {
        this.zza = Collections.singletonList(zzgch.zzh(zzcqzVar));
    }
}
