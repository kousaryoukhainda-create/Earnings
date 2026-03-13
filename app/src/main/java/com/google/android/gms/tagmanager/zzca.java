package com.google.android.gms.tagmanager;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzca implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcb zzc;
    final /* synthetic */ zzcb zzd;

    public zzca(zzcb zzcbVar, zzcb zzcbVar2, long j, String str) {
        this.zzc = zzcbVar;
        this.zzd = zzcbVar2;
        this.zza = j;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcc zzccVar;
        zzcc zzccVar2;
        Context context;
        zzccVar = this.zzc.zze;
        if (zzccVar == null) {
            zzcb zzcbVar = this.zzc;
            zzcb zzcbVar2 = this.zzd;
            zzfe zzg = zzfe.zzg();
            context = zzcbVar.zzf;
            zzg.zzl(context, zzcbVar2);
            this.zzc.zze = zzg.zzf();
        }
        zzcb zzcbVar3 = this.zzc;
        long j = this.zza;
        String str = this.zzb;
        zzccVar2 = zzcbVar3.zze;
        zzccVar2.zzb(j, str);
    }
}
