package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;
/* loaded from: classes3.dex */
final class zzcao implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcaw zzb;

    public zzcao(zzcaw zzcawVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        this.zzb = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcax zzcaxVar;
        zzcax zzcaxVar2;
        zzcaw.zzl(this.zzb, this.zza);
        zzcaw zzcawVar = this.zzb;
        zzcaxVar = zzcawVar.zzq;
        if (zzcaxVar != null) {
            zzcaxVar2 = zzcawVar.zzq;
            zzcaxVar2.zzf();
        }
    }
}
