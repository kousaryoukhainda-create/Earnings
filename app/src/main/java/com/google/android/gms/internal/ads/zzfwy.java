package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;
/* loaded from: classes3.dex */
final class zzfwy extends zzfyy implements Serializable {
    final Comparator zza;

    public zzfwy(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzfyy, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfwy) {
            return this.zza.equals(((zzfwy) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }
}
