package com.google.android.gms.internal.ads;

import java.io.Serializable;
/* loaded from: classes3.dex */
public final class zzfvj {
    public static zzfvf zza(zzfvf zzfvfVar) {
        if (!(zzfvfVar instanceof zzfvi) && !(zzfvfVar instanceof zzfvg)) {
            if (zzfvfVar instanceof Serializable) {
                return new zzfvg(zzfvfVar);
            }
            return new zzfvi(zzfvfVar);
        }
        return zzfvfVar;
    }
}
