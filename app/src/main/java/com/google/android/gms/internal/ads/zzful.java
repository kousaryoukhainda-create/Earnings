package com.google.android.gms.internal.ads;

import java.io.Serializable;
/* loaded from: classes3.dex */
public abstract class zzful implements Serializable {
    public static zzful zzc() {
        return zzftr.zza;
    }

    public static zzful zzd(Object obj) {
        if (obj == null) {
            return zzftr.zza;
        }
        return new zzfus(obj);
    }

    public abstract zzful zza(zzfuc zzfucVar);

    public abstract Object zzb(Object obj);
}
