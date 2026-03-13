package com.google.android.gms.analytics;

import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashSet;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzl implements Runnable {
    final /* synthetic */ zzh zza;
    final /* synthetic */ zzr zzb;

    public zzl(zzr zzrVar, zzh zzhVar) {
        this.zzb = zzrVar;
        this.zza = zzhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<zzs> list;
        zzh zzhVar = this.zza;
        zzhVar.zzd().zze(zzhVar);
        list = this.zzb.zzc;
        for (zzs zzsVar : list) {
            zzsVar.zza();
        }
        zzh zzhVar2 = this.zza;
        Preconditions.checkNotMainThread("deliver should be called from worker thread");
        Preconditions.checkArgument(zzhVar2.zzm(), "Measurement must be submitted");
        List<zzt> zzf = zzhVar2.zzf();
        if (!zzf.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (zzt zztVar : zzf) {
                Uri zzb = zztVar.zzb();
                if (!hashSet.contains(zzb)) {
                    hashSet.add(zzb);
                    zztVar.zze(zzhVar2);
                }
            }
        }
    }
}
