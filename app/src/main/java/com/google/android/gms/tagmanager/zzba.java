package com.google.android.gms.tagmanager;
/* loaded from: classes3.dex */
final class zzba implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbd zzb;

    public zzba(zzbd zzbdVar, String str) {
        this.zzb = zzbdVar;
        this.zza = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbd.zzg(this.zzb, this.zza);
    }
}
