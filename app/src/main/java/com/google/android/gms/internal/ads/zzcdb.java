package com.google.android.gms.internal.ads;

import com.google.android.gms.tagmanager.DataLayer;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcdb implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ zzcde zzd;

    public zzcdb(zzcde zzcdeVar, String str, String str2, int i) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = zzcdeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap o = AbstractC0324Hi.o(DataLayer.EVENT_KEY, "precacheComplete");
        o.put("src", this.zza);
        o.put("cachedSrc", this.zzb);
        o.put("totalBytes", Integer.toString(this.zzc));
        zzcde.zze(this.zzd, "onPrecacheEvent", o);
    }
}
