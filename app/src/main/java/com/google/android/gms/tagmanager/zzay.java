package com.google.android.gms.tagmanager;

import java.util.List;
/* loaded from: classes3.dex */
final class zzay implements Runnable {
    final /* synthetic */ List zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzbd zzc;

    public zzay(zzbd zzbdVar, List list, long j) {
        this.zzc = zzbdVar;
        this.zza = list;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzl(this.zza, this.zzb);
    }
}
