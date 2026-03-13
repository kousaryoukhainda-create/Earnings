package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
final class zzcap implements Runnable {
    final /* synthetic */ zzcaw zza;

    public zzcap(zzcaw zzcawVar) {
        this.zza = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcax zzcaxVar;
        zzcax zzcaxVar2;
        zzcaw zzcawVar = this.zza;
        zzcaxVar = zzcawVar.zzq;
        if (zzcaxVar != null) {
            zzcaxVar2 = zzcawVar.zzq;
            zzcaxVar2.zza();
        }
    }
}
