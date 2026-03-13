package com.google.android.gms.tagmanager;

import android.util.LruCache;
/* loaded from: classes3.dex */
final class zzcz extends LruCache {
    final /* synthetic */ zzq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcz(zzda zzdaVar, int i, zzq zzqVar) {
        super(1048576);
        this.zza = zzqVar;
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        return this.zza.zza(obj, obj2);
    }
}
