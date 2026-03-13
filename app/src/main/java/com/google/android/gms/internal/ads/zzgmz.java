package com.google.android.gms.internal.ads;

import java.util.Objects;
/* loaded from: classes3.dex */
final class zzgmz {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgmz(Class cls, Class cls2, zzgna zzgnaVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgmz)) {
            return false;
        }
        zzgmz zzgmzVar = (zzgmz) obj;
        if (!zzgmzVar.zza.equals(this.zza) || !zzgmzVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return AbstractC0324Hi.g(this.zza.getSimpleName(), " with primitive type: ", this.zzb.getSimpleName());
    }
}
