package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.internal.gtm.zzgc;
/* loaded from: classes3.dex */
final class zzfd implements zzfa {
    final /* synthetic */ zzfe zza;
    private final Handler zzb;

    public /* synthetic */ zzfd(zzfe zzfeVar, zzfc zzfcVar) {
        this.zza = zzfeVar;
        this.zzb = new zzgc(zzfe.zzd(zzfeVar).getMainLooper(), new zzfb(this));
    }

    private final Message zzd() {
        return this.zzb.obtainMessage(1, zzfe.zzh());
    }

    @Override // com.google.android.gms.tagmanager.zzfa
    public final void zza() {
        this.zzb.removeMessages(1, zzfe.zzh());
    }

    @Override // com.google.android.gms.tagmanager.zzfa
    public final void zzb() {
        this.zzb.removeMessages(1, zzfe.zzh());
        this.zzb.sendMessage(zzd());
    }

    @Override // com.google.android.gms.tagmanager.zzfa
    public final void zzc(long j) {
        this.zzb.removeMessages(1, zzfe.zzh());
        this.zzb.sendMessageDelayed(zzd(), 1800000L);
    }
}
