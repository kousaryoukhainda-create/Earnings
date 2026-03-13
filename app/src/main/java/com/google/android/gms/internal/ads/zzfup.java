package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes3.dex */
final class zzfup implements Serializable, zzfuo {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzfup) {
            return this.zza.equals(((zzfup) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.zza) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfuo
    public final boolean zza(Object obj) {
        for (int i = 0; i < this.zza.size(); i++) {
            if (!((zzfuo) this.zza.get(i)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
