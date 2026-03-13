package com.google.android.gms.internal.ads;

import com.google.android.gms.tagmanager.DataLayer;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcda implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ int zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ zzcde zzj;

    public zzcda(zzcde zzcdeVar, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = j;
        this.zzf = j2;
        this.zzg = z;
        this.zzh = i3;
        this.zzi = i4;
        this.zzj = zzcdeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        HashMap o = AbstractC0324Hi.o(DataLayer.EVENT_KEY, "precacheProgress");
        o.put("src", this.zza);
        o.put("cachedSrc", this.zzb);
        o.put("bytesLoaded", Integer.toString(this.zzc));
        o.put("totalBytes", Integer.toString(this.zzd));
        o.put("bufferedDuration", Long.toString(this.zze));
        o.put("totalDuration", Long.toString(this.zzf));
        if (true != this.zzg) {
            str = "0";
        } else {
            str = "1";
        }
        o.put("cacheReady", str);
        o.put("playerCount", Integer.toString(this.zzh));
        o.put("playerPreparedCount", Integer.toString(this.zzi));
        zzcde.zze(this.zzj, "onPrecacheEvent", o);
    }
}
