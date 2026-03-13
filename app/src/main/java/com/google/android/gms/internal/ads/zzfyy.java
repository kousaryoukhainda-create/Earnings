package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* loaded from: classes3.dex */
public abstract class zzfyy implements Comparator {
    public static zzfyy zzb(Comparator comparator) {
        return new zzfwy(comparator);
    }

    public static zzfyy zzc() {
        return zzfyw.zza;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzfyy zza() {
        return new zzfzh(this);
    }
}
