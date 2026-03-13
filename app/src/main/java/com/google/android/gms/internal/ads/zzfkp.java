package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.UUID;
/* loaded from: classes3.dex */
public abstract class zzfkp {
    public static zzfkp zza(zzfkq zzfkqVar, zzfkr zzfkrVar) {
        zzfmk.zza();
        return new zzfkt(zzfkqVar, zzfkrVar, UUID.randomUUID().toString());
    }

    public abstract void zzb(View view, zzfkw zzfkwVar, String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();
}
