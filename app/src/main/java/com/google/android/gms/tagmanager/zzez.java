package com.google.android.gms.tagmanager;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzez implements Runnable {
    final /* synthetic */ zzfe zza;

    public zzez(zzfe zzfeVar) {
        this.zza = zzfeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcc zzccVar;
        zzccVar = this.zza.zzd;
        zzccVar.zza();
    }
}
