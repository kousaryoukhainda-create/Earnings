package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* loaded from: classes3.dex */
public final class zzevn implements zzetr {
    public zzevn(zzbza zzbzaVar, zzgcs zzgcsVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final InterfaceFutureC2490qH zzb() {
        final InterfaceFutureC2490qH zzh = zzgch.zzh(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfJ)).booleanValue()) {
            zzh = zzgch.zzh(null);
        }
        final InterfaceFutureC2490qH zzh2 = zzgch.zzh(null);
        return zzgch.zzc(zzh, zzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzevm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzevo((String) InterfaceFutureC2490qH.this.get(), (String) zzh2.get());
            }
        }, zzbzw.zza);
    }
}
