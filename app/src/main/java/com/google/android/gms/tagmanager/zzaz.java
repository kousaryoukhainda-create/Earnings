package com.google.android.gms.tagmanager;
/* loaded from: classes3.dex */
final class zzaz implements Runnable {
    final /* synthetic */ zzav zza;
    final /* synthetic */ zzbd zzb;

    public zzaz(zzbd zzbdVar, zzav zzavVar) {
        this.zzb = zzbdVar;
        this.zza = zzavVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(zzbd.zzf(this.zzb));
    }
}
