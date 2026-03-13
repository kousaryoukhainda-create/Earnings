package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
/* loaded from: classes3.dex */
public final class zzeqv implements zzetr {
    private final Context zza;
    private final zzgcs zzb;

    public zzeqv(zzgcs zzgcsVar, Context context) {
        this.zzb = zzgcsVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 57;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final InterfaceFutureC2490qH zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzequ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqv.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeqw zzc() throws Exception {
        com.google.android.gms.ads.internal.zzv.zzq();
        return new zzeqw(com.google.android.gms.ads.internal.util.zzs.zzt(this.zza));
    }
}
