package com.google.android.gms.internal.ads;

import android.os.Handler;
/* loaded from: classes3.dex */
public final class zzpe {
    private final Handler zza;
    private final zzpf zzb;

    public zzpe(Handler handler, zzpf zzpfVar) {
        this.zza = zzpfVar == null ? null : handler;
        this.zzb = zzpfVar;
    }

    public final void zza(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoy
                @Override // java.lang.Runnable
                public final void run() {
                    zzpe.this.zzj(exc);
                }
            });
        }
    }

    public final void zzb(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoz
                @Override // java.lang.Runnable
                public final void run() {
                    zzpe.this.zzk(exc);
                }
            });
        }
    }

    public final void zzc(final zzpg zzpgVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzow
                @Override // java.lang.Runnable
                public final void run() {
                    zzpe.this.zzl(zzpgVar);
                }
            });
        }
    }

    public final void zzd(final zzpg zzpgVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzox
                @Override // java.lang.Runnable
                public final void run() {
                    zzpe.this.zzm(zzpgVar);
                }
            });
        }
    }

    public final void zze(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpc
                @Override // java.lang.Runnable
                public final void run() {
                    zzpe.this.zzn(str, j, j2);
                }
            });
        }
    }

    public final void zzf(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpd
                @Override // java.lang.Runnable
                public final void run() {
                    zzpe.this.zzo(str);
                }
            });
        }
    }

    public final void zzg(final zzhs zzhsVar) {
        zzhsVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzot
                @Override // java.lang.Runnable
                public final void run() {
                    zzpe.this.zzp(zzhsVar);
                }
            });
        }
    }

    public final void zzh(final zzhs zzhsVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzos
                @Override // java.lang.Runnable
                public final void run() {
                    zzpe.this.zzq(zzhsVar);
                }
            });
        }
    }

    public final void zzi(final zzab zzabVar, final zzht zzhtVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpa
                @Override // java.lang.Runnable
                public final void run() {
                    zzpe.this.zzr(zzabVar, zzhtVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzj(Exception exc) {
        int i = zzei.zza;
        this.zzb.zza(exc);
    }

    public final /* synthetic */ void zzk(Exception exc) {
        int i = zzei.zza;
        this.zzb.zzh(exc);
    }

    public final /* synthetic */ void zzl(zzpg zzpgVar) {
        int i = zzei.zza;
        this.zzb.zzi(zzpgVar);
    }

    public final /* synthetic */ void zzm(zzpg zzpgVar) {
        int i = zzei.zza;
        this.zzb.zzj(zzpgVar);
    }

    public final /* synthetic */ void zzn(String str, long j, long j2) {
        int i = zzei.zza;
        this.zzb.zzb(str, j, j2);
    }

    public final /* synthetic */ void zzo(String str) {
        int i = zzei.zza;
        this.zzb.zzc(str);
    }

    public final /* synthetic */ void zzp(zzhs zzhsVar) {
        zzhsVar.zza();
        int i = zzei.zza;
        this.zzb.zzd(zzhsVar);
    }

    public final /* synthetic */ void zzq(zzhs zzhsVar) {
        int i = zzei.zza;
        this.zzb.zze(zzhsVar);
    }

    public final /* synthetic */ void zzr(zzab zzabVar, zzht zzhtVar) {
        int i = zzei.zza;
        this.zzb.zzf(zzabVar, zzhtVar);
    }

    public final /* synthetic */ void zzs(long j) {
        int i = zzei.zza;
        this.zzb.zzg(j);
    }

    public final /* synthetic */ void zzt(boolean z) {
        int i = zzei.zza;
        this.zzb.zzn(z);
    }

    public final /* synthetic */ void zzu(int i, long j, long j2) {
        int i2 = zzei.zza;
        this.zzb.zzk(i, j, j2);
    }

    public final void zzv(final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzou
                @Override // java.lang.Runnable
                public final void run() {
                    zzpe.this.zzs(j);
                }
            });
        }
    }

    public final void zzw(final boolean z) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpb
                @Override // java.lang.Runnable
                public final void run() {
                    zzpe.this.zzt(z);
                }
            });
        }
    }

    public final void zzx(final int i, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzov
                @Override // java.lang.Runnable
                public final void run() {
                    zzpe.this.zzu(i, j, j2);
                }
            });
        }
    }
}
