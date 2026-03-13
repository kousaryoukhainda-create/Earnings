package com.google.android.gms.internal.ads;

import com.google.android.gms.tagmanager.DataLayer;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcdc implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzcde zzd;

    public zzcdc(zzcde zzcdeVar, String str, String str2, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = zzcdeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap o = AbstractC0324Hi.o(DataLayer.EVENT_KEY, "precacheComplete");
        o.put("src", this.zza);
        o.put("cachedSrc", this.zzb);
        o.put("totalDuration", Long.toString(this.zzc));
        zzcde.zze(this.zzd, "onPrecacheEvent", o);
    }
}
