package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public final class zzfgd {
    final /* synthetic */ zzfgf zza;
    private final Object zzb;
    private final String zzc;
    private final InterfaceFutureC2490qH zzd;
    private final List zze;
    private final InterfaceFutureC2490qH zzf;

    private zzfgd(zzfgf zzfgfVar, Object obj, String str, InterfaceFutureC2490qH interfaceFutureC2490qH, List list, InterfaceFutureC2490qH interfaceFutureC2490qH2) {
        this.zza = zzfgfVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = interfaceFutureC2490qH;
        this.zze = list;
        this.zzf = interfaceFutureC2490qH2;
    }

    public final zzfft zza() {
        zzfgg zzfggVar;
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzf(obj);
        }
        final zzfft zzfftVar = new zzfft(obj, str, this.zzf);
        zzfggVar = this.zza.zzd;
        zzfggVar.zza(zzfftVar);
        InterfaceFutureC2490qH interfaceFutureC2490qH = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgb
            @Override // java.lang.Runnable
            public final void run() {
                zzfgg zzfggVar2;
                zzfggVar2 = zzfgd.this.zza.zzd;
                zzfggVar2.zzc(zzfftVar);
            }
        };
        zzgcs zzgcsVar = zzbzw.zzg;
        interfaceFutureC2490qH.addListener(runnable, zzgcsVar);
        zzgch.zzr(zzfftVar, new zzfgc(this, zzfftVar), zzgcsVar);
        return zzfftVar;
    }

    public final zzfgd zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzfgd zzc(Class cls, zzgbo zzgboVar) {
        zzgcs zzgcsVar;
        zzgcsVar = this.zza.zzb;
        return new zzfgd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgch.zzf(this.zzf, cls, zzgboVar, zzgcsVar));
    }

    public final zzfgd zzd(final InterfaceFutureC2490qH interfaceFutureC2490qH) {
        return zzg(new zzgbo() { // from class: com.google.android.gms.internal.ads.zzfga
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final InterfaceFutureC2490qH zza(Object obj) {
                return InterfaceFutureC2490qH.this;
            }
        }, zzbzw.zzg);
    }

    public final zzfgd zze(final zzffr zzffrVar) {
        return zzf(new zzgbo() { // from class: com.google.android.gms.internal.ads.zzffz
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final InterfaceFutureC2490qH zza(Object obj) {
                return zzgch.zzh(zzffr.this.zza(obj));
            }
        });
    }

    public final zzfgd zzf(zzgbo zzgboVar) {
        zzgcs zzgcsVar;
        zzgcsVar = this.zza.zzb;
        return zzg(zzgboVar, zzgcsVar);
    }

    public final zzfgd zzg(zzgbo zzgboVar, Executor executor) {
        return new zzfgd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgch.zzn(this.zzf, zzgboVar, executor));
    }

    public final zzfgd zzh(String str) {
        return new zzfgd(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfgd zzi(long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.zza.zzc;
        return new zzfgd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgch.zzo(this.zzf, j, timeUnit, scheduledExecutorService));
    }
}
