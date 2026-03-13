package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
final class zzcat implements Runnable {
    final /* synthetic */ zzcaw zza;

    public zzcat(zzcaw zzcawVar) {
        this.zza = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcax zzcaxVar;
        zzcax zzcaxVar2;
        zzcax zzcaxVar3;
        zzcaw zzcawVar = this.zza;
        zzcaxVar = zzcawVar.zzq;
        if (zzcaxVar != null) {
            zzcaxVar2 = zzcawVar.zzq;
            zzcaxVar2.zzd();
            zzcaxVar3 = this.zza.zzq;
            zzcaxVar3.zzi();
        }
    }
}
