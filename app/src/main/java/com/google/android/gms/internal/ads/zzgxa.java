package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
final class zzgxa {
    private final Object zza;
    private final int zzb;

    public zzgxa(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgxa)) {
            return false;
        }
        zzgxa zzgxaVar = (zzgxa) obj;
        if (this.zza != zzgxaVar.zza || this.zzb != zzgxaVar.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
