package com.google.android.gms.internal.ads;

import com.google.android.gms.tagmanager.DataLayer;
import java.util.HashMap;
/* loaded from: classes3.dex */
final class zzccy implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ zzcde zze;

    public zzccy(zzcde zzcdeVar, String str, String str2, int i, int i2, boolean z) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = zzcdeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap o = AbstractC0324Hi.o(DataLayer.EVENT_KEY, "precacheProgress");
        o.put("src", this.zza);
        o.put("cachedSrc", this.zzb);
        o.put("bytesLoaded", Integer.toString(this.zzc));
        o.put("totalBytes", Integer.toString(this.zzd));
        o.put("cacheReady", "0");
        zzcde.zze(this.zze, "onPrecacheEvent", o);
    }
}
