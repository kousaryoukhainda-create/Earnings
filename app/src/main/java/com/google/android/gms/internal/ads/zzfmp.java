package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfmp implements Runnable {
    final /* synthetic */ zzfmu zza;

    public zzfmp(zzfmu zzfmuVar) {
        this.zza = zzfmuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfmo zzfmoVar;
        zzfmoVar = this.zza.zzl;
        zzfmoVar.zzb();
    }
}
