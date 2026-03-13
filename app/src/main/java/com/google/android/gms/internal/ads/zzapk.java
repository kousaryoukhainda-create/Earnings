package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzapk implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzapm zzc;

    public zzapk(zzapm zzapmVar, String str, long j) {
        this.zza = str;
        this.zzb = j;
        this.zzc = zzapmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzapx zzapxVar;
        zzapx zzapxVar2;
        zzapxVar = this.zzc.zza;
        zzapxVar.zza(this.zza, this.zzb);
        zzapm zzapmVar = this.zzc;
        zzapxVar2 = zzapmVar.zza;
        zzapxVar2.zzb(zzapmVar.toString());
    }
}
