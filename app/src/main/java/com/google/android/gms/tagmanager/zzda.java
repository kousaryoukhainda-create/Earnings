package com.google.android.gms.tagmanager;

import android.annotation.TargetApi;
import android.util.LruCache;
@TargetApi(12)
/* loaded from: classes3.dex */
final class zzda {
    private final LruCache zza;

    public zzda(int i, zzq zzqVar) {
        this.zza = new zzcz(this, 1048576, zzqVar);
    }

    public final Object zza(Object obj) {
        return this.zza.get(obj);
    }

    public final void zzb(Object obj, Object obj2) {
        this.zza.put(obj, obj2);
    }
}
